package com.prac;

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			args=null;
			args[0]="test";
		}
//		catch(Exception ex) {
//			System.out.println("Exception");
//		}
//		catch(NullPointerException npe) {
//			System.out.println("Null");
//		}
		finally {
			System.out.println("finally");
		}
	}

}
