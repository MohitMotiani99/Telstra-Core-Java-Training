package com.prac;

public class Main10 {

	public enum Dogs{
		collie,harrier,shephard
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs mydog = Dogs.shephard;
		switch(mydog) {
			case collie :
				System.out.println("collie");
			default ://case default:
				System.out.println("retriever");
			case harrier:
				System.out.println("x");
		}
	}

}
