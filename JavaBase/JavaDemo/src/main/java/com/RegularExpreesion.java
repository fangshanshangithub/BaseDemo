package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式.
 *  // 反斜杠
	/t 间隔 ('/u0009')
	/n 换行 ('/u000A')
	/r 回车 ('/u000D')
	/d 数字 等价于[0-9]
	/D 非数字 等价于[^0-9]
	/s 空白符号 [/t/n/x0B/f/r]
	/S 非空白符号 [^/t/n/x0B/f/r]
	/w 单独字符 [a-zA-Z_0-9]
	/W 非单独字符 [^a-zA-Z_0-9]
	/f 换页符
	/e Escape
	/b 一个单词的边界
	/B 一个非单词的边界
	/G 前一个匹配的结束
	^为限制开头
	^java     条件限制为以Java为开头字符
	$为限制结尾
	java$     条件限制为以java为结尾字符
	.  条件限制除/n以外任意一个单独字符
	java..     条件限制为java后除换行外任意两个字符
 * @author fangss
 */
public class RegularExpreesion {

	public static void main(String[] args) {
		Pattern pattern = null;
		// ( // 反斜杠   )
		method_01("24324//sfd\\sf//sfd\\sf/ds", pattern);
		

	}
	
	/**
	 *  // 反斜杠   
	 */
	private static void method_01(String value, Pattern pattern) {
		System.out.println("原字符串：" + value);
		pattern = Pattern.compile("");
		Matcher matcher = pattern.matcher(value);
		
		System.out.println(matcher.matches() + ";规则参数：" + pattern.pattern());
		System.out.println(matcher.replaceFirst("*"));
	}

}
