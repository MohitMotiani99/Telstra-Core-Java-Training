package com.prac;

import java.util.ArrayList;
import java.util.List;

class A_cl{
	static void method1() {
		System.out.println("A m1");
	}
}
class B_cl extends A_cl{
	static void method1() {
		System.out.println("B m1");
	}
}
public class g16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_cl a1 = new B_cl();
		a1.method1();
		
		List list = new ArrayList<>();
		  list.add(123);
		  list.add("John");
		  list.add(1,1.22f);
		  list.add(123);
		  list.remove(0);
		  System.out.println(list);
		  
		  
		  String test = "a:b:c";
		  String[] tokens = test.split(":");
		  for(String s: tokens) System.out.print(s + " ");
	}

}
