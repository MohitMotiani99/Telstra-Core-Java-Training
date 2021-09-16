package com.prac;

import java.util.List;

public class Test {
	
	public static Number sumOfList(List<? extends Number> nlist) {
		double s= 0.0;
		for(Number n:nlist)
			s+=n.doubleValue();
		return s;
	}
	
	
	public static Number sumOfList1(List<? super Double> llist) {
		double s= 0.0;
		for(Object n:llist)
			s+=((Number)n).doubleValue();
		return s;
		
	}
	
	public static Number printList(List<?> list) {
		for(Object ele:list)
			System.out.println(ele+" ");
		System.out.println();
		return list.size();
	}
	
	public static <T extends Comparable<T>> T maximum(T x,T y,T z) {
		T max=x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
			max = z;
		return max;
	}
	
	public static <T extends Number,U extends Student> U eopdateMarks(T x,U y) {
		//int um = (int)(y.getMarks()+x.doubleValue());
		double um = y.getMarks()+x.doubleValue();
		y.setMarks((int)um);
		return y;
	}
	
	public static <T extends U,U extends Number> long doSome(T x,U y) {
		long ans = x.intValue() +y.intValue();
		return ans;
	}
	// can extend one of the generic parameters
	//order doesnt matter
	
	//without casting
		//using double val - error bcoz double to int not implicit
		//using int var to store 
	//with casting
		//can use double val
	//using double var
		//should give a prob lets see
		// as we see set marks takes int so error
		//can use with type casting
}
