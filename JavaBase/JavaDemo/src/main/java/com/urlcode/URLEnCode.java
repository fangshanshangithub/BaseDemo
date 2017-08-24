package com.urlcode;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEnCode {
    private final static String ENCODE_UTF_8 = "UTF-8"; 
    
    private final static String ENCODE_GBK = "GBK";
    
    
    /**
     * URL 解码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:09:51
     */
    public static String getURLDecoderString(String str, String character) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = URLDecoder.decode(str, character);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * URL 转码
     *
     * @return String
     * @author lifq
     * @date 2015-3-17 下午04:10:28
     */
    public static String getURLEncoderString(String str, String character) {
        String result = "";
        if (null == str) {
            return "";
        }
        try {
            result = URLEncoder.encode(str, character);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 
     * @return void
     * @author lifq
     * @date 2015-3-17 下午04:09:16
     */
    public static void main(String[] args) {
    	String url = "alipay_sdk=alipay-sdk-java-dynamicVersionNo&app_id=2017042707014667&biz_content=%7B%22subject%22%3A%22%E4%B8%80%E7%93%B6%E5%86%B0%E7%BA%A2%E8%8C%B6%22%2C%22out_trade_no%22%3A%22CSRO20170824095212000000000508%22%2C%22total_amount%22%3A%220.01%22%2C%22product_code%22%3A%22QUICK_MSECURITY_PAY%22%7D&charset=UTF-8&format=JSON&method=alipay.trade.app.pay&notify_url=http%3A%2F%2F111.204.241.67%3A8090%2Falipayapp%2Fnotify&sign=fzQkCR3k%2F8wTM4Xf%2FCTkhR%2FOCn1C0Pqj%2BKK1hSKIcp2v9kCb5bJujAr7PvaGH4rRxxvR9pWewq9IpfKzLssuYqBL8tN4YWVvxfCIYu0orhG9iGQxrfdxypqQpuOhVRwyerx%2BHTlscMbG%2B%2BLJ2m4YAj%2BO6L81Gba%2Br9P4WGK7HVj%2BP7MM8sxCI%2BB9i4ceT%2FjrzG8vdGG9kh0XDBNRmFu6P2IxK2K9V3D67eL%2B5iY0nXFt4f8dtl9KSfiQfSm7SkS0%2FYYk8nbLnPBpyO8DC%2FHMbY8yRYW%2BXv2lmGHMOre4SxaemhN2C0eooO6gxTlLS93hJi8OxRjvGwySRd%2BxzVwPyA%3D%3D&sign_type=RSA2&timestamp=2017-08-24+10%3A39%3A34&version=1.0";
		String urlStr = "http://fanyi.baidu.com/?aldtype=85&keyfrom=alading#en/zh/code45供电公司发的";
		
		String gbkEncode = getURLEncoderString(urlStr, ENCODE_GBK);
		String utf8Encode = getURLEncoderString(urlStr, ENCODE_UTF_8);
        System.out.println(ENCODE_GBK + "格式URL编码\n" + gbkEncode);
        System.out.println(ENCODE_UTF_8 + "格式URL编码\n" + utf8Encode);
        
        System.out.println(ENCODE_GBK + "格式URL解码\n" + getURLDecoderString(url, ENCODE_GBK));
       
        //System.out.println(getURLDecoderString(url));
        
    }
	
}
