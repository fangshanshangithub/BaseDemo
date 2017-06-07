package com.cn.hnust.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/user")
public class UserController {

	// 日志功能
	public static Logger logger = Logger.getLogger(UserController.class);
	
	@Autowired
	private IUserService userService;

	public List<User> list = null;
	
	public PageInfo<User> userPage = null;
	
	/**
	 *  默认显示用户列表
	 *  GET方法 相当于 查询.
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET)
	public String index(ModelMap model){
		if (list == null) {
			list = userService.getUserList();
		}
		model.addAttribute("list", list);
		return "index";
	}
	
	/**
	 * 新增保存用户
	 * POST方法 相当于 增加.
	 * @param model
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST)
	public String add(User user, ModelMap model){
		if (user != null) {
			userService.save(user);
		}
		if (list == null) {
			list = userService.getUserList();
		}
		list.add(user);
		return "index";
	}
	
    /**
     * 查看用户详细信息
     * @param id
     * @return ModelAndView
     */
    @RequestMapping(method=RequestMethod.GET,value="{id}")
    public String viewUser(@PathVariable("id")String id, ModelMap model){
        User user = userService.getUserById(Integer.parseInt(id));
        model.addAttribute("user",user);
        return "detail";
    }
     
    /**
     * 删除用户
     * @param id
     */
    @ResponseBody
    @RequestMapping(method=RequestMethod.DELETE,value="{id}")
    public String deleteUser(@PathVariable("id")String id){
    	userService.delete(Integer.parseInt(id));
        return "suc";
    }
     
    /**
     * 跳转到编辑页面
     * @param id
     * @return ModelAndView
     */
    @RequestMapping("{id}/edit")
    public String toEdit(@PathVariable("id")String id){
         
        User user = userService.getUserById(Integer.parseInt(id));
        ModelMap model=new ModelMap();
        model.addAttribute("user",user);
         
        return "edit";
    }
     
    /**
     * 更新用户并跳转到用户列表页面
     * @param user
     * @return ModelAndView
     */
    @RequestMapping(method=RequestMethod.PUT)
    public String edit(User user){
    	userService.update(user);
        return "redirect:/user/";
    }
     
	
	/**==============================================================================================**/
	
	
	
	
	
	
	
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
