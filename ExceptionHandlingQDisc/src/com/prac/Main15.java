package com.prac;

class TestException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7082990734902319595L;
	
}

public class Main15 {

	public String sayHello(String name) throws TestException {
		if(name==null)
			throw new TestException();
		
		return "Hello "+name;
	}
	public static void main(String[] args) throws TestException {
		// TODO Auto-generated method stub
		
		Main15 a = new Main15();
		String str = null;
		System.out.println(a.sayHello(str));
		
	}

}
