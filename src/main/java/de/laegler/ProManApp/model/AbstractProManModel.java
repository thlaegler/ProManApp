/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>AbstractItemModel.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.model;

import java.sql.Connection;
import java.util.List;

import de.laegler.ProManApp.application.Relationship;
import de.laegler.ProManApp.bean.ItemBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public abstract class AbstractProManModel {

	protected Connection connection;

	abstract public ItemBean getBeanByItemId(int aItemId);

	abstract public ItemBean getBeanByDomainId(int aDomainId);

	abstract public List<Relationship> getRelationshipsByItemId(int aItemId);

	abstract public List<ItemBean> getItemsByRelationship(
			Relationship aRelationship);

}
