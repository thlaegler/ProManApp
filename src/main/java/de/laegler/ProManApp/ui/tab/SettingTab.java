/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ProManApplication.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.tab;

import de.laegler.ProManApp.application.AbstractProManTab;
import de.laegler.ProManApp.ui.view.SettingView;

/**
 * SettingTab
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class SettingTab extends AbstractProManTab {

	private static final long serialVersionUID = 8644840632712654087L;

	public SettingTab() {
		super(new SettingView());
	}

}