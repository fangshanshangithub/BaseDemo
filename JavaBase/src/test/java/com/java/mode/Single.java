package com.java.mode;

/**
 * 单例模式---饿汉式
 * @author fangss
 *
 */
public class Single {
	private final static Single single = new Single();
	
	public Single(){
		
	}
	
	public static Single getSingle() {
		return single;
	}
}

/**
 * 懒汉式
 * @author fangss
 *
 */
class Single1 {
	private static Single1 single = null;
	
	public Single1() {
		
	}
	
	public static Single1 getSingle() {
		if(single == null) {
			single = new Single1();
		}
		return single;
	}
}


/**
 * 线程安全的 单例模式
 * @author fangss
 *
 */
class SingleThread {
	
private static SingleThread single = null;
	
	public SingleThread() {
		
	}
	
	/*public static synchronized SingleThread getSingle() {
		if(single == null) {
			single = new SingleThread();
		}
		return single;
	}*/
	
	public static  SingleThread getSingle() {
		synchronized(SingleThread.class) {
			if(single == null) {
				single = new SingleThread();
			}
			return single;
		}
		
	}
	
}

