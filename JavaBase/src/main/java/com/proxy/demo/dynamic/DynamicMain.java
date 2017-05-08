package com.proxy.demo.dynamic;

public class DynamicMain {

	public static void main(String[] args) {
		
		IUser target = new UserImpl();
		
		UserProxy proxy = new UserProxy(target);
		
		IUser  user = (IUser) proxy.newProxy();
		user.say();

	}

}
