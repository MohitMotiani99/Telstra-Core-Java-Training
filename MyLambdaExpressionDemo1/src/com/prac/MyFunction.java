package com.prac;

@FunctionalInterface
interface MyFunction {
	//public int apply(int n1,int n2);
	public int apply2(int n1,int n2);
}
//A functional interface is an interface that contains only one abstract method. 
//They can have only one functionality to exhibit. From Java 8 onwards,
//lambda expressions can be used to represent the instance of a functional interface. 
//A functional interface can have any number of default methods.

//SO giving the tag makes no diff in the main
//bcoz only one no ndeafult func can be there
