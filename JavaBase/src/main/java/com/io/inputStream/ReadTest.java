package com.io.inputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadTest {

	public static void main(String[] args) {
		
		int count = 0;
		InputStream reader = null;
		byte[] buffer = new byte[4];
		
		try {
			reader = new FileInputStream(new File("D:/git/BaseDemo/JavaBase/src/main/resources/file.txt"));
			
			// 无缓冲池的 读取
			/*while (reader.read() != -1) {
				count ++;
			}*/
			
			while (reader.read(buffer) != -1) {
				count ++;
			}
			
		   System.out.println("count = " + count);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
