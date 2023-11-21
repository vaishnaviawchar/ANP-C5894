package com.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	Calculator cal;  //refernece of class Calculator
	
	@Before
	public void setUp() throws Exception {
		cal= new Calculator(); //initilizing the calculator object
		
	}
	
	@Test  
    public void test(){  
		assertEquals(3,cal.add(2, 2));
        assertEquals(4,cal.findMax(new int[]{1,3,4,2}));  
        assertEquals(-1,cal.findMax(new int[]{-12,-1,-3,-4,-2}));  
       
    }  

	/*
	 * @Test public void test2() { assertEquals(cal.add(3, 2),5);
	 * 
	 * }
	 * 
	 * @Test public void test3() { assertEquals(cal.add(3, 2),5);
	 * 
	 * }
	 */
	
	
	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	


}
