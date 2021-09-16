package com.prac;

public class p1 {

	public static Object m(){
		Object o = new Long(123L);
		Object[] oa = new Object[1];
		oa[0]=o;
		o=null;
		System.out.println(o);
		System.out.println(oa[0]);
		oa[0]=null;
		return o;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		m();
	}

}
