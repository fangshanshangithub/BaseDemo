package com.java.thread;

public class ThreadA {

	public static void main(String args[]) {
		ThreadB threadb = new ThreadB();
		threadb.start();
		System.out.println(threadb.total);
		synchronized(threadb) {
			try {
				threadb.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(threadb.total);
		}
		System.out.println(threadb.total);
	}
}

class ThreadB extends Thread {
	 int total = 0;
	 public void run() {
		 synchronized(this) {
			 for(int i = 0; i < 100; i++){
				 total += i;
			 }
			 notify();
		 }
	 }
	 
}