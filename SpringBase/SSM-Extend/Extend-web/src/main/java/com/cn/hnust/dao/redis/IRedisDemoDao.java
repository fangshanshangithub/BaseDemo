package com.cn.hnust.dao.redis;

import java.util.Map;

public interface IRedisDemoDao {
	/**
	 * 通过 key 获取 value值
	 * @param key
	 * @return
	 */
	public Object getValue(String key);
	
	/**
	 * 通过 key 删除 value值
	 * @param key
	 * @return
	 */
	public boolean delKey(String key);
	
	/**
	 * redis 存储字符串
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean saveString(String key, String value);
	
	/**
	 * 存储字符串，如果key对应的value存在，则拼接字符串
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean saveStringAppend(String key, String value);
	
	/**
	 * 存储 Map
	 * @param key
	 * @param valueMap
	 * @return
	 */
	public boolean saveMaps(String key, Map valueMap);
	
}
