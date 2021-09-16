package com.prac;

class PrintTable{
	public void printTable(int n) {
		synchronized (this) {
		System.out.println("Table of "+n);
		for(int i=1;i<10;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
}

class MyThread1 extends Thread{
	PrintTable pt;

	public MyThread1(PrintTable pt) {
		super();
		this.pt = pt;
	}
	public void run() {
		pt.printTable(2);
	}
}

class MyThread2 extends Thread{
	PrintTable pt;

	public MyThread2(PrintTable pt) {
		super();
		this.pt = pt;
	}
	public void run() {
		pt.printTable(5);
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PrintTable obj = new PrintTable();
		
		new MyThread1(obj).start();
		new MyThread2(obj).start();
	}

}
