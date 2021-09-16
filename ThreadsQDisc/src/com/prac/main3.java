package com.prac;

public class main3 extends Thread{
	private static int x;
	public static synchronized void doThings() {
		int current = x;
		current++;
		x = current;
		System.out.println("x: "+x);
	}
	public void run() {
		doThings();
	}
	
	public static void main(String[] args) {
		new main3().start();
		new main3().start();
	}
}
