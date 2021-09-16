package com.prac;

public class main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("cat");
			}
		};
		Thread t = new Thread(r) {
			public void run() {
				System.out.println("Dfg");
			}
		};
		t.start();
	}

}
