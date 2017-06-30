package com.fangss.main;

import com.fangss.untils.properties.PropertiesUtils;

public class PropertiesMain {
	public static void main(String args[]) {
		//test1.properties 文件和工具类PropertiesUtils 在同一个包中所以直接test1.properties文件名称
		System.out.println(PropertiesUtils.read("test1.properties").getProperty("test1"));  
		
		//test2.properties 文件在com.test.untils.properties中所以要写绝对路径
		System.out.println(PropertiesUtils.read("/com/test/untils/properties/test2.properties").getProperty("test2"));
		
		//test3.properties 文件在src/main/resources的properties文件夹中
		System.out.println(PropertiesUtils.read("/properties/test3.properties").getProperty("test3"));
		
		System.out.println(PropertiesUtils.readKeyValue("/properties/test3.properties", "test3"));
		
		System.out.println(System.getProperty("user.dir"));
	}
}
