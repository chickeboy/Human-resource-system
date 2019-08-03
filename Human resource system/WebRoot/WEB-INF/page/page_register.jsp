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

<title>My JSP 'page_register.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>
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
							<h4>游 客 注 册</h4>
							<form action="registered.action" method="post">
								<div class="form-group">
									<label>用户名：</label> 
									<input type="text" class="form-control" name="username" id="username">
									<p style="color: red;" id="userp"></p>
								</div>
								<!-- <div class="form-group">
									<label>Email address</label>
									<input type="email" class="form-control" placeholder="Email">
									<p style="color: red;" id="passp"></p>
								</div> -->
								<div class="form-group">
									<label>密 码：</label> <input type="password" class="form-control"
										id="password" name="password">
									<p style="color: red;" id="passp"></p>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox"> 同意并接受条款
									</label>
								</div>
								<button id="register" type="submit"
									class="btn btn-primary btn-flat m-b-30 m-t-30">注 册</button>
								<div class="social-login-content">
									<div class="social-button">
										<button type="button"
											class="btn btn-primary bg-facebook btn-flat btn-addon m-b-10">
											<i class="ti-facebook"></i>Register with facebook
										</button>
										<button type="button"
											class="btn btn-primary bg-twitter btn-flat btn-addon m-t-10">
											<i class="ti-twitter"></i>Register with twitter
										</button>
									</div>
								</div>
								<div class="register-link m-t-15 text-center">
									<p>
										已经有账户 ? <a href="pagelogin.action"> 去登陆</a>
									</p>
								</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script type="text/javascript">
		$("#username").blur(function() {
			var username = $("#username").val();
			if (username == "") {
				$("#userp").text("用户名不能为空");
			} else {
				$.ajax({
					type : "POST",
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
