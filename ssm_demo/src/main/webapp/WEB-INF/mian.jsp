<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<!-- 加入jQuery的js库 -->
<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
</script>

<script type="text/javascript">
	//当网页加载完毕后，自动执行
	$(document).ready(function() {
		showUsers();
	});
	function showUsers() {
		$.ajax({
			type:'post', 
			url:'getAllEmployee.do',
			dataType:"json",
			success:function(list) { 
				 var str = "<table border='1'>";
				 str += "<tr><th>id</th><th>name</th><th>phone</th><th>pwd</th><th>address</th></tr>";
				 for (i = 0; i < list.length; i++) {
					var user = list[i];
					str += "<tr><td>"+user.id+"</td><td>"+user.name+"</td><td>"+user.phone+"</td><td>"+user.pwd+"</td><td>"+user.address+"</td></tr>";
				 }
				 str += "</table>";
				 $("#userDiv").html(str);
			},
			error:function() {//当执行失败后自动执行
				alert("失败");
			}
		});
	}
</script>
</head>
<body>
	<button onclick="showUsers();">刷新</button>
	<div id="userDiv">
		 这是显示用户信息的地方
	</div>
</body>
</html>

