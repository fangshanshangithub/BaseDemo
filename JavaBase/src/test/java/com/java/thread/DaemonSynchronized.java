package com.java.thread;

public class DaemonSynchronized {

	public static void main(String args[]) {
		Runnable run = new Run1();
		Runnable run2 = new Run2();
		Thread t1 = new Thread(run, "t1");
		Thread t2 = new Thread(run2, "t222222");
		t2.setDaemon(true);
		
		
		t1.start();
		t2.start();
		
		
	}
}

class Run1 implements Runnable {
	public void run() {
		for(int i = 0; i < 20; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---" + i + ";");
		}
	}
}

class Run2 implements Runnable {
	public void run() {
		for(int i = 0; i < 120; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "---" + i + ";");
		}
	}
}