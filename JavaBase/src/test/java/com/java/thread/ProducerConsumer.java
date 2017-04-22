package com.java.thread;

public class ProducerConsumer {

	public static void main(String args[]) {
		Entrepot ent = new Entrepot();
		ent.setMax_count(100);

		System.out.println(ent.toString());
		
		ConsumerThread consumer1 = new ConsumerThread(ent, 20, "消费者1");
		ConsumerThread consumer2 = new ConsumerThread(ent, 40, "消费者2");
		ConsumerThread consumer3 = new ConsumerThread(ent, 10, "消费者3");
		
		consumer1.start();
		consumer2.start();
		consumer3.start();
		System.out.println(ent.toString());
	}
}









class ConsumerThread extends Thread {
	private Entrepot entrepot;

	private Integer sum;
	
	public ConsumerThread(Entrepot entrepot, Integer sum, String name) {
		super(name);
		this.entrepot = entrepot;
		this.sum = sum;
	}
	
	public void run() {
			entrepot.consumer(sum);
	}
}


class ProducerRunable implements Runnable {
	private Entrepot entrepot;

	private Integer sum;
	
	public ProducerRunable(Entrepot entrepot, Integer sum) {
		this.entrepot = entrepot;
		this.sum = sum;
	}
	
	public void run() {
		entrepot.producer(sum);
	}
}
class Entrepot {
	private Integer max_count = 100;
	
	private Integer count = 0;

	public synchronized void producer(int sum){
		while(count + sum > max_count){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.count += sum;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + "---" + this.count);
		
	}
	
	public synchronized void consumer(int sum){
		while(count < sum){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.count -= sum;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + "---" + this.count);
	}
	
	public Integer getMax_count() {
		return max_count;
	}

	public void setMax_count(Integer max_count) {
		this.max_count = max_count;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Entrepot [max_count=" + max_count + ", count=" + count + "]";
	}
	
	
	
}