package de.laegler.ProManApp.ui.view;

import de.laegler.ProManApp.model.ItemModel;
import de.laegler.ProManApp.model.SoftwareModel;

public class SoftwareDetailView extends ItemDetailView {

	@Override
	protected ItemModel getNewItemModel() {
		return new SoftwareModel();
	}
}
