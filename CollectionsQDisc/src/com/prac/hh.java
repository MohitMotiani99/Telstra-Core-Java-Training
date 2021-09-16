package com.prac;

public class hh extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hh t = new hh();
		t.run();
		t.start();
	}
	public void run() {
		System.out.println("r");
	}

}
