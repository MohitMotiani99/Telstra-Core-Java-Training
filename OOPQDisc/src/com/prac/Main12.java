package com.prac;

public class Main12 {

	public static final String FOO = "foo";
	
	public static void test(String str) {
		if(str== null | str.length()==0) {
			System.out.println("empty");
		}
		else {
			System.out.println("not empty");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//12
		Main12 b = new Main12();
		Sub s = new Sub();
		
		System.out.println(Main12.FOO);
		System.out.println(Sub.FOO);
		System.out.println(b.FOO);
		System.out.println(s.FOO);
		System.out.println(((Main12)s).FOO);
		//System.out.println(((Sub)b).FOO);
		
		//14
		test(null);
	}

}
class Sub extends Main12{
	public static final String FOO = "bar";
}
