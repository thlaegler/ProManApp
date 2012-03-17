/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.ui.view;

/**
 * LoginView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class LoginView extends AbstractProManView {

	private static final long serialVersionUID = -9066703191352735925L;

	// private LoginForm loginForm;

	public LoginView() {
		super("Login");
		this.buildView();
	}

	@Override
	public void buildView() {
		// Titel
		setCaption("Login");

		// Logo
		// Label logo = new Label();
		// logo.setStyleName("applogo");
		// logo.setIcon(new ClassResource(
		// "/logo/truckapp/UNIKAT-GE_061111ok_XS.png",
		// UnikatTruckWebApplication.getApp().getMainWindow()
		// .getApplication()));
		// content.addComponent(logo);
		//
		// // Login Formular
		// loginForm = new LoginForm("", UnikatTruckWebApplication.getApp()
		// .getSessionModel().getLogin());
		// content.addComponent(loginForm.getComponentGroup());
		//
		// // Login Button
		// content.addComponent(createButtonBar());
		//
		// // Sprachauswahl
		// content.addComponent(createLanguageGroup());

		// Copyright
		// int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		// content.addComponent(new Label(
		// "<div style='text-align: center; align: bottom;'>&copy; Copyright 2011-"
		// + currentYear + ", DAKOSY AG, Hamburg</div>",
		// Label.CONTENT_XHTML));
		//
		// setContent(content);
	}

}