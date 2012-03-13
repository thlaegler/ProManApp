/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.tab;

import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.TabSheet.Tab;

import de.laegler.ProManApp.application.AbstractProManTabBarView;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class LoginTabBarView extends AbstractProManTabBarView {

	private static final long serialVersionUID = 4382982484625915790L;

	private LoginTab loginTab;
	private PasswordTab passwordTab;

	@Override
	public void attach() {
		super.attach();

		loginTab = new LoginTab();
		passwordTab = new PasswordTab();

		Tab addTab = addTab(loginTab);
		addTab.setIcon(new ThemeResource("linegraphics/binocular.png"));
		addTab.setCaption("Perspective");

		addTab = addTab(passwordTab);
		addTab.setIcon(new ThemeResource("linegraphics/tools.png"));
		addTab.setCaption("Modeling");

		setSelectedTab(loginTab);
	}

	@Override
	public void detach() {
		super.detach();
	}

	public void navigateToRootView() {
		loginTab.navigateToRoot();
	}

}
