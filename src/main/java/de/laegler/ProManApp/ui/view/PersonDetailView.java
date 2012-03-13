/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>UserDetailView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.model.PersonModel;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class PersonDetailView extends ItemDetailView {

	private static final long serialVersionUID = 6144743715159797012L;

	public PersonDetailView() {
		super("User Details");
		this.buildView();
	}

	public PersonDetailView(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	private void buildView() {

	}

	@Override
	protected ItemModel getNewItemModel() {
		return new PersonModel();
	}

}
