package com.prac;

import java.io.FileNotFoundException;
import java.io.IOException;

class Master{
	String doFileStuff() throws FileNotFoundException{
		return "a";
	}
}

public class Main17 extends Master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			s = new Main17().doFileStuff();
		}catch(Exception x) {
			s="b";
		}
		System.out.println(s);
	}
	
	String doFileStuff() throws NumberFormatException{
		return "b";
	}

}
