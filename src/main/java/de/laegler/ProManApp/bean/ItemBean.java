/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.bean;

import java.util.Date;
import java.util.List;

import de.laegler.ProManApp.application.ItemType;
import de.laegler.ProManApp.application.Relationship;

/**
 * ItemBean
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class ItemBean extends AbstractProManBean {

	protected int itemId;

	protected int domainId;

	protected ItemType itemType;

	protected List<Relationship> relationships;

	protected String name;

	protected String description;

	protected Date createDate;

	protected PersonBean createUser;

	protected boolean isActive;

	protected boolean isRemoved;

	public int getItemId() {
		return this.itemId;
	}

	public void setItemId(int aItemId) {
		this.itemId = aItemId;
	}

	public int getDomainId() {
		return domainId;
	}

	public void setDomainId(int domainId) {
		this.domainId = domainId;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public PersonBean getCreateUser() {
		return createUser;
	}

	public void setCreateUser(PersonBean createUser) {
		this.createUser = createUser;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isRemoved() {
		return isRemoved;
	}

	public void setRemoved(boolean isRemoved) {
		this.isRemoved = isRemoved;
	}

}