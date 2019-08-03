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

<title>My JSP 'index_tourists.jsp' starting page</title>

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
<link href="css/lib/mmc-chat.css" rel="stylesheet" />
<link href="css/lib/sidebar.css" rel="stylesheet">
<link href="css/lib/bootstrap.min.css" rel="stylesheet">
<link href="css/lib/nixon.css" rel="stylesheet">
<link href="lib/lobipanel/css/lobipanel.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.2.js"></script>

</head>

<body>
	<div
		class="sidebar sidebar-hide-to-small sidebar-shrink sidebar-gestures">
		<div class="nano">
			<div class="nano-content">
				<ul>
					<li class="active"><a class="sidebar-sub-toggle"><i
							class="ti-home"> </i> Dashboard <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li><a href="indexadmin.action">Dashboard 1</a></li>
						</ul></li>
					<li><a id="departmentmain" class="sidebar-sub-toggle"><i
							class="ti-layout"></i> 部  门 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li id="adddepartment"><a>添加部门</a></li>
						</ul></li>
					<li><a id="positionlist" class="sidebar-sub-toggle"><i
							class="ti-medall-alt"></i> 职  位 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li id="addPosition"><a>添加职位</a></li>
						</ul></li>
					<li id="recruitment"><a class="sidebar-sub-toggle"><i
							class="ti-bookmark-alt"></i>招  聘 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li id="recruitmentadd"><a>添加招聘</a></li>
						</ul>
						<ul>
							<li id="allinterview"><a>查看招聘信息</a></li>
						</ul></li>
						<li id="transfer"><a class="sidebar-sub-toggle"><i
							class="ti-flickr-alt"></i>调  岗 </a></li>
						<li id="transfer"><a class="sidebar-sub-toggle"><i
							class="ti-direction-alt"></i>培   训 <span
							class="sidebar-collapse-icon ti-angle-down"></span></a>
						<ul>
							<li><a>部门培训</a></li>
						</ul>
						<ul>
							<li><a>员工培训</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="header">
		<div class="pull-left">
			<div class="logo">
				<a href="index.html"> <img id="logoImg" src="logo/logo.png"
					data-logo_big="logo/logo.png" data-logo_small="logo/logoSmall.png"
					alt="Nixon" />
				</a>
			</div>
			<div class="hamburger sidebar-toggle">
				<span class="ti-menu"></span>
			</div>
		</div>
		<div class="pull-right p-r-15">
			<ul>
				<li class="header-icon dib"><i class="ti-bell"></i>
					<div class="note-count">2</div>
					<div class="drop-down">
						<div class="dropdown-content-heading">
							<span class="text-left">Recent Notifications</span>
						</div>
						<div class="dropdown-content-body">
							<ul>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/3.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Mr. Jane</div>
											<div class="notification-text">5 members joined today</div>
										</div>
								</a></li>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/3.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Mariam</div>
											<div class="notification-text">likes a photo of you</div>
										</div>
								</a></li>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/3.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Tasnim</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/3.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Jane Roe</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li class="text-center"><a href="#" class="more-link">See
										All</a></li>
							</ul>
						</div>
					</div></li>
				<li class="header-icon dib"><i class="ti-email"></i>
					<div class="note-count">21</div>
					<div class="drop-down">
						<div class="dropdown-content-heading">
							<span class="text-left">2 New Messages</span> <a
								href="app-email.html"><i class="ti-pencil-alt pull-right"></i></a>
						</div>
						<div class="dropdown-content-body">
							<ul>
								<li class="notification-unread"><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/1.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Jane Doe</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li class="notification-unread"><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/2.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Jane Roe</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/3.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Jane Doe</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li><a href="#"> <img
										class="pull-left m-r-10 avatar-img"
										src="assets/images/avatar/2.jpg" alt="" />
										<div class="notification-content">
											<small class="notification-timestamp pull-right">02:34
												PM</small>
											<div class="notification-heading">Jane Roe</div>
											<div class="notification-text">Hi Teddy, Just wanted to
												let you ...</div>
										</div>
								</a></li>
								<li class="text-center"><a href="#" class="more-link">See
										All</a></li>
							</ul>
						</div>
					</div></li>
				<li class="header-icon dib chat-sidebar-icon"><i
					class="ti-comments"></i></li>
				<li class="header-icon dib"><img class="avatar-img"
					src="images/avatar/1.jpg" alt="" /> <c:if
						test="${empty loginuser}">
						<span class="user-avatar" id="nologin">登陆/注册</span>
					</c:if> <c:if test="${!empty loginuser}">
						<span class="user-avatar">${loginuser.username} <i
							class="ti-angle-down f-s-10"></i></span>
						<div class="drop-down dropdown-profile">
							<div class="dropdown-content-heading">
								<span class="text-left">Upgrade Now</span>
								<p class="trial-day">30 Days Trail</p>
							</div>
							<div class="dropdown-content-body">
								<ul>
									<li><a href="#"><i class="ti-user"></i> <span>Profile</span></a></li>
									<li><a href="#"><i class="ti-wallet"></i> <span>My
												Balance</span></a></li>
									<li><a href="#"><i class="ti-write"></i> <span>My
												Task</span></a></li>
									<li><a href="#"><i class="ti-calendar"></i> <span>My
												Calender</span></a></li>
									<li><a href="#"><i class="ti-email"></i> <span>Inbox</span></a></li>
									<li><a href="#"><i class="ti-settings"></i> <span>Setting</span></a></li>
									<li><a href="#"><i class="ti-help-alt"></i> <span>Help</span></a></li>
									<li><a href="#"><i class="ti-lock"></i> <span>Lock
												Screen</span></a></li>
									<li><a href="#"><i class="ti-power-off"></i> <span>Logout</span></a></li>
								</ul>
							</div>
						</div>
					</c:if></li>
			</ul>
		</div>
	</div>




	<script src="js/lib/jquery.min.js"></script>
	<!-- jquery vendor -->
	<script src="js/lib/jquery.nanoscroller.min.js"></script>
	<!-- nano scroller -->


	<div class="content-wrap">
		<div class="main">
			<div class="container-fluid"></div>
		</div>
	</div>
	<script src="js/lib/sidebar.js"></script>
	<!-- sidebar -->
	<script src="js/lib/bootstrap.min.js"></script>
	<!-- bootstrap -->
	<script src="js/lib/mmc-common.js"></script>
	<script src="js/lib/mmc-chat.js"></script>
	<!--  Chart js -->
	<script src="js/lib/chart-js/Chart.bundle.js"></script>
	<script src="js/lib/chart-js/chartjs-init.js"></script>
	<!-- // Chart js -->
	<!--  Datamap -->
	<script src="js/lib/datamap/d3.min.js"></script>
	<script src="js/lib/datamap/topojson.js"></script>
	<script src="js/lib/datamap/datamaps.world.min.js"></script>
	<script src="js/lib/datamap/datamap-init.js"></script>
	<script src="lib/lobipanel/js/lobipanel.js"></script>
	<!-- // Datamap -->
	<script src="js/scripts.js"></script>
	<script src="js/myjs.js"></script>
	<!-- scripit init-->
	<script>
		$(document).ready(function() {
			$('#lobipanel-custom-control').lobiPanel({
				reload : false,
				close : false,
				editTitle : false
			});
		});
	
		$("#nologin").click(function() {
			window.location.href = "pagelogin.action";
		});
	</script>
</body>
</html>
