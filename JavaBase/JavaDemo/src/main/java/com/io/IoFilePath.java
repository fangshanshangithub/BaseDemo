 
package com.io;

import java.io.File;

/**
 * 
 * IO 文件路径问题.
 * @author FangSS
 */
public class IoFilePath {

	public static void main(String[] args) {
		//*我们留意filepath的内容，java.io默认定位到当前用户目录("user.dir")下，即：工程根目
		System.out.println("工程目录: " + System.getProperty("user.dir"));
		
		File file = new File("IoFilePath.txt");
		System.out.println(file == null ? "Y" : "N");
		System.out.println(file.length());
		

	}

}

