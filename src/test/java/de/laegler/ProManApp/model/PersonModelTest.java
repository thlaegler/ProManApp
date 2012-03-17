/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 * 
 */

package de.laegler.ProManApp.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;

import de.laegler.ProManApp.model.PersonModel;
import de.laegler.ProManApp.bean.PersonBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class PersonModelTest {

	private PersonModel personModel;
	
    @Before
    public void setUp() throws Exception {
    	this.personModel = new PersonModel();
    }

//    @Test
//    public void testItemBean() {
//    	PersonBean personBean = new PersonBean();
//      
//        assertEquals(null, this.personModel.getItemBean());
//        
//        this.personModel.setItemBean(personBean);
//        
//        assertEquals(personBean, this.personModel.getItemBean());
//    }

//    @Test
//    public void testItemTable() {
//    	String itemTable = "person";
//      
//        assertEquals(null, this.personModel.getItemBean());
//        
//        this.personModel.setItemTable(personBean);
//        
//        assertEquals(itemTable, this.personModel.getItemBean());
//    }

}
