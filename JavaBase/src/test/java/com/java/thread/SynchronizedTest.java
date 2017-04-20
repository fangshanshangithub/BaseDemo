package com.java.thread;

public class SynchronizedTest {

	public static void main(String args[]) {
		Runnable thr1 = new MyRunnable1();
		Runnable thr2 = new MyRunnable1();
		Thread thread1 = new Thread(thr1, "线程1");
		Thread thread2 = new Thread(thr2, "线程2");
		thread1.start();
		thread2.start();
	}
}


class MyRunnable1 implements Runnable {
	public Method method = new Method();
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			//System.out.println(Thread.currentThread().getName() + "--循环次数--" + i);
				method.say();
		}
		
	}
}

class Method {
	private static int i = 0;
	public  void say() {
		System.out.println(Thread.currentThread().getName() + "---" + i++);
	}
}