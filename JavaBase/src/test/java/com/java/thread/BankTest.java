package com.java.thread;

/**
 * 同步方法：
	银行
	有两个储户，分别存300元，每次存100元，存3次
	目的：该线程是否有安全问题，如果有，如何解决？
 * @author fangss
 *
 */

public class BankTest {
	public static void main(String args[]) {
		Thread t1 = new BankThread("客户1");
		Thread t2 = new BankThread("客户2");
		t1.start();
		t2.start();
	}
}

class BankThread extends Thread {
	Bank bank = new Bank();
	
	public BankThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			bank.add(100);
			System.out.println(Thread.currentThread().getName() + "：" + bank.getSum());
		}
	}
	
	
	
}

class Bank {
	private static Integer sum = 0;
	
	public synchronized void add(int count) {
		sum  = sum + count;
		System.out.println(Thread.currentThread().getName() + "存入之后银行的钱：" + sum);
	}

	public static Integer getSum() {
		return sum;
	}

	public static void setSum(Integer sum) {
		Bank.sum = sum;
	}
	
	
	
	
}