package com.prac;

class Message{
	String getText() {return "text";}
}

public class Main53 extends Message{

	String getText() {
		return "text";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Main53().getText());
	}

}
