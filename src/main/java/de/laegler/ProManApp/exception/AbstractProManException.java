/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.exception;

/**
 * AbstractProManException
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class AbstractProManException extends Exception {

	private static final long serialVersionUID = -6519978597811131912L;

	public AbstractProManException(String message, Throwable e) {
		super(message, e);
	}

}
