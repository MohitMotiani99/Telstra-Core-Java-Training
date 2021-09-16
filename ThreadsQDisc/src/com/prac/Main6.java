package com.prac;

public class Main6 {

	static void waitForSignal() throws InterruptedException {
		Object obj = new Object();
		System.out.println(Thread.currentThread().getName());
		synchronized (Thread.currentThread()) {
			
			obj.wait();
			obj.notify();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			waitForSignal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
