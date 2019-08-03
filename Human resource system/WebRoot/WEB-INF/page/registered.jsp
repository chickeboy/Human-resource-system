<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'registered.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
</head>

<body>
	<form action="registered.action" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username" id="username"></td>
				<td><p style="color: red;" id="userp"></p></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" id="password" name="password"></td>
				<td><p style="color: red;" id="passp"></p></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit"></td>
				<td></td>
			</tr>
		</table>
	</form>
	<script type="text/javascript">
		$("#username").blur(function() {
			var username = $("#username").val();
			if (username == "") {
				$("#userp").text("用户名不能为空");
			} else {
				$.ajax({
					type: "POST",
					url : "registeredusername.action",
					data : {
						username : $("#username").val()
					},
					success : function(msg) {
						if (msg) {
							$("#userp").text("");
						} else {
							$("#userp").text("用户名不可用");
						}
					}
				});
			}
		});
		$("#password").blur(function() {
			var password = $("#password").val();
			if (password == "") {
				$("#passp").text("密码不能为空");
			} else {
				$("#passp").text("");
			}
		});
	</script>
</body>
</html>
