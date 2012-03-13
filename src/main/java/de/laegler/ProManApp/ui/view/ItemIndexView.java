/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemIndexView.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.ui.view;

import java.util.ArrayList;

import com.vaadin.addon.touchkit.ui.NavigationButton;
import com.vaadin.addon.touchkit.ui.VerticalComponentGroup;

import de.laegler.ProManApp.bean.ItemBean;

/**
 * ItemIndexView
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public abstract class ItemIndexView extends ItemView {

	private static final long serialVersionUID = -8683045446995327006L;

	/**
	 * Constructor
	 */
	public ItemIndexView() {
		super("Index");
	}

	/**
	 * Constructor
	 * 
	 * @param aCaption
	 */
	public ItemIndexView(String aCaption) {
		super(aCaption);
	}

	@Override
	public void attach() {
		this.buildView();
	}

	/**
	 * 
	 */
	private void buildView() {
		VerticalComponentGroup layout = new VerticalComponentGroup();
		layout.setMargin(true);

		ArrayList<ItemBean> itemBeans = itemModel.getItemBeans();

		if (itemBeans != null) {
			for (ItemBean itemBean : itemBeans) {
				layout.addComponent(new NavigationButton(itemBean.getName(),
						getNewItemDetailView()));
			}
		}
		content.addComponent(layout);
	}

	/**
	 * 
	 * @return
	 */
	abstract protected ItemDetailView getNewItemDetailView();

}
