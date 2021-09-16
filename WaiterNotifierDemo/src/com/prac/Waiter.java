package com.prac;

import java.time.LocalTime;

public class Waiter implements Runnable{

	private Message msg;
	
	
	public Waiter(Message msg) {
		super();
		this.msg = msg;
	}


	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		// TODO Auto-generated method stub
		synchronized (msg) {
			try {
				System.out.println(name+" waiting to get notified at time "+ LocalTime.now());
				msg.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name+ " waiter thread got notified at time "+LocalTime.now());
			System.out.println(name+ "processed: "+msg.getMsg());
		}
	}

}
