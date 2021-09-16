package com.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class main37 {

	public <T extends Comparable > T findLarger(T x,T y) {
		System.out.println(x.getClass());
		System.out.println(y.getClass());
		if(x.compareTo(y)>0)
			return x;
		else
			return y;
	}
	//returns classes to convert to int first get .doublevalue then explicit conv
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		main37 t = new main37();
		double d= t.findLarger(123.0, 234.55).doubleValue();
		int x = (int)d;
		System.out.println(x);
		//Object y= t.findLarger(123, "456");
		
		//Collections.reverseOrder()//imposes reverse logic of the comparator given as input
		
//		ArrayList a = (ArrayList) Arrays.asList("1","2","3","4");
		ArrayList<String> a = new ArrayList<String>();
		a.add("1");a.add("3");a.add("2");
		Collections.sort(a,Collections.reverseOrder());
		System.out.println(a);
		System.out.println(Collections.binarySearch(a, "1",Collections.reverseOrder()));
		//binary search in decr order
		//for incr order just first 2 params
		//if number not found random negative value
		
		
	}

}
