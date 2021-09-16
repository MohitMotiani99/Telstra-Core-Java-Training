package com.prac;

class A{
	String name = "A";
	String getName() {
		return name;
	}
	String greeting() {
		return "class A";
	}
}
class B extends A{
	String name = "B";
	String greeting() {
		return "class B";
	}
}
public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		System.out.println(b.name);
		System.out.println(b.getName());
		System.out.println(a.greeting()+ "  "+ a.getName());
		System.out.println(b.greeting()+ "  " +b.getName());
	}

}
