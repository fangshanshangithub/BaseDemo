package com.java.thread;

public class ThreadTest1 {
	
	public static void main(String args[]) {
		
		/*for (int i = 0; i < 30; i++) {
			System.out.println("***:" + Thread.currentThread().getName() + ";");
			
			if (i == 10) {
				Thread1 thread1 = new Thread1();
				Thread1 thread2 = new Thread1();
				
				thread1.start();
				thread2.start();
				
			}
		}*/
		for (int i = 0; i < 10; i++) {
			System.out.println("***" + Thread.currentThread().getName() + ";");
			if (i == 5) {
				Runnable runnable = new Thread2();
				Thread t1 = new Thread(runnable);
				Thread t2 = new Thread(runnable);
				
				t1.setPriority(Thread.MAX_PRIORITY);
				
				t1.start();
				t2.start();
				
			}
			
		}
		
	}
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(4000);
				System.out.println("###" + Thread.currentThread().getName() + ";");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

class Thread1 extends Thread {
	private int i = 0;
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "---" + i);
		}
	}
}