package com.cn.hnust.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	// 日志功能
	public static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;

	public List<User> userList = null;
	
	/**
	 *  GET方法 相当于 查询.
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap model){
		if (userList == null) {
			userList = userService.getUserList();
		}
		model.addAttribute("list", userList);
		return "index";
	}
	
	/**
	 * POST方法 相当于 增加.
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String add(ModelMap model){
		
		return "index";
	}
	
	
	/**
	 *  非 REST 风格
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model) {
		int userId = Integer.parseInt(request.getParameter("id")); 
		logger.info("********传过来的UserId = " + userId);
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
		return "showUser";
	}
	
	
	
}
