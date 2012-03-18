/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.model;

import java.sql.SQLException;

import de.laegler.ProManApp.bean.ItemBean;

/**
 * ItemModelInterface
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public interface ItemModelInterface {

	public ItemBean getBeanByItemId(int aItemId) throws SQLException;

	public ItemBean getBeanByDomainId(int aDomainId) throws SQLException;

	// public List<Relationship> getRelationsByItemId(int aItemId)
	// throws SQLException;
	//
	// public List<ItemBean> getItemsByRelation(Object aRelation)
	// throws SQLException;

}