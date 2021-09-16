package com.prac;

class sample{
	public int x,y;
	public sample(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "sample [x=" + x + ", y=" + y + "]";
	}
	
}

public class Extra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int x=3;
		System.out.println(x);
		man(x);
		System.out.println(x);
		System.out.println("---------");
		final Integer y = 3;
		System.out.println(y);
		man(y);
		System.out.println(y);
		System.out.println("---------");
		final sample s = new sample(5,6);
		System.out.println(s);
		man(s);
		System.out.println(s);
		//s= new sample(8,10);
		//wrong
		System.out.println("---------");
		String str="hey";
		System.out.println(str);
		man(str);
		System.out.println(str);
	}
	static void man(String s) {
		s+=" yo!";
	}
	static void man(sample s) {
		++s.x;
		//sample z=s;
		//++z.x;
		s= new sample(8,10);
	}
	static void man(Integer x) {
		x=8;
	}
	static void man(int x) {
		x=4;
	}
}
