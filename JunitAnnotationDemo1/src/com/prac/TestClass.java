package com.prac;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass {

	
	
	@BeforeClass
	public static void beforeClass2() {
		System.out.println("before calss2");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before calss");
	}
	
	
	//before and after annot do not allow the methods to be static
	//only befire class and after calss ae allowed to be static
	//tests can also be static
	@Before
	public void before2() {
		System.out.println("before2");
	}
	
	@AfterClass
	public static void afterclass1() {
		System.out.println("after class1");
	}
	
	
	@AfterClass
	public static void afterclass2() {
		System.out.println("after class2");
	}
	
	
	@Test
	public void test() {
		System.out.println("t1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("t2");
	}
	
	@AfterClass
	public static void afterclass3() {
		System.out.println("after class3");
	}
	
	@Before
	public void before1() {
		System.out.println("before1");
	}
	
	@BeforeClass
	public static void beforeClass3() {
		System.out.println("before calss3");
	}
	
	
	
}
