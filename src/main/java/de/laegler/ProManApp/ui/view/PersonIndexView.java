package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.model.PersonModel;

public class PersonIndexView extends ItemIndexView {

	private static final long serialVersionUID = 9071409083205123403L;

	public PersonIndexView() {
		super("User Index");
	}

	public PersonIndexView(String caption) {
		super(caption);
	}

	@Override
	protected ItemDetailView getNewItemDetailView() {
		return new PersonDetailView();
	}

	@Override
	protected ItemModel getNewItemModel() {
		return new PersonModel();
	}
}
