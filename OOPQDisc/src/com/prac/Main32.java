package com.prac;

class SuperCalc{
	protected static int multiply(int a,int b) {return a*b;}
	public void hey() {System.out.println("Hey");}
}

public class Main32 extends SuperCalc{
	
	public float multiply(int a,float b) {
		super.hey();
		return a*b;
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Main32 m = new Main32();
		System.out.println(m.multiply(3, 4));
		
		System.out.println(m.multiply(4, 6.5f));
	}

}
