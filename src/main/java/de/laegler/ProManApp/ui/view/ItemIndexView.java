/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemIndexView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import java.util.ArrayList;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.ui.button.ItemDetailNavButton;

/**
 * ItemIndexView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public abstract class ItemIndexView extends ItemView {

	private static final long serialVersionUID = -8683045446995327006L;

	public ItemIndexView() {
		super("Index");
	}

	public ItemIndexView(String aCaption) {
		super(aCaption);
	}

	@Override
	protected void buildView() {
		content.addComponent(getItemIndexForm());
	}

	protected CssLayout getItemIndexForm() {
		CssLayout itemIndexForm = new CssLayout();

		VerticalComponentGroup itemGroup = new VerticalComponentGroup();
		itemGroup.setWidth("100%");
		itemGroup.setMargin(true);

		ArrayList<ItemBean> itemBeans = this.getItemModel().getItemBeans();
		for (ItemBean itemBean : itemBeans) {
			NavigationButton itemDetailNavButton = new ItemDetailNavButton();

			itemDetailNavButton.setCaption("" + itemBean.getItemId());
			itemDetailNavButton.setDescription(itemBean.getName());
			itemDetailNavButton.setTargetView(getNewItemDetailView(itemBean));
			// TODO: Icons
			// itemDetailNavButton.setIcon();

			itemGroup.addComponent(itemDetailNavButton);
		}
		itemIndexForm.addComponent(itemGroup);
		return itemIndexForm;
	}

	@Override
	abstract protected ItemDetailView getNewItemDetailView();

	abstract protected ItemDetailView getNewItemDetailView(ItemModel aItemModel);

	abstract protected ItemDetailView getNewItemDetailView(ItemBean aItemBean);

}