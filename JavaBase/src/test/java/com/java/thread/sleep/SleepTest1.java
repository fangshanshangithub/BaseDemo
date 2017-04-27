package com.java.thread.sleep;

public class SleepTest1 {

		public static void main(String args[]) {
			Thread t1 = new ThreadS1("t1");
			Thread t2 = new ThreadS1("t2");
			
			t1.start();
			t2.start();
			
		}
}

class ThreadS1 extends Thread {
	public ThreadS1(String name) {
		super(name);
	}
	Bird bird = new Bird();
	public void run() {
		if("t1".equals(Thread.currentThread().getName())) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		bird.talk(10);
	}
}

class Bird {
	public static int i = 0;
	
	public static int j = 0;
	
	public Bird(){
		i = i++;
	}
	
	public void talk(int k) {
		for(int i = 0; i < k; i++){
			System.out.println(Thread.currentThread().getName() + "--talk()--第" + i + "次执行！！static i = " + Bird.i + ";static j = " + Bird.j);
		}
	}
	
	public static  void say(int k) {
		for(int i = 0; i < k; i++){
			System.out.println(Thread.currentThread().getName() + "--say()--第" + i + "次执行！static i = " + Bird.i + ";static j = " + Bird.j);
		}
	}
	
}