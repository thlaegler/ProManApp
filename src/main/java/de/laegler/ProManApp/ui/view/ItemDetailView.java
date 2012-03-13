/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemDetailView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.ui.Button;
import com.vaadin.ui.CssLayout;

import de.laegler.ProManApp.ui.button.CancelButton;
import de.laegler.ProManApp.ui.button.SaveButton;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public abstract class ItemDetailView extends ItemView {

	private static final long serialVersionUID = -2536820335032612663L;

	private CssLayout form;
	private Button saveButton;
	private Button cancelButton;

	public ItemDetailView() {
		super("Details");
		buildView();
	}

	public ItemDetailView(String caption) {
		super(caption);
		buildView();
	}

	private void buildView() {
		form = new CssLayout();
		content.addComponent(form);

		saveButton = new SaveButton();
		content.addComponent(saveButton);

		cancelButton = new CancelButton();
		content.addComponent(cancelButton);

		setContent(content);
	}
}
