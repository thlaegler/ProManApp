/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.model;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.bean.SoftwareBean;

/**
 * SoftwareModel
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class SoftwareModel extends ItemModel {

	@Override
	protected ItemBean getNewItemBean() {
		return new SoftwareBean();
	}

	@Override
	protected String getItemTable() {
		return "software";
	}

	// @Override
	// public List<Relationship> getRelationsByItemId(int aItemId) {
	// return null;
	// }
	//
	// @Override
	// public List<ItemBean> getItemsByRelation(Object aRelation) {
	// return null;
	// }

}