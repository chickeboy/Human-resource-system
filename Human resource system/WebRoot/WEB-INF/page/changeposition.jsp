<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-lg-6">
	<div class="form-group">
		<label>调岗</label>
	</div>
	<div class="form-group">
		<div class="form-group">
			<label style="vertical-align: inherit;"> ID </label> <input
				id="userid" readonly="readonly" type="text" class="form-control"
				style="width: 500px;" value="${employee.id}">
		</div>
		<div class="form-group">
			<label style="vertical-align: inherit;"> 姓名 </label> <input id="name"
				readonly="readonly" type="text" class="form-control"
				style="width: 500px;" value="${employee.name}">
		</div>
		<label>Input Select</label> <select id="department" name="department"
			class="form-control">
			<option>--请选择职位 --</option>
			<c:forEach items="${departmentlist}" var="list">
				<option value="${list.name}">${list.name}</option>
			</c:forEach>
		</select>
	</div>
	<div class="form-group">
		<label>Input Select</label> <select id="position" name="dep"
			class="form-control">
			<option>--请选择职位 --</option>
		</select>
	</div>
	<button type="submit" id="buttonemp" class="btn btn-default">Submit</button>
</div>
<script>
	$("#department").change(function() {
		$.ajax({
			type : "POST",
			url : "getR.action",
			data : {
				department : $("#department").val()
			},
			success : function(msg) {
				$("#position").empty();
				if (msg.length != 0) {
					for (var i = 0; i < msg.length; i++) {
						$("#position").append("<option value='" + msg[i].name + "'>" + msg[i].name + "</option>");
					}
					;
				} else {

					$("#position").append("<option>--该部门没有职位 --</option>");
				}
			}
		});
	});

	$("#buttonemp").click(function() {
		$.ajax({
			type : "POST",
			url : "changeemp.action",
			data : {
				id : $("#userid").val(),
				department : $("#department").val(),
				position : $("#position").val()
			},
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	/* 	$.ajax({
			type : "POST",
			url : "showAllEmploy.action",
			data : {
				id : $("#id").val(),
				name : ("#name").val(),
				department : $("#department").val(),
				position : $("#position").val()
			},
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		}); */
	});
</script>