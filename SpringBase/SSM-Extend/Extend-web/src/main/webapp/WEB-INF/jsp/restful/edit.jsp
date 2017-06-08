<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="UTF-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
<title>edit.jsp</title>
</head>
<body>
    <div style="margin:0 auto;width:400px;">
        <form action="${webPath }/user" method="post">
        <!--此隐藏域可以被HiddenHttpMethodFilter所处理，然后分发到不同的HttpMethod的处理器上-->
        <input type="hidden" name="_method" value="put" />
            <table>
                <tr>
                    <th>用户ID</th>
                    <th>用户名称</th>
                </tr>
                <tr>
                    <td><input type="text" name="userId" id="userId" value="${user.userId }" readonly="readonly"/>
                    </td>
                    <td><input type="text" name="userName" id="userName" value="${user.userName }"/>
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