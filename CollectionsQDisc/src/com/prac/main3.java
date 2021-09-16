package com.prac;

import java.util.Arrays;

public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object [] muobjects= {
				12,
				new String("foo"),
				true
		};
		
		Arrays.sort(muobjects);
		for(int i=0;i<muobjects.length;i++) {
			System.out.println(muobjects[i].toString());
		}
	}

}
