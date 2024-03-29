/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.Field;
import com.vaadin.ui.TextField;

import de.laegler.ProManApp.bean.PersonBean;
import de.laegler.ProManApp.model.ItemModel;

/**
 * ItemDetailView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public abstract class ItemDetailView extends ItemView {

	private static final long serialVersionUID = -2536820335032612663L;

	public ItemDetailView() {
		super("Details");
	}

	public ItemDetailView(String aCaption) {
		super(aCaption);
	}

	public ItemDetailView(String aCaption, ItemModel aItemModel) {
		super(aCaption, aItemModel);
	}

	@Override
	protected void buildView() {
		content.addComponent(getItemDetailForm());
	}

	protected CssLayout getItemDetailForm() {
		CssLayout itemDetailForm = new CssLayout();

		VerticalComponentGroup itemGroup = new VerticalComponentGroup();
		itemGroup.setWidth("100%");
		itemGroup.setMargin(true);

		Field nameField = new TextField("Name");
		nameField.setValue(((PersonBean) this.getItemModel().getItemBean())
				.getName());
		itemGroup.addComponent(nameField);

		itemDetailForm.addComponent(itemGroup);
		itemDetailForm.addComponent(getItemDetailGroup());

		// TODO: Relationen iterieren.
		// ArrayList<Relationship> relationships = this.getItemModel()
		// .getRelationships();
		// for (Relationship relationship : relationships) {
		//
		// }

		return itemDetailForm;
	}

	abstract protected VerticalComponentGroup getItemDetailGroup();

	// @Override
	// protected void buildView() {
	// form = new CssLayout();
	// content.addComponent(form);
	//
	// saveButton = new SaveButton();
	// content.addComponent(saveButton);
	//
	// cancelButton = new CancelButton();
	// content.addComponent(cancelButton);
	//
	// setContent(content);
	// }

}