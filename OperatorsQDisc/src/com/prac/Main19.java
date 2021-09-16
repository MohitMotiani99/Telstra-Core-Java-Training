package com.prac;

public class Main19 {

	Main19(){}
	Main19(Main19 m){m1=m;}
	Main19 m1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main19 m2 = new Main19();
		Main19 m3 = new Main19(m2);m3.go();
		Main19 m4 = m3.m1;m4.go();
		Main19 m5 = m2.m1;m5.go();
		
	}
	void go() {
		System.out.println("hi");
	}
}
