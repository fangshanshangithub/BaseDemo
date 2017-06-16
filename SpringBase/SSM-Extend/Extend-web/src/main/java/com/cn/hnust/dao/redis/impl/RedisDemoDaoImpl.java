package com.cn.hnust.dao.redis.impl;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.cn.hnust.dao.redis.IRedisDemoDao;
import com.cn.hnust.untils.RedisJedisUntils;

import redis.clients.jedis.Jedis;

@Repository
public class RedisDemoDaoImpl implements IRedisDemoDao{
	
	private static Logger logger = Logger.getLogger(RedisDemoDaoImpl.class);
	
	private Jedis jedis  = new  RedisJedisUntils().getJedis();
	
	@Override
	public boolean saveString(String key, String value) {
		String flag= jedis.set(key, value);
		logger.info("****saveString:" + flag + "*****;");
		return "OK".equals(flag) ? true : false;
	}


	@Override
	public Object getValue(String key) {
		Object obj = jedis.get(key);
		return obj;
	}

	@Override
	public boolean saveMaps(String key, Map valueMap) {
		return false;
	}


	@Override
	public boolean delKey(String key) {
		Long lon = jedis.del(key);
		logger.info("****delKey:" + lon + "*****;");
		return lon > 0;
	}


	@Override
	public boolean saveStringAppend(String key, String value) {
		Object obj = jedis.get(key);
		if (obj == null) {
			String str = jedis.set(key, value);
			logger.info("****saveStringAppend:" + str + "*****;");
		}
		else {
			Long lon = jedis.append(key, value);
			logger.info("****saveStringAppend:" + lon + "*****;");
		}
		return true;
	}

}
