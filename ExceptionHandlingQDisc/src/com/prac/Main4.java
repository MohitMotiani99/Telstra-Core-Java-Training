package com.prac;

import java.io.IOException;

public class Main4 {

	public void process() {
		System.out.print("A,");
	}
	class B extends Main4{
		// as super process is not throwing any exception
		//this also cant throw any so
		public void process() throws IOException() {
			super.process();
			System.out.print("B,");
			throw new IOException();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
