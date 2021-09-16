package com.prac;

public class Reversenum {
	
	private int n;
	
	public Reversenum(int n) {
		super();
		this.n=n;
	}
	public int getN() {
		return n;
	}
	public int getRevnum() {
		int rnum=0,rem=0;
		while(n!=0) {
			rem=n%10;
			rnum=rnum*10+rem;
			n/=10;
		}
		return rnum;
	}
}
