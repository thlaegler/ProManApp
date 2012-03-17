package de.laegler.ProManApp.model;

import java.util.List;

import de.laegler.ProManApp.application.Relationship;
import de.laegler.ProManApp.bean.ItemBean;
import de.laegler.ProManApp.bean.SoftwareBean;

public class SoftwareModel extends ItemModel {

	@Override
	protected ItemBean getNewItemBean() {
		return new SoftwareBean();
	}

	@Override
	protected String getItemTable() {
		return "software";
	}

	@Override
	public List<Relationship> getRelationsByItemId(int aItemId) {
		return null;
	}

	@Override
	public List<ItemBean> getItemsByRelation(Object aRelation) {
		return null;
	}

}
