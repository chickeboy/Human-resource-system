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

<title>My JSP 'page-login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>Nixon : Widget</title>

<!-- ================= Favicon ================== -->
<!-- Standard -->
<link rel="shortcut icon" href="http://placehold.it/64.png/000/fff">
<!-- Retina iPad Touch Icon-->
<link rel="apple-touch-icon" sizes="144x144"
	href="http://placehold.it/144.png/000/fff">
<!-- Retina iPhone Touch Icon-->
<link rel="apple-touch-icon" sizes="114x114"
	href="http://placehold.it/114.png/000/fff">
<!-- Standard iPad Touch Icon-->
<link rel="apple-touch-icon" sizes="72x72"
	href="http://placehold.it/72.png/000/fff">
<!-- Standard iPhone Touch Icon-->
<link rel="apple-touch-icon" sizes="57x57"
	href="http://placehold.it/57.png/000/fff">

<!-- Styles -->
<link href="fontAwesome/css/fontawesome-all.min.css" rel="stylesheet">
<link href="css/lib/themify-icons.css" rel="stylesheet">
<link href="css/lib/bootstrap.min.css" rel="stylesheet">
<link href="css/lib/nixon.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body class="bg-primary">
	<div class="Nixon-login">
	<div class="container">
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="login-content">
						<div class="login-logo">
							<a href="index.html"><span>人力资源管理系统</span></a>
						</div>
						<div class="login-form">
							<h4>用户登陆</h4>
							<form action="login.action">
								<div class="form-group">
									<label>用户名：</label>
									<input type="text" class="form-control" name="username">
								</div>
								<div class="form-group">
									<label>密   码：</label>
									<input type="password" class="form-control" name="password">
								</div>
								<div class="checkbox">
									<label>
										<input type="checkbox"> 记住我
									</label>
									<label class="pull-right">
										<a href="page-reset-password.html">忘记密码?</a>
									</label>
									
								</div>
								<button type="submit" class="btn btn-primary btn-flat m-b-30 m-t-30">登陆</button>
								<div class="social-login-content">
									<div class="social-button">
										<button type="button" class="btn btn-primary bg-facebook btn-flat btn-addon m-b-10"><i class="ti-facebook"></i>Sign in with facebook</button>
										<button type="button" class="btn btn-primary bg-twitter btn-flat btn-addon m-t-10"><i class="ti-twitter"></i>Sign in with twitter</button>
									</div>
								</div>
								<div class="register-link m-t-15 text-center">
									<p>没得账号 ? <a href="pageregister.action">去注册</a></p>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
  </body>
</html>
