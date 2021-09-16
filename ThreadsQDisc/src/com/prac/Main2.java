package com.prac;


public class Main2 implements Runnable{

	public void run() {
		System.out.println("run");
		throw new RuntimeException("Problem");//sets the getMessage as Problem
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Main2());
		t.start();
		System.out.println("End of method");
	}

}
