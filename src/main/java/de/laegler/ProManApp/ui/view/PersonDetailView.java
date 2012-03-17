/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>UserDetailView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

import de.laegler.ProManApp.bean.PersonBean;
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
		super("Person Details");
	}

	public PersonDetailView(String aCaption) {
		super(aCaption);
	}

	public PersonDetailView(ItemModel aItemModel) {
		super("Person Details", aItemModel);
	}

	public PersonDetailView(String aCaption, ItemModel aItemModel) {
		super(aCaption, aItemModel);
	}

	@Override
	protected ItemModel getNewItemModel() {
		return new PersonModel();
	}

	@Override
	protected VerticalComponentGroup getItemDetailGroup() {
		VerticalComponentGroup itemDetailGroup = new VerticalComponentGroup();
		itemDetailGroup.setWidth("100%");
		itemDetailGroup.setMargin(true);

		Field eMailField = new TextField("eMail");
		eMailField.setValue(((PersonBean) this.getItemModel().getItemBean())
				.getEMail());
		itemDetailGroup.addComponent(eMailField);

		return itemDetailGroup;
	}

	@Override
	protected ItemDetailView getNewItemDetailView() {
		return new PersonDetailView();
	}

}
