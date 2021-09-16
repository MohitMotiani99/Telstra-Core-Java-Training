package com.prac;

class Hello{
	String title;
	int value;
	
	public Hello(int value) {
		this();
		this.value=value;
		title="Hello";
	}
	public Hello() {
		System.out.println(value+" "+title);
		title+= "World";
	}
	
}

public class Main6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hello c= new Hello(5);
		System.out.println(c.title);
		
	}

}
