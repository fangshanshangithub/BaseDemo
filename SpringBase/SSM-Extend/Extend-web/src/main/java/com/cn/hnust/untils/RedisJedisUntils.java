package com.cn.hnust.untils;

import redis.clients.jedis.Jedis;

/**
 * redis 工具类
 * @author Fangss
 */
public class RedisJedisUntils {
	
	private static Jedis jedis; //jedis 对象
	
	public RedisJedisUntils() {
		jedis = new Jedis("192.168.10.110",6379);
	}
	
	public static Jedis getJedis() {
		return jedis;
	}
	
}
