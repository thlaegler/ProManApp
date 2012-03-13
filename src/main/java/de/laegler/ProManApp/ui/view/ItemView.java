/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
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
public abstract class ItemView extends AbstractProManView {

	private static final long serialVersionUID = 6239445357873459562L;

	/** */
	protected final ItemModel itemModel;

	public ItemView(String aCaption) {
		super(aCaption);
		this.itemModel = getNewItemModel();
	}

	public ItemView(String aCaption, ItemModel aItemModel) {
		super(aCaption);
		this.itemModel = aItemModel;
	}

	public ItemModel getItemModel() {
		return itemModel;
	}

	abstract protected ItemModel getNewItemModel();

}