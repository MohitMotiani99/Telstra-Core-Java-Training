package com.prac;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Giving Different Implementations to the one fun interface method");
		
		MathOps add = (int a,int b)->a+b;
		System.out.println(add.operation(10, 30));
		
		MathOps sub = (int a,int b)->a-b;
		System.out.println(sub.operation(10, 30));
		
		//no need to give data type
		//can define func ina curly braces also if long or complex
		MathOps mult = (a,b)->{
			return a*b;
		};
		System.out.println(mult.operation(10, 20));
		
		System.out.println("Passing Functional interface instances to functions");
		System.out.println(operate(2,3,mult));
		System.out.println(operate(2,3,add));
		System.out.println(operate(2,3,sub));
		
		IsprimeInterface ip = (n)->{
			for(int i=2;i<=Math.sqrt(n);i++)
				if(n%i==0)
					return false;
			return true;
		};
		System.out.println(ip.isprime(37));
		
		System.out.println("Anonymous Class Instances");
		Circle c1 = new Circle("Blue",12.2) {
			@Override
			public String paint() {
				return "Circle  "+color+" "+radius;
			}
		};
		System.out.println(c1.paint());
		
		CircleIntf ci = (color,radius)->"Circle drawn with colour "+color+"  Radius  "+radius;
	
		System.out.println(ci.paint("RED", 3.5));
		
		isEvenOddInterface ip1 =num->(num%2==0)?"even":"odd";
		System.out.println(ip1.isEvenOdd(43));
		
		System.out.println("Variable Implementations");
		
		FormatString fs1 = str->"Hello "+str;
		FormatString fs2 = str->"Welcome "+str;
		
		System.out.println(fs1.sformat("Amex"));
		System.out.println(fs2.sformat("Amex"));
		
		System.out.println("Method Reference");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(5);
		numbers.add(15);
		numbers.add(20);
		
		numbers.forEach(n->System.out.println(n+" "));
		System.out.println();
		//() not reqd for single parameter
		
		Consumer<Integer> func = n->System.out.println(n);
		numbers.forEach(func);
		//inbuilt functional interface which takes one arg and does not return anything only consumes data
		
		System.out.println("Generic function in an interface");
		GenericInterface<Integer> gp = (num1,num2)->(num1+num2);
		System.out.println(gp.process(20, 25));
		//System.out.println(gp.process(20.6, 25.64));
		//cant do this as no implict conv from double to int
		
		GenericInterface<Double> gp2 = (num1,num2)->(num1+num2);
		System.out.println(gp2.process(56.66, 5.5));
		
		
		
		
	}
	public static int operate(int a,int b,MathOps mop) {
		return mop.operation(a, b);
	}
}
