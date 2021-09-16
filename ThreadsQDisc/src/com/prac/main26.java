package com.prac;

public class main26 {

	private static Object resource = new Object();
	
	private static void delay(long n) {
		try {
			Thread.sleep(n);
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("StartMain");
		new Thread1().start();
		delay(1000);
		Thread t2 = new Thread2();
		t2.start();
		delay(1000);
		t2.interrupt();
		delay(1000);
		System.out.println("endmain");
	}

	static class Thread1 extends Thread{
		public void run() {
			synchronized (resource) {
				System.out.println("start1");
				delay(6000);
				System.out.println("end1");
			}
		}
	}
	
	static class Thread2 extends Thread{
		public void run() {
			synchronized (resource) {
				System.out.println("start2");
				delay(2000);
				System.out.println("end2");
			}
		}
	}
}
