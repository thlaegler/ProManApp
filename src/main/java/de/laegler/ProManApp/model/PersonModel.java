/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.bean.PersonBean;

/**
 * PersonModel
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class PersonModel extends ItemModel {

	public PersonModel() {
		super();
	}

	public PersonModel(ItemBean aItemBean) {
		super(aItemBean);
	}

	// public ItemBean getItemByEMail(String aEMail) {
	// return null;
	// }

	@Override
	protected ItemBean getNewItemBean() {
		return new PersonBean();
	}

	@Override
	protected ItemBean buildItemBean(ResultSet aResultSet, ItemBean aItemBean) {
		aItemBean = super.buildItemBean(aResultSet, aItemBean);
		try {
			((PersonBean) aItemBean).setEMail(aResultSet.getString("eMail"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aItemBean;
	}

	@Override
	protected String getItemTable() {
		if (this.itemTable == null) {
			this.itemTable = "person";
		}
		return this.itemTable;
	}

	// @Override
	// public List<Relationship> getRelationsByItemId(int aItemId)
	// throws SQLException {
	// // TODO Auto-generated method stub
	// return null;
	// }
	//
	// @Override
	// public List<ItemBean> getItemsByRelation(Object aRelation)
	// throws SQLException {
	// // TODO Auto-generated method stub
	// return null;
	// }

}