package com.cn.hnust.controller.base;


import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;



@Controller
public class BaseController {
	
	// 日志功能
	public static Logger logger = Logger.getLogger(BaseController.class);
 
	
	@ModelAttribute
	public void baseControllerInit(HttpServletRequest request, Model model) {
		logger.info("******用户请求路径：" + request.getRequestURL() + "******;");
		
	    String path = request.getContextPath(); //返回站点的根目录
	    String webPath = request.getScheme() + "://" //返回的协议名称,默认是http
	            + request.getServerName() //Web服务器名字
	            + ":" + request.getServerPort() //服务器监听的端口
	            + path + "/";
		
	    model.addAttribute("webPath", webPath);
	}
	
	/*  1、request.getRequestURL()
		返回的是完整的url，包括Http协议，端口号，servlet名字和映射路径，但它不包含请求参数。
		2、request.getRequestURI()
		得到的是request URL的部分值，并且web容器没有decode过的
		3、request.getContextPath() 
		返回 the context of the request.
		4、request.getServletPath() 
		返回调用servlet的部分url.
		5、request.getQueryString() 
		返回url路径后面的查询字符串
		
		示例：
		当前url：http://localhost:8080/CarsiLogCenter_new/idpstat.jsp?action=idp.sptopn
		
		request.getRequestURL() http://localhost:8080/CarsiLogCenter_new/idpstat.jsp
		request.getRequestURI() /CarsiLogCenter_new/idpstat.jsp
		request.getContextPath()/CarsiLogCenter_new
		request.getServletPath() /idpstat.jsp
		request.getQueryString()action=idp.sptopn
	 */
	 
	
	
}
