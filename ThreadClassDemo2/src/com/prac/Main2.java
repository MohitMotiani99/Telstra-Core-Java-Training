package com.prac;

class Hi_t implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Hello_t implements Runnable{
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class Main2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Hi_t obj1 = new Hi_t();
		Hello_t obj2 = new Hello_t();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		t1.join();// waits till t1 joins back the main thread
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		
		System.out.println("Bye");
		
	}

}
