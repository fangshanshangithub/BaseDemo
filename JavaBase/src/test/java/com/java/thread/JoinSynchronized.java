package com.java.thread;

public class JoinSynchronized {

	public static void main(String args[]) {
		Thread t1 = new ThreadJoin("joinThread");
		t1.start();
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "第" + i + "次执行");
			
			if(i < 3) {
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
}

class ThreadJoin extends Thread {
	
	public ThreadJoin(String name) {
		super(name);
	}

	public void run() {
		for(int i = 0; i < 40; i++) {
			System.out.println("*****线程" + Thread.currentThread().getName() + "第" + i + "次执行");
		}
	}
}