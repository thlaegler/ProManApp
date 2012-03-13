/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>UserModel.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import de.laegler.ProManApp.application.Relationship;
import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.bean.PersonBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class PersonModel extends ItemModel {

	/**
	 * 
	 */
	public PersonModel() {
		super();
	}

	/**
	 * 
	 * @param aItemBean
	 */
	public PersonModel(PersonBean aItemBean) {
		super(aItemBean);
	}

	/**
	 * 
	 * @param aEMail
	 * @return
	 */
	public ItemBean getItemByEMail(String aEMail) {
		return null;
	}

	@Override
	protected ItemBean getNewItemBean() {
		return new PersonBean();
	}

	@Override
	protected ItemBean buildItemBean(ResultSet aResultSet, ItemBean aBean) {
		aBean = super.buildItemBean(aResultSet, aBean);
		try {
			((PersonBean) aBean).setEMail(aResultSet.getString("eMail"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aBean;
	}

	@Override
	protected String getItemTable() {
		return "person";
	}

	public List<Relationship> getRelationsByItemId(int aItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ItemBean> getItemsByRelation(Object aRelation) {
		// TODO Auto-generated method stub
		return null;
	}
}
