/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.bean;

/**
 * PersonBean
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class PersonBean extends ItemBean {

	protected String eMail;

	public void setEMail(String aEMail) {
		this.eMail = aEMail;
	}

	public String getEMail() {
		return eMail;
	}

}