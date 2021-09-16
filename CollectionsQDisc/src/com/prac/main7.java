package com.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}

public class main7 {
	public static Object get0(List list) {
		return list.get(0);
	}
	public static Iterator reverse(List list) {
		Collections.reverse(list);
		return list.iterator();
	}
	public void assStrings(List<? super String> list) {
		list.add("foo");
		//list.add(new Object());
	}
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		
		//List<? extends B> l = new List<D>();
		//List x = new ArrayList();
		
//		for(Object obj:reverse(list)) {
//			
//		}
	}
}
