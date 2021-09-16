package com.prac;

public class Main {
	public static void main(String[] args) {
		MyInterface myinterface1 = (a,b)->a+b;
		System.out.println(myinterface1.add(4, 5));
	}
	/**
	 * Pure Functions:
	 * 	 2 conditions
	 * 		if it always return s the same output for the same input and the results
	 * 			depends only upon the inputs passed
	 * 		it has no side effects means it is not modifying the state of caller object
	 * 
	 */
}
