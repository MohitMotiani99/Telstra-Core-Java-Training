package com.prac;

import java.util.List;

public class Test {
	
	public static <T> void printList(T[] alist) {
		for(T t:alist)
			System.out.println(t);
	}
	public static void printList2(List<?> x) {
		for(Object o:x) {
			System.out.println(o);
		}
	}
	//Only collections can use ?
	// Normal arrays use generic parameters
}
