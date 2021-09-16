package com.prac.prgpack;

public class Counter {
	public int count;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int inc() {
		return ++count;
	}
	public int dec() {
		return --count;
	}
	
}
