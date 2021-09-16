package com.prac;

class x{
	public void print() {
		System.out.println("No args");
	}
}

public class Extra1 extends x{

	public void print(int a) {
		System.out.println("1 arg");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extra1 e = new Extra1();
		e.print();
		e.print(8);
	}

}
