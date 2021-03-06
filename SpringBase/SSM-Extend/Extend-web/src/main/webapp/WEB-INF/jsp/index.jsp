<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>

	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" />
	<title>测试</title>
	<link rel="stylesheet" type="text/css" href="resources/css/index.css" />

</head>
<body>
	<table>
		<thead>
			<tr>
				<th>序号</th>
				<th>用户ID</th>
				<th>用户姓名</th>
				<th>用户年龄</th>
			</tr>
		</thead>
		<tbody>
			 <c:forEach var="list" items="${list}" varStatus="status" >
                <tr>
                	
                	<td>${status.count}</td>
                    <td>${list.id}</td>
                    <td>${list.userName}</td>
                    <td>
                        <a href="user/${list.id}/edit">编辑用户</a>
                        <a href="user/${list.id}">查看用户</a>
                        <a href="javascript:void(0);" onclick="deleteUser(${list.id})">删除该用户</a>
                    </td>
                </tr>
            </c:forEach>
		</tbody>
		
	</table>	



</body>
</html>