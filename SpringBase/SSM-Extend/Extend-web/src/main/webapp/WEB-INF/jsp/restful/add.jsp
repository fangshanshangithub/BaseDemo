<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>add.jsp</title>
</head>
<body>
    <div style="margin:0 auto;width:400px;">
        <form action="${webPath}/user/add" method="post">
            <table>
                <tr>
                    <th>用户名称</th>
                    <th>用户密码</th>
                    <th>用户age</th>
                </tr>
                <tr>
                    <td><input type="text" name="userName" id="userName" />
                    </td>
                    <td><input type="password" name="password" id="password" />
                    </td>
                    <td><input type="text" name="age" id="age" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="保存用户" />
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>