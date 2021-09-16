package com.prac;

class base{
	public static void fun() {
		System.out.println("fun of base");
	}
}

interface TestInterface{
	int x= 5;
	public void square(int a);
	default void show() {
		System.out.println("Default Method  Execution "+x);
	}
}
interface TestInterface2{
	default void show() {
		System.out.println("Default Method Execution 2");
	}
	static void show(int x) {
		System.out.println("Value of x is "+x);
	}
}

public class Main2 extends base implements TestInterface,TestInterface2 {
	
	static void show(int x) {
		System.out.println("Main static "+x);
	}
//	static int fun() {
//		System.out.println("fun of main");
//		return 0;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m = new Main2();
		m.square(9);
		//
		m.show();
		//TestInterface.super.show();
		//
		TestInterface2.show(45);
		show(45);
		//
		base.fun();
		fun();
		//fun(33);
		
	}

	@Override
	public void square(int a) {
		// TODO Auto-generated method stub
		System.out.println(a*a);
		TestInterface2.super.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		TestInterface.super.show();
		TestInterface2.super.show();
	}

	/**
	 * Default methods
	 * 
	 * allows implementation of some methods in the interface only 
	 * and we dont need to do anything where we have implemented the abstract funs of
	 * the interface
	 * 
	 * default keyword used
	 * 
	 * default methods also known as defender or virtual extension methods
	 * 
	 * if there is no default methods with the same signature in all the interfaces
	 * implemented then there is not required to override the default in the class
	 * 
	 * but if there are 2 default methods being inherited for same or different interfaces 
	 * 
	 * 
	 */

}
