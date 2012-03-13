/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>LoginTab.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.tab;

import de.laegler.ProManApp.application.AbstractProManTab;
import de.laegler.ProManApp.ui.view.LoginView;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class LoginTab extends AbstractProManTab {

	private static final long serialVersionUID = 8644840632712654087L;

	public LoginTab() {
		super(new LoginView());
	}

}
