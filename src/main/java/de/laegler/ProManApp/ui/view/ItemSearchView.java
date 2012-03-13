/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemSearchView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public abstract class ItemSearchView extends ItemView {

	private static final long serialVersionUID = 1352400073710163364L;

	/**
	 * 
	 * @param aCaption
	 */
	public ItemSearchView(String aCaption) {
		super("Search");
	}

	/**
	 * 
	 * @param aCaption
	 * @param aModel
	 */
	public ItemSearchView(String aCaption, ItemModel aModel) {
		super(aCaption, aModel);
	}

}
