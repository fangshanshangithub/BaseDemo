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
	/*public static LazySingleton getSingle() {
		if(single == null) {
			single = new LazySingleton();
		}
		return single;
	}*/
	
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
	 * 最佳方案 
	 * 定义一个静态私有变量(不初始化，不使用final关键字，使用volatile
	 * 保证了多线程访问时single变量的可见性，
	 * 避免了single初始化时其他变量属性还没赋值完时，被另外线程调用)
	 */ 
	private static volatile LazySingleton single;
	
	public static LazySingleton getSingle() {
		// 对象实例化时与否判断（不使用同步代码块，instance不等于null时，直接返回对象，提高运行效率）
		if(single == null) {
			//同步代码块（对象未初始化时，使用同步代码块，保证多线程访问时对象在第一次创建后，不再重复被创建）
			synchronized (LazySingleton.class) {
				if(single == null) {
					single = new LazySingleton();
				}				
			}
		}
		return single;
				 
	}
	
	
	public static void main(String[] args) {

	}

}
