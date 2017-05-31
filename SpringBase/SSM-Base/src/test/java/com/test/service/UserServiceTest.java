package com.test.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.test.base.TestBase;

public class UserServiceTest extends TestBase{
    private static Logger logger = Logger.getLogger(UserServiceTest.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  
}  
