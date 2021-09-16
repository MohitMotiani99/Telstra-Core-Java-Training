package com.prac;

interface TestA{
	String toString();
}

public class Main38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Object().toString());
		
		System.out.println(new TestA() {
			public String toString() {return "test";}
		});
	}

}
