/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.button;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.ui.Component;

/**
 * ItemDetailNavButton
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class ItemDetailNavButton extends NavigationButton {

	private static final long serialVersionUID = -4966362259800044429L;

	public ItemDetailNavButton() {
		super();
		setWidth("100%");
	}

	public ItemDetailNavButton(Component targetView) {
		super(targetView);
	}

	public ItemDetailNavButton(String caption, Component targetView) {
		super(caption, targetView);
	}

	public ItemDetailNavButton(String caption) {
		super(caption);
	}

}