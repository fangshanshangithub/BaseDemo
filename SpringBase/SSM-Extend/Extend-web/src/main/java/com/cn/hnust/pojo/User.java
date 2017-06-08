package com.cn.hnust.pojo;

import java.io.Serializable;

/**
 * mybatis UserMapper.xml返回的字段的个数和实体bean的属性必须对应起来
 * xml 返回的字段 bean中必须有，bean中的属性可以多于UserMapper.xml中返
 * 回的字段
 * @author FangSS
 */
public class User implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6216219168977341139L;

	private Integer id;

    private String userName;

    private String password;

    private Integer age;

    // 自定义字段1
    private String mark1;
    
    // 自定义字段2
    private String mark2;
    
	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

	public String getMark1() {
		return mark1;
	}

	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}

	public String getMark2() {
		return mark2;
	}

	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", age=" + age + ", mark1="
				+ mark1 + ", mark2=" + mark2 + "]";
	}
 
	
    
}