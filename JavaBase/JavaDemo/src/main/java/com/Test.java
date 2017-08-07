package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static final String NUM = "^[0-9]*[1-9][0-9]*$";
	
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		int c = 97;
		for (int i = 1; i < 27; i++ ){
			char ch = (char)c;
			String str = ch + "";
			String ky = i + "";
			if(ky.length() == 1) {
				map.put("0" + i, str);
			}
			if (ky.length() == 2) {
				map.put(i+"", str);
			}
			
			c ++;
		}
		//System.out.println(map);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			String in = scan.nextLine();
			if (in != null && !"".equals(in.trim()) && authNum(in) ) {
				System.out.println("请输入数字！");
				continue;
			}
			if (in.length()%2 != 0) {
				System.out.println("输入数字长度有问题！");
				continue;
			}
			String retStr = "";
			while (in.length() != 0) {
				String str = in;
				String key = str.substring(0, 2);
				in = str.substring(2,str.length());
				if(map.get(key) == null) {
					System.out.println("输入的数字无对应的字母！");
					break;
				}
				retStr += map.get(key);
				
			}
			System.out.println(retStr);
			
			
				
		}
	}

	private static boolean authNum(String value) {
		Pattern pattern = Pattern.compile(NUM);
		Matcher matcher = pattern.matcher(value);
		boolean falg = matcher.matches();
		return false;
	}

}
