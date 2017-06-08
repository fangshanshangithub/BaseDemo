package com.cn.hnust.pojo.vo;

/**
 * 自定义项目中的所有Url和Method的映射信息.
 * Spring MVC 项目获取所有URL到Controller Method的映射.
 * @author fangss
 */
public  class RequestToMethodItem {
	
    public String controllerName;
    
    public String methodName;
    
    public String requestType;
    
    public String requestUrl;
    
    public Class<?>[] methodParmaTypes;

    public RequestToMethodItem(String requestUrl, String requestType, //
    		String controllerName, String requestMethodName, Class<?>[] methodParmaTypes){
        this.requestUrl = requestUrl;
        this.requestType = requestType;
        this.controllerName = controllerName;
        this.methodName = requestMethodName;
        this.methodParmaTypes = methodParmaTypes;

    }
}