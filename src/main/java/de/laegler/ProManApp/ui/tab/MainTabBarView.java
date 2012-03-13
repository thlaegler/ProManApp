/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>MainTabBarView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
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
public class MainTabBarView extends AbstractProManTabBarView {

	private static final long serialVersionUID = -2837609214168222721L;

	private PerspectiveTab perspectiveTab;
	private ModelingTab modelingTab;
	private SettingTab settingTab;

	public MainTabBarView() {
		super();
	}

	@Override
	public void attach() {
		super.attach();

		perspectiveTab = new PerspectiveTab();
		modelingTab = new ModelingTab();
		settingTab = new SettingTab();

		Tab addTab = addTab(perspectiveTab);
		addTab.setIcon(new ThemeResource("linegraphics/binocular.png"));
		addTab.setCaption("Perspective");

		addTab = addTab(modelingTab);
		addTab.setIcon(new ThemeResource("linegraphics/tools.png"));
		addTab.setCaption("Modeling");

		addTab = addTab(settingTab);
		addTab.setIcon(new ThemeResource("linegraphics/binocular.png"));
		addTab.setCaption("Settings");

		setSelectedTab(perspectiveTab);
	}

	@Override
	public void detach() {
		super.detach();
	}

	public void navigateToRootView() {
		perspectiveTab.navigateToRoot();
	}

}
