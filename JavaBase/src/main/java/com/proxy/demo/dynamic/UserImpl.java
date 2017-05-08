package com.proxy.demo.dynamic;

public class UserImpl implements IUser {

	@Override
	public void say() {
		System.out.println(this.getClass().getName() + " --- say()");

	}

}
