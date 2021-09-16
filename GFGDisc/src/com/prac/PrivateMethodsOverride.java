package com.prac;

public class PrivateMethodsOverride {
	
	private String msg = "GeeksforGeeks";
	private void fun() {
		System.out.println("Outer fun()");
	}
	
	class Inner extends PrivateMethodsOverride{
		private void fun() {
			System.out.println("Private member of outer is : "+msg);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrivateMethodsOverride o = new PrivateMethodsOverride();
		Inner i = o.new Inner();
		
		System.out.println(o.msg);
		
		i.fun();
		o = i;
		o.fun();
	}

}
