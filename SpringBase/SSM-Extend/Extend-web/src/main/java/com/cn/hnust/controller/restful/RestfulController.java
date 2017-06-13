package com.cn.hnust.controller.restful;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.hnust.controller.base.BaseController;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import com.github.pagehelper.PageInfo;
/**
 * restful 架构例子
 * @author fangss
 */

@Controller
@RequestMapping("/user")
public class RestfulController extends BaseController {

	// 日志功能
	public static Logger logger = Logger.getLogger(RestfulController.class);
	
	@Autowired
	private IUserService userService;

	//public List<User> list = null;
	
	public PageInfo<User> userPage = null;
	
	/**
	 *  默认显示用户列表
	 *  GET方法 相当于 查询.
	 * @param model
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model){
		/*if (list == null) { // 这种写法会有一个bug，list只会保存第一次得到的数据
			list = userService.getUserList();
		}*/
		List<User> list = userService.getUserList();//该方法最好，可以随时看到最新的数据信息
		model.addAttribute("list", list);
		
		return "restful/index";
	}
	
	/**
	 * 新增保存用户
	 * GET方法  跳转到add页面.
	 * @param model
	 * @return
	 */
	@RequestMapping(value="add")
	public String add(){
		return "restful/add";
	}
	
	/**
	 * 新增保存用户
	 * POST方法  跳转到add页面.
	 * @param model
	 * @return
	 */
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String addPost(User user, ModelMap model, HttpServletResponse response){
		logger.info("******" + user.toString());
		if (user != null) {
			userService.save(user);
		}
		/*
		 * return "redirect:/user"
		 * 正常跳转：但是浏览器URL显示有问题
		 * 浏览器的地址：http://localhost:8080/Extend-web/user?webPath=http%3A%2F%2Flocalhost%3A8080%2FExtend-web
		 * return "redirect:user" 
		 * 报错了
		 * 浏览器的地址：http://localhost:8080/Extend-web/user/user?webPath=http%3A%2F%2Flocalhost%3A8080%2FExtend-web
		 * 
		 * ##　出现?webPath=.... 是因为继承了 BaseController,有一个前置操作设置webPath 
		 * */
		 for (Map.Entry<String, Object> entry : model.entrySet()) {
			 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		 }
		 model.clear();
		 logger.info("****** model 清空数据之后遍历结果 ******");
		 for (Map.Entry<String, Object> entry : model.entrySet()) {
			 System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		 }
		
		return "redirect:/user";
	}
    /**
     * 查看用户详细信息
     * GET 方法相当于查询
     * @param id
     * @return String
     */
    @RequestMapping(method = RequestMethod.GET,value = "{id}")
    public String viewUser(@PathVariable("id")String id, ModelMap model){
        User user = userService.getUserById(Integer.parseInt(id));
        model.addAttribute("user",user);
        return "restful/view";
    }
     
    /**
     * 删除用户
     * @param id
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.DELETE,value="{id}")
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
    public String toEdit(@PathVariable("id")String id , ModelMap model){
        /* 坑坑坑坑坑坑坑坑坑坑
         * ModelMap model = new ModelMap();
         * model.addAttribute("user",user);
         * 无法把user 放到页面中，必须在 toEdit()中 制定
         */
        User user = userService.getUserById(Integer.parseInt(id));
        model.addAttribute("user",user);
         
        return "restful/edit";
    }
     
    /**
     * 更新用户并跳转到用户列表页面
     * @param user
     * @return ModelAndView
     */
    @RequestMapping(method=RequestMethod.PUT)
    public String edit(User user){
    	userService.update(user);
        return "redirect:/user";
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
