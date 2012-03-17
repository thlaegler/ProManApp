/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.model.PersonModel;

/**
 * PersonIndexView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class PersonIndexView extends ItemIndexView {

	private static final long serialVersionUID = 9071409083205123403L;

	public PersonIndexView() {
		super("Person Index");
	}

	@Override
	public void onBecomingVisible() {
		super.onBecomingVisible();
	}

	@Override
	protected ItemDetailView getNewItemDetailView() {
		return new PersonDetailView();
	}

	@Override
	protected ItemDetailView getNewItemDetailView(ItemModel aItemModel) {
		return new PersonDetailView(aItemModel);
	}

	@Override
	protected ItemDetailView getNewItemDetailView(ItemBean aItemBean) {
		return new PersonDetailView(new PersonModel(aItemBean));
	}

	@Override
	protected ItemModel getNewItemModel() {
		return new PersonModel();
	}

}