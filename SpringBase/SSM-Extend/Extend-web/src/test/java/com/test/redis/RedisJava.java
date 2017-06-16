package com.test.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		//连接redis服务器，192.168.10.110:6379
		Jedis jedis = new Jedis("192.168.10.110",6379);
		System.out.println(jedis.ping());
		
		//权限认证
		//jedis.auth("admin");  
		
		
		String s = jedis.set("ff", "sssssss");
		
		System.out.println(jedis.get("ff") + "----" + s);
		
		System.out.println("====================================");
		jedis.append("ff", "FFFFFFFFFFFFFF"); //拼接
		System.out.println(jedis.get("ff"));
		
	}

}
