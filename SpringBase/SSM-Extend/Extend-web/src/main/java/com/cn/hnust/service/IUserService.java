package com.cn.hnust.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.cn.hnust.pojo.User;
import com.github.pagehelper.PageInfo;

public interface IUserService {
	
	public User getUserById(int userId);
	
	public List<User> getUserList();
	
	/** pageHelper 分页 方法1**/
	public List<User> getUserPageRowBounds(RowBounds rowBounds);
	
	/** pageHelper 分页 方法2**/
	public PageInfo<User> getUserPageInfo(User user, int pageNum, int pageSize);

	public boolean save(User user);

	public boolean delete(int parseInt);

	public boolean update(User user);
	
}
