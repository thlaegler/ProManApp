/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;

import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.model.ItemModel;

/**
 * SoftwareIndexView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class SoftwareIndexView extends ItemIndexView {

	private static final long serialVersionUID = 9071409083205123403L;

	public SoftwareIndexView() {
		super("Software Index");
		this.buildView();
	}

	public SoftwareIndexView(String caption) {
		super(caption);
		this.buildView();
	}

	@Override
	protected void buildView() {
		VerticalComponentGroup layout = new VerticalComponentGroup();
		layout.setMargin(true);

		layout.addComponent(new NavigationButton("Hans", new PersonDetailView(
				"Hans")));
		layout.addComponent(new NavigationButton("Franz", new PersonDetailView(
				"Franz")));
		layout.addComponent(new NavigationButton("Fritz", new PersonDetailView(
				"Fritz")));

		content.addComponent(layout);
	}

	@Override
	protected ItemDetailView getNewItemDetailView() {
		return new SoftwareDetailView();
	}

	@Override
	protected ItemModel getNewItemModel() {
		return null;
	}

	@Override
	protected ItemDetailView getNewItemDetailView(ItemModel aItemModel) {
		return null;
	}

	@Override
	protected ItemDetailView getNewItemDetailView(ItemBean aItemBean) {
		return null;
	}

}