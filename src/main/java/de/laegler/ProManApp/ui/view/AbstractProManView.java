/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.NavigationView;
import com.vaadin.ui.CssLayout;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
abstract public class AbstractProManView extends NavigationView {

	private static final long serialVersionUID = 6308730452905599481L;

	protected CssLayout content;

	public AbstractProManView(String aCaption) {
		super(aCaption);

		this.content = new CssLayout();
		this.content.setWidth("100%");
		this.setWidth("100%");
	}

	// @Override
	// public void attach() {
	// super.attach();
	//
	// this.removeAllComponents()
	// this.content = new CssLayout();
	// this.content.setWidth("100%");
	//
	// this.setWidth("100%");
	//
	// this.buildView();
	//
	// setContent(this.content);
	// }

	abstract protected void buildView();

}
