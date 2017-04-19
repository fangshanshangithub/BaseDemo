package com.java.thread;

public class ThreadTest2 {

	public static void main(String args[]) {
		for (int i = 0; i < 100; i++) {
			System.out.println("***" + Thread.currentThread().getName());
			MyRunnable runnable = new MyRunnable();
			
			MyThread thread = new MyThread(runnable);
			
			thread.start();
			
		}
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("MyRunnable is run!!!");
		for (int i = 0; i < 100; i++) {
			System.out.println("@@@" + Thread.currentThread().getName());
		}
		
	}
	
}

class MyThread extends Thread {

	public MyThread(Runnable runnable) {
		super(runnable);
	}
	
	@Override
	public void run() {
		System.out.println("MyThread is run!!!");
		for(int i = 0; i < 100; i++) {
			System.out.println("---" + Thread.currentThread().getName());
		}
	}
}