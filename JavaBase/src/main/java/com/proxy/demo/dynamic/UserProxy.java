package com.proxy.demo.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理 
 * 动态代理类只能代理接口（不支持抽象类），
 * 代理类都需要实现InvocationHandler类，实现invoke方法。
 * 该invoke方法就是调用被代理接口的所有方法时需要调用的，
 * 该invoke方法返回的值是被代理接口的一个实现类  
 * @author fangss
 *
 */
public class UserProxy implements InvocationHandler {

	private Object target;// 被代理的对象
	
	public UserProxy(Object target) {// 构造方法传入 被代理的对象
		this.target =  target;
	}
	
	//关联的这个实现类的方法被调用时将被执行  
    /*InvocationHandler接口的方法，proxy表示代理，
     * method表示原对象被调用的方法，args表示方法的参数*/  
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object rt = null;
		// 在被代理对象 调用方法之前操作自己的逻辑
		System.out.println(this.getClass().getName() + "----- 前 前 前 前 前");
		
		
		// 被代理对象  执行自己的方法
		method.invoke(target, args);
		
		// 在代理对象 调用方法之后操作自己的逻辑
		System.out.println(this.getClass().getName() + "--- 后 后 后 后");
		
		return rt;
	}
	
	
	//绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。    
	public Object newProxy() {
		
        //该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例    
        //第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器  
        //第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口  
        //第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法  
        //根据传入的目标返回一个代理对象  
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
}