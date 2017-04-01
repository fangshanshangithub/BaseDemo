package com.test.spring.chapter3;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSourceExample {

	public static void main(String args[]) {
		//String filePath = "D:/git/BaseDemo/SpringBase/src/test/resources/conf/file1.txt" ;
		
		//Resource res1 = new FileSystemResource(filePath);
		
		Resource res2 = new ClassPathResource("conf/file1.txt");
		
		try {
			//InputStream ins1 = res1.getInputStream();
			InputStream ins2 = res2.getInputStream();
			//System.out.println("res1:" + res1.getFilename());
			System.out.println("res2:" + res2.getFilename() + "\n" + res2.getURL() + "\n" + res2.getURI());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
