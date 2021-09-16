package com.prac;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		
		System.out.println();
		
		List<Object> olist = new ArrayList<Object>();
		olist.add(10);
		olist.add(20);
		olist.add(30);
		
		//System.out.println(Test.sumOfList(olist));
		
		//System.out.println(Test.sumOfList1(ilist));
		
		System.out.println(Test.sumOfList(ilist));
		System.out.println(Test.sumOfList1(olist));
		System.out.println(Test.maximum(3, 5, 16));
		// Number is super class for Integer,Double,Byte etc , in themselves they have
				//not much relation
		
		Student s1 = new Student(10,"xxx",85);
		Student s2 = new Student(10,"xxx",65);
		Student s3 = new Student(10,"xxx",95);
		
		
		System.out.println(Test.maximum(s1, s2, s3));
		System.out.println(Test.eopdateMarks(33.4, s2));
		
		System.out.println(Test.doSome(43, 43.5));
	}

}
