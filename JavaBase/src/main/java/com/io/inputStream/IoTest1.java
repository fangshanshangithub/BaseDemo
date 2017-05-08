package com.io.inputStream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class IoTest1 {

	public static void main(String[] args) throws Exception {
		char c ;
		Reader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下'q' 键退春");
		
		do {
			c = (char) br.read();
			System.out.println(c);
	    } while(c != 'q');
		
	}

}
