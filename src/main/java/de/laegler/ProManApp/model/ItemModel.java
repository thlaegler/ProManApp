/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 */

package de.laegler.ProManApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.CommunicationsException;

import de.laegler.ProManApp.application.Relationship;
import de.laegler.ProManApp.bean.ItemBean;

/**
 * ItemModel
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public abstract class ItemModel extends AbstractProManModel implements
		ItemModelInterface {

	protected final ItemBean itemBean;

	protected String itemTable;

	public ItemModel() {
		super();
		this.itemBean = getNewItemBean();
		this.itemTable = getItemTable();
	}

	public ItemModel(ItemBean aItemBean) {
		super();
		this.itemBean = aItemBean;
		this.itemTable = getItemTable();
	}

	public ItemBean getItemBean() {
		// if (this.itemBean == null) {
		// this.itemBean = getNewItemBean();
		// }
		return itemBean;
	}

	public String getTable() {
		return this.itemTable;
	}

	private Connection getConnection() {
		if (this.connection == null) {
			try {
				this.connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/proman", "proman",
						"proman");
			} catch (CommunicationsException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return this.connection;
	}

	// /**
	// * @throws SQLException
	// */
	// private PreparedStatement prepare(String aQuery) throws SQLException {
	// PreparedStatement preparedStatement = getConnection().prepareStatement(
	// aQuery);
	// preparedStatement.setString(1, "Test");
	// preparedStatement.setString(2, "TestEmail");
	// preparedStatement.setString(3, "TestWebpage");
	// preparedStatement.setDate(4, (java.sql.Date) new Date());
	// preparedStatement.setString(5, "TestSummary");
	// preparedStatement.setString(6, "TestComment");
	// return preparedStatement;
	// }

	private ResultSet execute(String aSql) {
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			statement = getConnection().createStatement();
			resultSet = statement.executeQuery(aSql);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// if (resultSet != null) {
			// try {
			// resultSet.close();
			// } catch (SQLException e) {
			// resultSet = null;
			// e.printStackTrace();
			// }
			// }
			// if (statement != null) {
			// try {
			// statement.close();
			// } catch (SQLException e) {
			// statement = null;
			// e.printStackTrace();
			// }
			// }
		}
		return resultSet;
	}

	public boolean persist() {
		return false;
	}

	public boolean remove() {
		return false;
	}

	public boolean restore() {
		return false;

	}

	@Override
	public ItemBean getBeanByItemId(int aItemId) {
		return itemBean;
	}

	@Override
	public ItemBean getBeanByDomainId(int aDomainId) {
		// String query = "SELECT * FROM gagaga";
		// ResultSet result = execute(query);
		// return itemBean;
		return null;
	}

	public ArrayList<Relationship> getRelationships() {
		return this.getRelationshipsByItemBean(this.getItemBean());
	}

	public ArrayList<Relationship> getRelationshipsByItemId(int aItemId) {
		return this.getRelationshipsByItemBean(this.getItemBean());
	}

	public ArrayList<Relationship> getRelationshipsByItemBean(ItemBean aItemBean) {
		Relationship relationship = new Relationship();
		ArrayList<Relationship> relationships = relationship
				.getRelationshipsByItemBean(aItemBean);

		return relationships;
	}

	public ArrayList<ItemBean> getItemsByRelationship(Relationship aRelationship) {
		return null;
	}

	public ArrayList<ItemBean> getItemBeans() {
		String sql = "SELECT super.*, sub.* " + "FROM item super, "
				+ this.getItemTable() + " sub "
				+ "WHERE super.itemId = sub.itemId;";

		// System.out.println(sql);

		ArrayList<ItemBean> itemBeans = new ArrayList<ItemBean>();

		ResultSet resultSet;
		try {
			resultSet = execute(sql);
			while (resultSet.next()) {
				ItemBean bean = getNewItemBean();
				bean = buildItemBean(resultSet, bean);
				itemBeans.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return itemBeans;
	}

	protected ItemBean buildItemBean(ResultSet aResultSet, ItemBean aItemBean) {
		try {
			aItemBean.setItemId(aResultSet.getInt("itemId"));
			aItemBean.setName(aResultSet.getString("name"));
			aItemBean.setDescription(aResultSet.getString("description"));
			aItemBean.setActive(aResultSet.getBoolean("isActive"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aItemBean;
	}

	abstract protected ItemBean getNewItemBean();

	abstract protected String getItemTable();

	// abstract public ItemBean getBeanByItemId(int aItemId);
	//
	// abstract public ItemBean getBeanByDomainId(int aDomainId);
	//
	// abstract public List<Relationship> getRelationshipsByItemId(int aItemId);
	//
	// abstract public List<ItemBean> getItemsByRelationship(
	// Relationship aRelationship);

}