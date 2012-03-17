/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.application;

import com.vaadin.addon.touchkit.ui.NavigationManager;

import de.laegler.ProManApp.ui.view.AbstractProManView;

/**
 * AbstractProManTab
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
abstract public class AbstractProManTab extends NavigationManager {

	private static final long serialVersionUID = 2152925511225741804L;

	protected final AbstractProManView rootView;

	public AbstractProManTab(AbstractProManView aView) {
		super(aView);
		this.rootView = aView;
		this.navigateToRoot();
	}

	public AbstractProManView getRootView() {
		return this.rootView;
	}

	public void navigateToRoot() {
		navigateTo(this.rootView);
	}

}