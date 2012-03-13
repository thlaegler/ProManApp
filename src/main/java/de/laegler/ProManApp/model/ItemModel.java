/**
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 *
 * This File <code>ItemModel.java</code> was generated from UML-Model with StarUML 11.03.2012 by Thomas Laegler <thomas.laegler@googlemail.com>
 */

package de.laegler.ProManApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import de.laegler.ProManApp.application.Relationship;
import de.laegler.ProManApp.bean.ItemBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 **/
public abstract class ItemModel extends AbstractProManModel implements
		ItemModelInterface {

	protected final ItemBean itemBean;

	protected ArrayList<ItemBean> itemBeans;

	protected final String itemTable;

	private Connection connection;

	public ItemModel() {
		// super();
		this.itemBean = getNewItemBean();
		this.itemTable = getItemTable();
	}

	public ItemModel(ItemBean aItemBean) {
		super();
		this.itemBean = aItemBean;
		this.itemTable = getItemTable();
	}

	public ItemBean getItemBean() {
		return itemBean;
	}

	public String getTable() {
		return this.itemTable;
	}

	private Connection getConnection() {
		if (this.connection == null) {
			try {
				this.connection = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/proman", "root", "");
			} catch (SQLException e) {
				e.printStackTrace();
				return null;
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
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					resultSet = null;
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					statement = null;
					e.printStackTrace();
				}
			}
		}
		return resultSet;
	}

	/** */
	public boolean persist() {
		return false;

	}

	/** */
	public boolean remove() {
		return false;

	}

	/** */
	public boolean restore() {
		return false;

	}

	/** */
	@Override
	public ItemBean getBeanByItemId(int aItemId) {
		return itemBean;

	}

	/**
	 */
	@Override
	public ItemBean getBeanByDomainId(int aDomainId) {
		// String query = "SELECT * FROM gagaga";
		// ResultSet result = execute(query);
		// return itemBean;
		return null;
	}

	@Override
	public List<Relationship> getRelationshipsByItemId(int aItemId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ItemBean> getItemsByRelationship(Relationship aRelationship) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<ItemBean> getItemBeans() {
		if (this.itemBeans == null) {
			this.itemBeans = new ArrayList<ItemBean>();

			// String sql = "SELECT * FROM " + this.getItemTable() + ";";
			String sql = "SELECT * FROM person";

			ResultSet resultSet;
			try {
				resultSet = execute(sql);
				if (resultSet != null && !resultSet.isClosed()) {
					while (resultSet.next()) {
						ItemBean bean = getItemBean();
						bean = buildItemBean(resultSet, bean);
						this.itemBeans.add(bean);
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return this.itemBeans;
	}

	/**
	 * 
	 * @return
	 */
	abstract protected ItemBean getNewItemBean();

	abstract protected String getItemTable();

	/**
	 * 
	 * @param aResultSet
	 * @param aItem
	 * @return
	 */
	protected ItemBean buildItemBean(ResultSet aResultSet, ItemBean aItem) {
		try {
			aItem.setItemId(aResultSet.getInt("itemId"));
			// aItem.setRelationships(aResultSet.getInt("businessId"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aItem;
	}
}
