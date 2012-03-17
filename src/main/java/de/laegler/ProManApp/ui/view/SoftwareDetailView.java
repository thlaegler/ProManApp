/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;

import de.laegler.ProManApp.model.ItemModel;

/**
 * SoftwareDetailView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class SoftwareDetailView extends ItemDetailView {

	private static final long serialVersionUID = -7778176215694418266L;

	@Override
	protected VerticalComponentGroup getItemDetailGroup() {
		return null;
	}

	@Override
	protected ItemModel getNewItemModel() {
		return null;
	}

	@Override
	protected ItemDetailView getNewItemDetailView() {
		return null;
	}

}