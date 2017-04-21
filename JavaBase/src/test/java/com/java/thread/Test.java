package com.java.thread;

public class Test {
	public static void main(String args[]) {
		Thread t1 = new Thread(new TestOne(true));
		Thread t2 = new Thread(new TestOne(false));

		t1.start();
		t2.start();
	}
}

class TestOne implements Runnable {
	private boolean flag;
	
	TestOne(boolean flag) {
		flag = flag;
	}
	public void run() {
		if(flag) {
			synchronized(MyLock.locka) {
				System.out.println("if locka");
				synchronized(MyLock.lockb) {
					System.out.println("if lockb");
				}
			}
		}
		else {
			synchronized(MyLock.locka) {
				System.out.println("if else locka");
				synchronized(MyLock.lockb) {
					System.out.println("if else lockb");
				}
			}
		}
	}
	
}

class MyLock {
	static Object locka = new Object();
	static Object lockb = new Object();
}

