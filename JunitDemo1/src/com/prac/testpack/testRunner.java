package com.prac.testpack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class testRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Result result = JUnitCore.runClasses(EvenTest.class);
		for(Failure f: result.getFailures())
			System.out.println(f.toString());
		System.out.println(result.wasSuccessful());
		
	}

}
