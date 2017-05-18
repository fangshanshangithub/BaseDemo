package com.design.mode.singleton;

/**
 * 饿汉式 的单例模式
 * 不存在 多线程同步问题，避免 synchronized造成的性能问题
 * 
 * @author Fangss
 */
public class EagerSingleton {
	// private 构造方法
	private EagerSingleton() {
	}
	
	/* static 保证了当LazySingleton被加载时，静态变量会被创建并分配内存空间，
	该静态变量会一直占着这段内存（即使没有用到这个类的实例），当类被卸载时，静态变量被摧毁，
	并释放所占有的内存，因此在某些特定条件下会耗费内存。*/
	private static EagerSingleton singleton = new EagerSingleton();
	
	//static 的 getSingleton 方法是便于通过 类名直接调用方法（EagerSingleton.getSingleton()）
	public static EagerSingleton getSingleton() {
		return singleton;
	}
	
	
	// test 测试
	public static void main(String args[]) {
		EagerSingleton single = EagerSingleton.getSingleton();
		System.out.println(single.toString());
	}
	
}


