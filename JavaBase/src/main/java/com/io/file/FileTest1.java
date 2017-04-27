package com.io.file;

import java.io.File;

public class FileTest1 {

	public static void main(String args[]) {
		// file 获取文件通过绝对的地址 最好是 "/"
		//File file = new File("D:/git/BaseDemo/JavaBase/src/main/resources/file.txt");
		
		File file = new File("D:/git/BaseDemo/JavaBase/src/main/resources/file11.txt");
		
		if (file.isFile() && !file.isDirectory()) {
			file.mkdir();
		}
		
		System.out.println("该file是不是文件：" + file.isFile());
		System.out.println("file 是否存在：" + file.exists());
		System.out.println("文件名称：" + file.getName());
		System.out.println("文件大小：" + file.getTotalSpace() + "byte;" + file.getTotalSpace()/1024 +"Kb;" + file.getTotalSpace()/(1024*1024) +"M");
		System.out.println("父目录：" + file.getParent());
		
	}
	
}
