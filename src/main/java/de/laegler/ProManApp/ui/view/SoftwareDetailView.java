package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.model.SoftwareModel;

public class SoftwareDetailView extends ItemDetailView {

	private static final long serialVersionUID = -7778176215694418266L;

	@Override
	protected ItemModel getNewItemModel() {
		return new SoftwareModel();
	}
}
