package com.prac;

public class Notifier implements Runnable{
	private Message msg;

	public Notifier(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		System.out.println(name+" started ");
		try {
			Thread.sleep(1000);
//			synchronized (msg) {
				msg.setMsg(name +" Notifier work done ");
				msg.notifyAll();
			//}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	
}
