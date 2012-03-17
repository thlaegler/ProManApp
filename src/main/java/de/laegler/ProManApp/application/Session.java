/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>Session.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.laegler.ProManApp.bean.PersonBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class Session {
	/** */
	private PersonBean user;
	private boolean loginFlag = false;

	private HttpServletResponse httpResponse;
	@SuppressWarnings("unused")
	private HttpServletRequest httpRequest;

	public Session() {

	}

	public void setHttpResponse(HttpServletResponse aHttpResponse) {
		this.httpResponse = aHttpResponse;
	}

	public void setHttpRequest(HttpServletRequest aHttpRequest) {
		this.httpRequest = aHttpRequest;
	}

	public HttpServletResponse getHttpResponse() {
		return this.httpResponse;
	}

	public PersonBean getUser() {
		return this.user;
	}

	public void setUser(PersonBean user) {
		this.user = user;
	}

	public boolean isLoginFlag() {
		return loginFlag;
	}

	public void setLoginFlag(boolean loginFlag) {
		this.loginFlag = loginFlag;
	}

}
