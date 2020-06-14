<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style type="text/css">
			*{
				margin: 0px ;
				padding: 0px ;
			}
			
			a{
				text-decoration: none ;
			}
 
 
			.nav-header
			{
				width: 100% ;
				height:85px ;
				background: gray;
			}
			
			.head-contain
			{
				width: 700px ;
				height: 85px ;
				margin:0 auto ;
				text-align:center ;
			}
			
			.top-nav,.top-nav li,.top-right
			{
				display: inline-block ;
				vertical-align:top ;
				margin-top: 15px ;
			}
			
			.top-nav li
			{
				width: 90px ;
			}
			
			.top-nav li a
			{
				font-size: 17px ;
				color: #fff ;
				
			}
			
			.top-nav li a:hover
			{
 
				color: blue ;			
			}
			
			.top-right a
			{
				display:inline-block ;
				font-size: 17px ;
				margin-top: 10px ;
				border-radius:30px ;
			}
			
			.top-right a:first-of-type
			{
				width:75px ;
				height: 35px ;
				border:1px green solid ;
				line-height:35px ;
			}
			
			.top-right a:first-of-type:hover
			{
				color:red ;
				background: green;
			}
			
		</style>
		</head>
<body>
<h1 align="center"> <a href="/ssm_demo/add"><font size="5px">添加员工</font> </a></h1>
<div align="center" class="table">
<table border="1px">
<tr>
<th width="250px" height="50px">工号</th>
<th width="250px" >年龄</th>
<th width="250px" >姓名</th>
<th width="250px" >性别</th>
<th width="250px" >地址</th>
<th width="100px" >编辑</th>
<th width="100px" >删除</th>
</tr>
<c:forEach items="${requestScope.employees }" var="employee">
<tr>
<td align="center" height="50px">${ employee.id}</td>
<td align="center">${ employee.age}</td>
<td align="center">${ employee.name}</td>
<td align="center">${ employee.sex}</td>
<td align="center">${ employee.address}</td>
<td align="center"><a href="/ssm_demo/edieEmployee/${employee.id}">编辑</a></td>
<td align="center"><a href="/ssm_demo/deleteEmployee/${employee.id}">删除</a></td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>
