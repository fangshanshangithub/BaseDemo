package com.java.thread;

/**
 *构建了一个信用卡账户，起初信用额为100w，然后模拟透支、存款等多个操作。显然银行账户User对象是个竞争资源，
 *而多个并发操作的是账户方法oper(int x)，当然应该在此方法上加上同步，并将账户的余额设为私有变量，禁止直接访问。
 * 
 * @author fangss
 */
public class BankMoney {
	public static void main(String args[]) {
		User user = new User();
		user.setUserName("fangss");
		user.setMoney(100);
		Thread t1 = new Thread(new OperRunnable(user,10),"t1");
		Thread t2 = new Thread(new OperRunnable(user,10),"t1");
		Thread t3 = new Thread(new OperRunnable(user,10),"t1");
		Thread t4 = new Thread(new OperRunnable(user,10),"t1");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
	
}


class OperRunnable implements Runnable {
	private User user;
	private Integer count;
	
	public OperRunnable(User user, Integer count) {
		super();
		this.user = user;
		this.count = count;
	}
	public void run() {
		user.oper(count);
	}
	
}




class User {
	private String userName;
	
	private Integer money;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getMoney() {
		return money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public synchronized void oper(int i){
		this.money += i;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", money=" + money + "]";
	}
	
	
}