package de.laegler.ProManApp.ui.button;

import com.vaadin.ui.Button;

public class CancelButton extends Button {

	private static final long serialVersionUID = -1916569259010400717L;

	public CancelButton() {
		super("Cancel");
	}

	public CancelButton(String caption, ClickListener listener) {
		super(caption, listener);
	}

	public CancelButton(String caption) {
		super(caption);
	}

}
