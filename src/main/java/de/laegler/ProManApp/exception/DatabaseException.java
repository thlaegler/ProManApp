/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.exception;

/**
 * DatabaseException
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class DatabaseException extends Exception {

	private static final long serialVersionUID = -4874335188463833196L;

	public DatabaseException(String message, Throwable e) {
		super(message, e);
	}
}
