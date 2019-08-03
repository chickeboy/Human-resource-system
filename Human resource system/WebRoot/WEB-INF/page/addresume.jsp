<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-lg-6" style="width: 100%">
	<div class="form-group">
		<label style="font-size: 20px;">添加简历</label>
	</div>
		<div style="float: left;width: 45%">
			<div class="form-group">
				<label style="vertical-align: inherit;"> 姓名 </label> <input
					id="name" type="text" class="form-control" style="width: 500px;">
			</div>
			<div class="form-group" style="margin-top: 30px;">
				<label style="vertical-align: inherit;"> 生日 </label> <input
					id="birthday" type="text" class="form-control"
					style="width: 500px;">
			</div>
			<div class="form-group" style="margin-top: 30px;">
				<label style="vertical-align: inherit;"> 年龄</label> <input
					id="age" type="text" class="form-control" style="width: 500px;">
			</div>
			<button style="margin-top: 30px; width: 500px;height: 40px"
				type="submit" class="btn btn-primary btn-block m-b-10" id="submitresume">Submit</button>
		</div>
		<div style="float: left; margin-left: 30px;width: 45%">
			<div class="form-group">
				<label style="vertical-align: inherit;"> 工作经历 </label>
				<textarea id="experience" rows="6" class="form-control"></textarea>
			</div>
			<div class="form-group">
				<label style="vertical-align: inherit;"> 自我评价 </label>
				<textarea id="assessment" rows="6" class="form-control"></textarea>
			</div>
		</div>
</div>
<script>
$("#submitresume").click(function() {	
	$.ajax({
		type : "POST",
		url : "addresume.action",
		data : {
			name : $("#name").val(),
			birthday : $("#birthday").val(),
			age : $("#age").val(),
			experience : $("#experience").val(),
			assessment : $("#assessment").val(),
		},
		success : function(msg) {			
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		},
	});
});

</script>