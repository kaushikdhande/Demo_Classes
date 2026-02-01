package com.multiThreading;

public class WashRoomApp {

	public static void main(String[] args) {
		WashRoom w=new WashRoom();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		t1.start();
//		t1.join();
		t2.start();
//		t2.join();
		t3.start();
//		t3.join();
	}

}
class WashRoom implements Runnable{
	
	synchronized public void run() {					//synchronized is control thread and shared resources
	try {
	String tname=Thread.currentThread().getName();
	System.out.println(tname+ " is enter in Washroom ");
	Thread.sleep(3000);
	System.out.println(tname+ " is using in Washroom ");
	Thread.sleep(3000);
	System.out.println(tname+ " is existing in Washroom ");
	Thread.sleep(3000);

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
	
	
