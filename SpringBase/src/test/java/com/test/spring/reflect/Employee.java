package com.test.spring.reflect;

public class Employee {

	public String id;
	
	public String name;
	
	public Integer age;
	
	public Employee() {
		System.out.println("employeeInstance");
	}

	public Employee(String id, String name, Integer age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public void say() {
		System.out.println("id:" + id + ";name:" + name +";age:" + age);
	}
	
	public void work() {
		System.out.println("Empoyee  is  working!");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
