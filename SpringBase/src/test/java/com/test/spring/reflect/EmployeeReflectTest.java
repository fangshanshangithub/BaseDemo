package com.test.spring.reflect;

public class EmployeeReflectTest {

	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> cl = Class.forName("com.test.spring.reflect.Employee");
		
		System.out.println("Class.forName获取class:" + cl.getName());
		
		System.out.println(cl.getSuperclass().getName());
		
	}
}
