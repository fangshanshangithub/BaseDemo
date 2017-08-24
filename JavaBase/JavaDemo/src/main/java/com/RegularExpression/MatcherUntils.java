package com.RegularExpression;

import java.util.regex.Pattern;

/**
 * 正则表达式工具类.
 * @author FangSS
 *
 */
public class MatcherUntils implements RegexConstent{
	
	public MatcherUntils() {
	}
	
	/**
	 * 一个或多个汉字.
	 * @param value 要验证的字符串
	 * @return boolean
	 */
	public static boolean isChanese(String value) {
		return Pattern.matches(REGEX_CHINESE, value);
	}
	
	
}
