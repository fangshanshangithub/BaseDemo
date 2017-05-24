import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		String ss1 = "{'HEAD':{'msgId':'LPP20170412194730013910','msgCreateTime':'2017-04-14 19:18:49','sender':'B2B','receiver':'B2C','autograph':'fssss','encryptionMode':'MD5','interfaceCode':'B2B_MALL_1008'},'BODY':[]}";
		String ss = "B2B_safdsaf";
		int i = ss.indexOf("B2B_");
		
		System.out.println(i);
		ss = ss.replaceAll("B2B_","O2O_");
		
		
		System.out.println(ss);
		
		
	}

}
