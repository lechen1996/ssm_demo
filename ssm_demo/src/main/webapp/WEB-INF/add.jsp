<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/ssm_demo/addEmployee" method="post">
年龄：<input type="text" name="age"/><span>${agemsg}</span><br>
姓名：<input type="text" name="name" /><span>${namemsg}</span><br>
性别：<input type="text" name="sex" /><span>${sexmsg}</span><br>
地址：<input type="text" name="address" /><span>${addressmsg}</span><br>
<input type="submit" value="添加"/><br>
</form>
</body>
</html>