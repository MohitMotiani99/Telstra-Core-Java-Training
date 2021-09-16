package com.prac.testpack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.prac.pack1.EvenOddClass;

public class EvenTest {

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

	@Test
	public void test() {
		EvenOddClass ob = new EvenOddClass();
		assertEquals(true,ob.isEvenNumber(12));
		assertEquals(true, ob.isEvenNumber(11));
	}
	//can run mutiple tests in a test fun
	
	@Test
	public void test2() {
		EvenOddClass ob = new EvenOddClass();
		assertEquals(true,ob.isEvenNumber(12));
		assertEquals(false, ob.isEvenNumber(11));
	}
	//can run multiple test funs
}
