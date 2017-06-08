package com.cn.hnust.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.cn.hnust.pojo.User;

public interface UserMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAllList();
    
    List<User> selectAllListRowBounds(RowBounds rowBounds);
    
}