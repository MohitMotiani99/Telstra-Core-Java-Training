package com.prac;

interface A_i{
	public void aMethod();
}
interface B_i{
	public void bMethod();
}
interface C extends A_i,B_i{
	public void cMethod();
}

class D implements B_i{

	@Override
	public void bMethod() {
		// TODO Auto-generated method stub
		System.out.println("B from D");
	}
	
}

class E extends D implements C{

	@Override
	public void aMethod() {
		// TODO Auto-generated method stub
		System.out.println("A from E");
	}

	@Override
	public void cMethod() {
		// TODO Auto-generated method stub
		System.out.println("C from E");
	}
	
	public void bMethod() {
		// TODO Auto-generated method stub
		System.out.println("B from E");
	}
	
}

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D e = new E();
		e.bMethod();
		
		D e1 =(D)(new E());
		e1.bMethod();
		
	}

}
