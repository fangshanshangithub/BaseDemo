<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>view.jsp</title>
</head>
<body>
   <div style="margin:0 auto;width:400px;">
        <form action="${webPath }/user" method="post">
            <table>
                <tr>
                    <th>用户ID</th>
                    <th>用户名称</th>
                </tr>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <td colspan="2"><input type="button" value="返回用户列表"
                        onclick="history.go(-1)" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>