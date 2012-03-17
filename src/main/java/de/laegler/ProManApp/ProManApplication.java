/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vaadin.addon.touchkit.ui.TouchKitApplication;
import com.vaadin.addon.touchkit.ui.TouchKitWindow;
import com.vaadin.terminal.gwt.server.HttpServletRequestListener;

import de.laegler.ProManApp.application.Session;
import de.laegler.ProManApp.ui.tab.MainTabBarView;

/**
 * ProManApplication
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class ProManApplication extends TouchKitApplication implements
		HttpServletRequestListener {

	private static final long serialVersionUID = -3625980122738831470L;

	/** */
	private Session session;
	private TouchKitWindow mainWindow;
	private MainTabBarView mainTabBarView;

	@Override
	public void close() {
		getSession().setLoginFlag(false);
		super.close();
	}

	@Override
	public void onRequestStart(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println("[Start of request");
		System.out.println(" Query string: " + request.getQueryString());
		System.out.println(" Path: " + request.getPathInfo());

		getSession().setHttpResponse(response);
		getSession().setHttpRequest(request);
		super.onRequestStart(request, response);
	}

	@Override
	public void onRequestEnd(HttpServletRequest request,
			HttpServletResponse response) {
		System.out.println(" End of request]");
		super.onRequestEnd(request, response);
	}

	public static ProManApplication getApp() {
		return (ProManApplication) get();
	}

	@Override
	public void init() {
		configureMainWindow();
		setTheme("vornitologist");
	}

	private void configureMainWindow() {
		mainWindow = new TouchKitWindow();
		getMainWindow().setCaption("ProManApp");
		getMainWindow().addApplicationIcon(
				getURL() + "VAADIN/themes/vornitologist/icon.png");
		getMainWindow().setStartupImage(
				getURL() + "VAADIN/themes/vornitologist/startup.png");
		getMainWindow().setWebAppCapable(true);
		getMainWindow().setPersistentSessionCookie(true);

		setMainWindow(getMainWindow());
	}

	@Override
	public void onBrowserDetailsReady() {
		// if (getSessionModel().isLoginFlag()) {
		getMainWindow().setContent(getMainTabBarView());
		// } else {
		// this.mainTabsheet = null;
		// this.getMainWindow().setContent(new LoginTabsheet());
		// }
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new ProManApplication().init();
	}

	@Override
	public TouchKitWindow getMainWindow() {
		return mainWindow;
	}

	public Session getSession() {
		if (this.session == null) {
			this.session = new Session();
		}
		return this.session;
	}

	public MainTabBarView getMainTabBarView() {
		if (this.mainTabBarView == null) {
			this.mainTabBarView = new MainTabBarView();
		}
		return this.mainTabBarView;
	}

}