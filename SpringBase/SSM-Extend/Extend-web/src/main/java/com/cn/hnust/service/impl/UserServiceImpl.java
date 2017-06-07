package com.cn.hnust.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userDao;
	
	@Override
	public User getUserById(int userId) {
		return userDao.selectByPrimaryKey(userId);
	}

	@Override
	public List<User> getUserList() {
		return userDao.selectAllList();
	}

	@Override
	public List<User> getUserPageRowBounds(RowBounds rowBounds) {
		return userDao.selectAllListRowBounds(rowBounds);
	}

	@Override
	public PageInfo<User> getUserPageInfo(User user, int pageNum, int pageSize) {
		//获取第pageNum页，pageSize条内容，默认查询总数count
		PageHelper.startPage(pageNum, pageSize);
		List<User> userList = userDao.selectAllList();
		//用PageInfo对结果进行包装
		PageInfo<User> page = new PageInfo<User>(userList);
		return page;
	}

	@Override
	public boolean save(User user) {
		return userDao.insertSelective(user) > 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteByPrimaryKey(id) > 0;
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return userDao.updateByPrimaryKeySelective(user) > 0;
	}

}
