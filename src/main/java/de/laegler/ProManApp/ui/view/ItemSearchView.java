/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;

/**
 * ItemSearchView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public abstract class ItemSearchView extends ItemView {

	private static final long serialVersionUID = 1352400073710163364L;

	public ItemSearchView(String aCaption) {
		super("Search");
	}

	public ItemSearchView(String aCaption, ItemModel aModel) {
		super(aCaption, aModel);
	}

}