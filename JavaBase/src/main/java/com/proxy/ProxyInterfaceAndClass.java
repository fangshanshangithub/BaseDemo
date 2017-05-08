package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * java 动态代理 用到的接口 InvocationHandler和 类 Proxy
 * 
 * 
 *    代理模式，是常用的设计模式。特征是，代理类与委托类有相同的接口，代理类主要负责为委托类预处理消息、过滤消息、把消息转发给委托类。以及事后处理消息。 
    		代理类和委托类，存在着关联关系。代理类的对象本身并不真正实现服务，知识通过调用委托类的对象的相关方法。
                 代理类可以分为两种：静态代理和动态代理。 
 
	静态代理：
	    代理类是由程序员创建，或由工具生成的代码 编译成的。在程序运行前，
	    代理类的 *.class文件已经存在了。直接就可以运行 。
	 
	动态代理：
	    	动态代理的代理类。没有直接由源代码生成。动态代理类的对象是在程序运行时由Java反射机制动态生成，
	    	不需要手工编写源代码。从而提高了软件的可扩展性。JAVA反射机制可以生成任意类型的动态代理类
 * 
 * 
 */
public class ProxyInterfaceAndClass extends Proxy implements InvocationHandler{
	
	public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) throws IllegalArgumentException{
		return "";
		// Proxy 类
		//loader:　　一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
		//interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
		//h:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
		
		
	}

	protected ProxyInterfaceAndClass(InvocationHandler h) {
		super(h);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// InvocationHandler 接口
		// proxy:　　指代我们所代理的那个真实对象
	   	// method:　　指代的是我们所要调用真实对象的某个方法的Method对象
		// args:　　指代的是调用真实对象某个方法时接受的参数
		return null;
	}

}
