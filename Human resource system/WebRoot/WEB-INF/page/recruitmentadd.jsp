<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'recruitment.jsp' starting page</title>

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
	<form action="addrecruitment.action" method="post">
		<select id="department" name="department">
			<option>--选择部门--</option>
			<c:forEach items="${list}" var="list">
				<option value="${list.name}">${list.name}</option>
			</c:forEach>
		</select> <select id="position" name="position">
			<option>--选择部门--</option>
		</select>
		<input type="submit">
	</form>
	<script type="text/javascript">
		$("#department").change(function() {
			$.ajax({
				type : "POST",
				url : "getR.action",
				data : {
					department : $("#department").val()
				},
				success : function(msg) {
					$("#position").empty();
					for(var i = 0;i<msg.length;i++){
						$("#position").append("<option value='" + msg[i].name + "'>" + msg[i].name + "</option>");
					};
				
					/* removeAll();
					if (msg == "") {
						$("#position").append("<option value=''>暂无市</option>"); //为Select追加一个Option
					} else {
						for (var i = 0; i < msg.length; i++) {
							$("#position").append("<option value='" + msg[i].name + "'>" + msg[i].name + "暂无市</option>");
						}
					}; */
				}
			});
		});
	</script>
</body>
</html>
