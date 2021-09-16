package com.prac;

class Alpha{
	public void foo(String ...a) {
		System.out.println("Alpha:foo");
	}
	public void bar(String a) {
		System.out.println("Alpha:bar");
	}
}

class Beta extends Alpha {
	public void foo(String a) {
		System.out.println("Beta:foo");
	}
	public void bar(String a) {
		System.out.println("Beta:bar");
	}
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new Beta();
		Beta b= (Beta)a;
		a.foo("t");
		b.foo("t");
		a.bar("t");
		b.bar("t");
	}

}
