package com.prac;

import java.util.Scanner;
import java.util.Stack;


class node{
	int data;
	node next,prev;
	public node(int data, node next, node prev) {
		super();
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
	public node getPrev() {
		return prev;
	}
	public void setPrev(node prev) {
		this.prev = prev;
	}
	
	
}
public class MidStack{
	public static void main(String[] args) {
		Stack<node> s= new Stack<node>();
		/**
		 * 1.push
		 * 2.pop
		 * 3.getMid
		 * 4.deleteMid
		 */
		node mid=null;
		Scanner in = new Scanner(System.in);
		
		int ch= in.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter element");
			if(s.size()==0) {
				s.push(new node(in.nextInt(),null,null));
				mid=s.peek();
			}
			else {
				s.push(new node(in.nextInt(),s.peek(),null));
				mid=mid.next;
			}
			break;
		case 2:
			if(s.size()==0)
				System.out.println("No pop");
			else {
				System.out.println("popped is "+s.pop());
				if(s.size()%2==1)
					mid=mid.prev;
			}
			break;
		case 3:
			if(mid==null)
				System.out.println("No mid");
			else
				System.out.println(mid.data);
			break;
		case 4:
			if(mid==null)
				System.out.println("No Mid");
			else if(s.size()%2==0) {
				node t = mid;
				mid=t.prev;
				
			}
		default:
			break;
		}
		
		in.close();
		
	}
}