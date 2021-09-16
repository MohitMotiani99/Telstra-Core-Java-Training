package com.prac;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testClasss {
	
	@Test
	public void test() {
		int val1 = 5;
		int val2 = 6;
		assertTrue(val1<val2);
		//assertFalse(val1<val2);
		
		String str1 = new String("abs");
		
		//assertNull(str1);
		
		String str2 ="abs";
		String str3 ="abs";
		
		//will chwck reference
		assertSame(str2, str3);
		//assertSame(str1, str3);//not equal actually
		
		String[] earr= {"1","2","34"};
		String[] rarr = earr;
		String[] sarr = {"1","2","34"};
		
		//checks value wise
		assertArrayEquals(earr, sarr);
		assertArrayEquals(earr, rarr);
		
		//refs
		//assertSame(rarr, sarr);
		assertSame(rarr, earr);
	}
	//when an assert fails none ahead executed
	//should not be used as conditionals
	//used for confirmation
	
	
	
	
	
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
