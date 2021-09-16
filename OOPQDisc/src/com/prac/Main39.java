package com.prac;

public class Main39 {

	private int id;
	public Main39(int id) {
		this.id=id;
	}
	public void updateId(int newId) {
		id=newId;
	}
	public void hey() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main39 m = new Main39(42);
		m.updateId(69);
		System.out.println(m.id);
		
		
		
	}

}
