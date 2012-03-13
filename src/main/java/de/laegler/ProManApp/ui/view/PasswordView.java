/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>LoginView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public class PasswordView extends AbstractProManView {

	private static final long serialVersionUID = -9066703191352735925L;

	// private LoginForm loginForm;

	public PasswordView() {
		super("Password forgotten");
		buildView();
	}

	public void buildView() {
		// Titel
		setCaption("Password forgotten");

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
	//
	// public void authenticate() {
	// String msg = localized(TruckAppDict.LOGIN.getLabel());
	//
	// if (!loginForm.validateForm()) {
	// LOG.debug(msg);
	// getWindow().showNotification(msg);
	// return;
	// }
	// SessionModel sessionModel = UnikatTruckWebApplication.getApp()
	// .getSessionModel();
	// // try {
	// sessionModel.login();
	// if (sessionModel.hasValidLogin()) {
	// LOG.debug("Anmeldung erfolgreich für den Benutzer \""
	// + UnikatTruckWebApplication.getApp().getSessionModel()
	// .getLogin().getUsername() + "\"");
	// } else {
	// LOG.debug(msg);
	// getWindow().showNotification(msg);
	// }
	//
	// UnikatTruckWebApplication.getApp().onBrowserDetailsReady();
	// // } catch (NullPointerException anEx) {
	// // // TODO hier sollte eine Individuelle Exception geworfen werden.
	// // LOG.debug(msg);
	// // getWindow().showNotification(msg);
	// // }
	// }
	//
	// private CssLayout createButtonBar() {
	// CssLayout buttonBar = new CssLayout();
	// buttonBar.setMargin(true);
	// buttonBar.setWidth("100%");
	// Button loginButton = new Button(
	// localized(TruckAppDict.LOGIN.getLabel()), this, "authenticate");
	// loginButton.setSizeFull();
	// loginButton.setWidth("100%");
	// buttonBar.addComponent(loginButton);
	// return buttonBar;
	// }
	//
	// /*
	// * private Button createButtonBar() { Button loginButton = new
	// * Button(localized(TruckAppDict.BUTTONLOGIN.getLabel()), this,
	// * "authenticate"); loginButton.setSpacing(true);
	// * loginButton.setMargin(true); loginButton.setSizeFull(); return
	// * loginButton; }
	// */
	//
	// private VerticalComponentGroup createLanguageGroup() {
	// VerticalComponentGroup languageGroup = new VerticalComponentGroup();
	// NavigationButton languageButton = new ChooseLanguageButton(
	// UnikatTruckWebApplication.getApp().getSessionModel()
	// .getLocale());
	// languageGroup.addComponent(languageButton);
	// return languageGroup;
	// }

}
