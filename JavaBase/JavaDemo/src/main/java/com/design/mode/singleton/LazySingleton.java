package com.design.mode.singleton;

/**
 * 懒汉式  单例模式
 * @author Fangss
 */
public class LazySingleton {

	// private 构造方法
	private LazySingleton() {
	}
	
	// 没有初始化的LazySingleton 类
	private static LazySingleton single = null;
	
	//
	public static LazySingleton getSingle() {
		if(single == null) {
			single = new LazySingleton();
		}
		return single;
	}
	
	
	
	
	public static void main(String[] args) {

	}

}
