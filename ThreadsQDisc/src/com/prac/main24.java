package com.prac;

public class main24 extends Thread{
	public static void main(String[] args) throws Exception{
		main24 t = new main24();
		t.start();
		t.join();
		t.run();
	}
}
