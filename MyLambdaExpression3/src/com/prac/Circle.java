package com.prac;

public abstract class Circle {
	String color;
	double radius;
	public Circle(String color, double radius) {
		super();
		this.color = color;
		this.radius = radius;
	}
	public abstract String paint();
}
