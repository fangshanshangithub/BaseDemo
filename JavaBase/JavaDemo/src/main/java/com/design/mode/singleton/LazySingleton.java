package com.design.mode.singleton;

/**
 * 懒汉式[饱汉式]  单例模式
 * @author Fangss
 */
public class LazySingleton {

	// private 构造方法
	private LazySingleton() {
	}
	
	// 没有初始化的LazySingleton 类的变量
	//private static LazySingleton single = null;
	
	//[非线程安全版本] 调用 get方法是先判断是否有 LazySingleton对象没有的话new一个
	public static LazySingleton getSingle() {
		if(single == null) {
			single = new LazySingleton();
		}
		return single;
	}
	
	 /*[线程安全版本] 这个版本的实现牺牲了一定的效率，如果logObj已经初始化，
		那么其他线程还需要同步的进入getInstance方法，会造成效率的损失
		缺点是：同步方法频繁调用时，效率略低。*/
	/*public static synchronized LazySingleton getSingle() {
		if(single == null) {
			single = new LazySingleton();
		}
		return single;
	}*/
	
	
	/*
	 * 最有方案
	 */ 
	private static volatile LazySingleton single;
	
	
	public static void main(String[] args) {

	}

}
