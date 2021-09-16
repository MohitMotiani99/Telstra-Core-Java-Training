package com.prac;

public class main29 extends Thread{

	private String name;
	
	public main29(String name) {
		super();
		this.name = name;
	}

	public void run() {
		synchronized (System.out) {//locking the object of print stream
									// or Letters.class() locking the object of type class
			write();
		}
		
	}
	public void write() {
		System.out.print(name);
		System.out.print(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new main29("X").start();
		new main29("Y").start();
	}

}
