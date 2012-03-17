/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.application;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.laegler.ProManApp.bean.PersonBean;

/**
 * Session
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class Session {

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