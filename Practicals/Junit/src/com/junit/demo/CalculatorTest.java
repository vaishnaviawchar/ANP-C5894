package com.junit.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	Calculator cal;
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal=new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		cal=null;
	}

	@Test
	public void test() {
		assertEquals(4,cal.add(2, 2));
		//fail("Not yet implemented");
	}

	}
