package com.java.thread;

public class TicketTest {
	public static void main(String args[]) {
		Runnable ticket = new Ticket();
		Thread t1 = new Thread(ticket, "t1");
		Thread t2 = new Thread(ticket, "t2");
		Thread t3 = new Thread(ticket, "t3");
		Thread t4 = new Thread(ticket, "t4");
		
		t1.start();
		t2.start();
	}
}

class Ticket implements Runnable {
	private static int ticketCount = 100;
	
	public synchronized void run() {
		while(true){
			if(ticketCount > 0) {
				/*try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				 ticketCount--;
				 System.out.println("当前剩余票：" + ticketCount + "--" + Thread.currentThread().getName());
			
			}
		}
		
		
		
	}
	
}