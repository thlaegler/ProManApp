/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>PerspectiveView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;
import com.vaadin.ui.CssLayout;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class PerspectiveView extends AbstractProManView {

	private static final long serialVersionUID = -7458927080341634900L;

	private CssLayout form;

	public PerspectiveView() {
		super("Perspectives");
	}

	@Override
	protected void buildView() {
		form = new CssLayout();

		VerticalComponentGroup layout = new VerticalComponentGroup();
		layout.setWidth("100%");

		layout.addComponent(new NavigationButton("User", new PersonIndexView()));
		// layout.addComponent(new NavigationButton("Software",
		// new SoftwareIndexView()));
		// layout.addComponent(new
		// NavigationButton("Software development model"));

		form.addComponent(layout);
		content.addComponent(form);

		setContent(content);
	}

}
