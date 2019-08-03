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

<title>My JSP 'setResume.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table>
		<tr>
			<td colspan="5">简历列表</td>
		</tr>
		<tr>
			<td>id</td>
			<td>name</td>
			<td>生日</td>
			<td>年龄</td>
			<td>工作经历</td>
			<td>自我评价</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${resumelist}" var="list">
			<tr>
				<td>${list.id}</td>
				<td>${list.name}</td>
				<td>${list.birthday}</td>
				<td>${list.age}</td>
				<td>${list.experience}</td>
				<td>${list.assessment}</td>
				<td><a class="operation">投递</a></td>
			</tr>
		</c:forEach>
	</table>
	<script type="text/javascript">
		$(".operation").click(function() {
			/* alert($(this).parent().parent().find('td').eq(0).html()); */
			$.ajax({
				type : "POST",
				url : "setinterview.action",
				data : {
					resumeid : $(this).parent().parent().find('td').eq(0).html()
				},
				success : function(msg) {
					window.location.href=msg+".action"
				}
			});
		});
	</script>
</body>
</html>
