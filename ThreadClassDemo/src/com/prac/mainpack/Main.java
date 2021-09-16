package com.prac.mainpack;

import com.prac.threadpack.ThreadClass1;
import com.prac.threadpack.ThreadClass2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadClass1 tob1 = new ThreadClass1();
		Thread t1 = new Thread(tob1);
		
		t1.setName("thread1");
		t1.start();
		
		Thread t2 = new Thread(tob1);
		t2.setName("thread2");
		t2.start();
		
		
		
		
	}

}
