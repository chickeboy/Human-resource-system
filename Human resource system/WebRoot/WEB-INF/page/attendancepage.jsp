<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="page-header">
	<div class="page-title">
		<h1>
			<font style="vertical-align: inherit;">员工考勤</font>
		</h1>
	</div>
</div>
<div style="float: left;" class="col-lg-3">
	<div class="card">
		<div class="stat-widget-one">
			<div class="stat-icon dib">
				<i class="ti-user color-primary border-primary"></i>
			</div>
			<div class="stat-content dib">
				<div class="stat-text">
					<a style="vertical-align: inherit;">签到天数</a>
				</div>
				<div class="stat-digit">
					<a style="vertical-align: inherit;">${days}</a>
				</div>
			</div>
			<div class="button-list">
				<button id="Signinbutton"
					style="margin-left: 30px; width: 80px;height: 80px;" type="button"
					class="btn btn-info btn-rounded m-b-10 m-l-5">
					<a style="vertical-align: inherit;font-size: 20px;"><c:if
							test="${empty Sign}">签到</c:if> <c:if test="${Sign==2}">签到</c:if>
						<c:if test="${Sign==1}">签退</c:if></a>
				</button>
			</div>
		</div>
	</div>
</div>
<div style="float: left;" class="col-lg-3">
	<div class="card">
		<div class="stat-widget-one">
			<div class="stat-icon dib">
				<i class="ti-heart-broken color-danger border-danger"></i>
			</div>
			<div class="stat-content dib">
				<div class="stat-text">
					<a style="vertical-align: inherit;">请假天数</a>
				</div>
				<div class="stat-digit">
					<a style="vertical-align: inherit;">${leavedays}</a>
				</div>
			</div>
			<div class="button-list">
				<button id="leavebutton"
					style="margin-left: 30px; width: 80px;height: 80px;" type="button"
					class="btn-danger btn-rounded m-b-10 m-l-5">
					<a style="vertical-align: inherit;font-size: 20px;">请假</a>
				</button>
			</div>
		</div>
	</div>
</div>
<div style="float: left;" class="col-lg-3">
	<div class="card">
		<div class="stat-widget-one">
			<div class="stat-icon dib">
				<i class="ti-bolt color-success border-success"></i>
			</div>
			<div class="stat-content dib">
				<div class="stat-text">
					<a style="vertical-align: inherit;">加班天数</a>
				</div>
				<div class="stat-digit">
					<a style="vertical-align: inherit;">${overtime}</a>
				</div>
			</div>
			<div class="button-list">
				<button id="overtime"
					style="margin-left: 30px; width: 80px;height: 80px;" type="button"
					class="btn btn-success btn-rounded m-b-10 m-l-5">
					<a style="vertical-align: inherit;font-size: 20px;">申请</br>加班
					</a>
				</button>
			</div>
		</div>
	</div>
</div>
<script>
	$("#Signinbutton").click(function() {
		$.ajax({
			type : "POST",
			url : "Signin.action",
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	});
	$("#leavebutton").click(function() {
		$.ajax({
			type : "POST",
			url : "getleavebutton.action",
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	});
	$("#overtime").click(function() {
		if(${Sign!=1}){
			alert("请先签到");
		}else{
		
		$.ajax({
			type : "POST",
			url : "getovertime.action",
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
		}
		
	});
</script>