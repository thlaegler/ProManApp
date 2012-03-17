/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.application;

import java.util.ArrayList;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.model.AbstractProManModel;

/**
 * Relationship
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class Relationship extends AbstractProManModel {

	private ItemBean fromItem;

	private ItemBean toItem;

	private Relationshiptype relationtype;

	public ItemBean getFromItem() {
		return this.fromItem;
	}

	public void setFromItem(ItemBean aItemBean) {
		this.fromItem = aItemBean;
	}

	public ItemBean getToItem() {
		return this.toItem;
	}

	public void setToItem(ItemBean aItemBean) {
		this.toItem = aItemBean;
	}

	public Relationshiptype getRelationtype() {
		return this.relationtype;
	}

	public void setRelationType(Relationshiptype aRelationtype) {
		this.relationtype = aRelationtype;
	}

	public ArrayList<Relationship> getRelationshipsByItemBean(ItemBean aItemBean) {
		String sql = "SELECT super.*, sub.* "
				+ "FROM item super, relationship rel, "
				+ aItemBean.getItemType().getName() + " sub "
				+ "WHERE super.itemId = sub.itemId;";

		// String sql = "SELECT * FROM person";

		System.out.println(sql);

		ArrayList<Relationship> itemBeans = new ArrayList<Relationship>();

		// TODO: Relationshipabfrage
		// ResultSet resultSet;
		// try {
		// resultSet = execute(sql);
		// while (resultSet.next()) {
		// ItemBean bean = getNewItemBean();
		// bean = buildItemBean(resultSet, bean);
		// itemBeans.add(bean);
		// }
		// } catch (SQLException e) {
		// e.printStackTrace();
		// }
		return itemBeans;
	}

}