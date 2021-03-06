package com.test.redis;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		Jedis jedis = getJedis();
		
		
		redisSetGet(jedis);
		
		
		redisAppend(jedis);
		
		
	}

	private static void redisAppend(Jedis jedis) {
		System.out.println("================redis Append 拼接value=========================");
		Long flag = jedis.append("ff", "FFFFFFFFFFFFFF"); //拼接
		System.out.println("redis append方法执行之后value的长度:" + jedis.get("ff").length());
		System.out.println("redis append方法调用之后value值变为:" + jedis.get("ff") + "; append方法返回值:" + flag + ";");
		
	}

	/**
	 * redis set(key,value)和get(key)方法.
	 * 如果set成功 返回 字符串"OK";
	 * 如果get成功 返回value值，失败返回 null
	 * @param jedis
	 */
	public static void redisSetGet(Jedis jedis) {
		System.out.println("================== Readis Set和Get方法 ====================");
		String flag = jedis.set("ff", "sssssss");
		System.out.println("redis set方法返回值:" + flag + ";");
		
		System.out.println("redis get方法返回值[存在返回value]:" + jedis.get("ff") + ";");
		System.out.println("redis get方法返回值[不存在]:" + (jedis.get("ffdds") == null ? "是null" : "不是null") + ";");
	}

	public static Jedis getJedis() {
		//连接redis服务器，192.168.10.110:6379
		Jedis jedis = new Jedis("192.168.10.110",6379);
		System.out.println(jedis.ping());
		
		//权限认证
		//jedis.auth("admin");  
		return jedis;
	}

}
