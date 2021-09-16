package com.prac;

class ClassA{
	public void methodA() {
		ClassB classB = new ClassB();
		classB.getValue();
	}
}
class ClassB{
	public ClassC classC;
	public String getValue() {
		System.out.println(classC.value);
		//return classC.getValue();
		return "hry";	
	}
}
class ClassC{
	public String value;
	public String getValue() {
		this.value="ClassB";
		return value;
	}
}

public class Main21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA();
		a.methodA();
	}

}
