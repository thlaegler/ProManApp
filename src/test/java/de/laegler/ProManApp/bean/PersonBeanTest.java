/**
 * 
 * (c) Copyright 2012 Laegler IT Solutions Germany GbR
 *
 * Project: ProMan 0.1
 * 
 */

package de.laegler.ProManApp.bean;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.laegler.ProManApp.bean.PersonBean;

/**
 * ...
 * 
 * @author Thomas Laegler <thomas.laegler@googlemail.com>
 * @version 0.1
 * @since 0.1
 */
public class PersonBeanTest {

	private PersonBean personBean;
	
    @Before
    public void setUp() throws Exception {
    	this.personBean = new PersonBean();
    }

    @Test
    public void testEMail() {
    	String eMail = "test@test.de";
      
        assertEquals(null, this.personBean.getEMail());
        
        this.personBean.setEMail(eMail);
        
        assertEquals(eMail, this.personBean.getEMail());
    }

}
