package com.prac;

public class Main20 {
	
	public enum Dogs {
		collie,harrier
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs myDog = Dogs.collie;
		System.out.println(myDog);
		switch (myDog) {
		case collie:
			System.out.println("collie");
		case harrier:
			System.out.println("harrier");
		}
	}
//	public void hurry() {
//		enum x{
//			a,b;
//		}
//	}
}
