package com.prac;

public class Main21 {

	int x = 5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Main21 f1 = new Main21();
		Main21 f2 = new Main21();
		Main21 f3 = FizzSwitch(f1,f2);
		System.out.println((f1==f3)+" "+(f1.x==f3.x));
		
	}
	static Main21 FizzSwitch(Main21 x,Main21 y) {
		final Main21 z = x;
		z.x = 6;
		return z;
	}
	
}
