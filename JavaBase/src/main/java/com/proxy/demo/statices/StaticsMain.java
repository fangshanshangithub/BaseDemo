package com.proxy.demo.statices;

public class StaticsMain {

	public static void main(String[] args) {
		
		StudentServiceProxy proxy = new StudentServiceProxy(new StudentServiceImpl());
		
		proxy.lean();
	}

}
