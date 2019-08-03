<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'scess.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">-->
	<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
  </head>
  
  <body>
   	登陆成功 @${loginuser.username}登陆类型${loginuser.type}
   	<a href="goResume.action">简历界面</a>
   	<a href="getAllResume.action">查看简历</a>
   	<a href="getAllrecruitment.action">查看招聘信息界面</a>
   	<a href="getMyInterview.action">查看我的面试</a>
   	<br>
  </body>
</html>
