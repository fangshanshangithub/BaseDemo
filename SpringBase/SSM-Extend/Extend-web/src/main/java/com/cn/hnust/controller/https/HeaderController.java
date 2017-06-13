package com.cn.hnust.controller.https;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeaderController {
    @RequestMapping(value="/getHeader",method=RequestMethod.GET)
    public ModelAndView getHeader(
            @RequestHeader("Host") String host,
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader("Accept") String accept,
            @RequestHeader("Accept-Language") String acceptLanguage,
            @RequestHeader("Accept-Encoding") String acceptEncoding,
            @RequestHeader("Cookie") String cookie,
            @RequestHeader("Connection") String conn,
            @CookieValue("JSESSIONID") String cookie2){
        //@RequestHeader将http请求头信息赋值给形参
        //@CookieValue直接将请求头中的cookie的值赋值给形参
        ModelAndView mav=new ModelAndView();
        mav.addObject("host", host);
        mav.addObject("userAgent", userAgent);
        mav.addObject("accept", accept);
        mav.addObject("acceptLanguage", acceptLanguage);
        mav.addObject("acceptEncoding", acceptEncoding);
        mav.addObject("cookie", cookie);
        mav.addObject("conn", conn);
        mav.addObject("cookie2", cookie2);
        mav.setViewName("htts/result");  //返回值是个字符串，就是视图名
        return mav;
    }
}