package com.test.dao;

import javax.annotation.Resource;

import org.junit.Test;

import com.cn.hnust.dao.redis.impl.RedisDemoDaoImpl;
import com.test.base.TestBase;

public class IRedisDemoDaoTest extends TestBase {
    @Resource  
    private RedisDemoDaoImpl redisDemoDao; 
    
    @Test  
    public void test1() {  
        boolean flag = redisDemoDao.saveString("aaasfds11", "sfdsfdsfdsf1111111111111");  
        System.out.println(flag);  
    } 
    
    @Test  
    public void test2() {  
        Object flag = redisDemoDao.getValue("aaaq");
        
        System.out.println((String)flag);  
    }  
	
}
