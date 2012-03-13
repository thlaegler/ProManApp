/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>Relation.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.application;

import de.laegler.ProManApp.bean.ItemBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class Relationship {
	/** */
	private ItemBean fromItem;

	/** */
	private ItemBean toItem;

	/** */
	private RelationshipType relationType;

	/** */
	public ItemBean getFromItem() {
		return this.fromItem;

	}

	/** */
	public void setFromItem(ItemBean aItemBean) {
		this.fromItem = aItemBean;
	}

	/** */
	public ItemBean getToItem() {
		return this.toItem;

	}

	/** */
	public void setToItem(ItemBean aItemBean) {
		this.toItem = aItemBean;
	}

	/** */
	public RelationshipType getRelationType() {
		return this.relationType;
	}

	/** */
	public void setRelationType(RelationshipType aRelationType) {
		this.relationType = aRelationType;
	}
}
