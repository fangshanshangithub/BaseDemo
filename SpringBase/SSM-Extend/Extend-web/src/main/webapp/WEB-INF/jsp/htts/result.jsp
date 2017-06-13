<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>result.jsp</title>
</head>
<body>



        您的请求头信息为：<br>
  Host: ${host }<br><br><br>
  User-Agent: ${userAgent }<br><br><br>
  Accept: ${accept }<br><br><br>
  Accept-Language: ${acceptLanguage }<br><br><br>
  Accept-Encoding: ${acceptEncoding }<br><br><br>
  Cookie: ${cookie }<br><br><br>
  Connection: ${conn }<br><br><br>
  cookie2:${cookie2 }<br><br><br>

</body>
</html>