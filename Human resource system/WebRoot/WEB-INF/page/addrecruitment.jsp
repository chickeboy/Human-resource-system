<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-lg-6">
	<div class="form-group">
		<label>添加招聘</label>
	</div>
	<div class="form-group">
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
	<button type="submit" id="button" class="btn btn-default">Submit</button>
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
					};
				}else{
				
				$("#position").append("<option>--该部门没有职位 --</option>");
				}
			}
		});
	});

	$("#button").click(function() {
		$.ajax({
			type : "POST",
			url : "addrecruitment.action",
			data : {
				department : $("#department").val(),
				position : $("#position").val()
			},
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	});
</script>