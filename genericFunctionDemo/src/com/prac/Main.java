package com.prac;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] iarr = {3,4,5};
		Product[] parr = {
				new Product(10,"hih"),
				new Product(40,"jodojff")
		};
		
		String[] sarr = {"ejf","ewoijf"};
		
		Test.printList(iarr);
		Test.printList(parr);
		Test.printList(sarr);
		Test.printList2(Arrays.asList(1,"sysy",new Product(22,"gg"),4));
		//making variable type list
		
	}

}
