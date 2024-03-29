package de.laegler.ProManApp.ui.button;

import com.vaadin.ui.Button;

public class SaveButton extends Button {

	private static final long serialVersionUID = -4260606408142727341L;

	public SaveButton() {
		super("Save");
	}

	public SaveButton(String caption) {
		super(caption);
	}

	public SaveButton(String caption, ClickListener listener) {
		super(caption, listener);
	}

}
