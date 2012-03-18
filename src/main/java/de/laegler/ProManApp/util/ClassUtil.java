package de.laegler.ProManApp.util;

public final class ClassUtil {

	private ClassUtil() {
	}

	/**
	 * Look up the class in the Tread Context ClassLoader and in the "current"
	 * ClassLoader.
	 * 
	 * @param className
	 *            The class name to load
	 * @return the corresponding Class instance
	 * @throws ClassNotFoundException
	 *             if the Class was not found.
	 */
	@SuppressWarnings("rawtypes")
	public static Class forName(final String className)
			throws ClassNotFoundException {
		// Load classes from different classloaders :
		// 1. Thread Context ClassLoader
		// 2. ClassUtils ClassLoader

		ClassLoader tccl = Thread.currentThread().getContextClassLoader();
		Class cls = null;

		try {
			// Try with TCCL
			cls = Class.forName(className, true, tccl);
		} catch (ClassNotFoundException cnfe) {

			// Try now with the classloader used to load ClassUtils
			ClassLoader current = ClassUtil.class.getClassLoader();
			try {
				cls = Class.forName(className, true, current);
			} catch (ClassNotFoundException cnfe2) {
				// If this is still unknown, throw an Exception
				throw cnfe2;
			}
		}

		return cls;
	}

	/**
	 * Look up the class in the Tread Context ClassLoader and in the "current"
	 * ClassLoader.
	 * 
	 * @param className
	 *            The class name to load
	 * @param clazz
	 *            a class used to get classloader
	 * @return the corresponding Class instance
	 * @throws ClassNotFoundException
	 *             if the Class was not found.
	 */
	@SuppressWarnings("rawtypes")
	public static Class forName(final String className, final Class clazz)
			throws ClassNotFoundException {
		// Load classes from different classloaders :
		// 1. Thread Context ClassLoader
		// 2. ClassUtils ClassLoader

		ClassLoader tccl = Thread.currentThread().getContextClassLoader();
		Class cls = null;

		try {
			// Try with TCCL
			cls = Class.forName(className, true, tccl);
		} catch (ClassNotFoundException cnfe) {

			// Try now with the classloader used to load ClassUtils
			ClassLoader current = clazz.getClassLoader();
			if (current != null) {
				try {
					cls = Class.forName(className, true, current);
				} catch (ClassNotFoundException cnfe2) {
					// If this is still unknown, throw an Exception
					throw new ClassNotFoundException(
							"Class Not found in current ThreadClassLoader '"
									+ tccl + "' and in '" + current
									+ "' classloaders.", cnfe2);
				}
			} else {
				// rethrow exception
				throw cnfe;
			}
		}

		return cls;
	}
}