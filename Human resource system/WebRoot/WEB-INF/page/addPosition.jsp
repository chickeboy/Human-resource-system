<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<form action="addposition.action" method="post">
<div class="col-lg-6">
	<div class="form-group">
		<label>添加职位</label> <input class="form-control" name="name" type="text"
			value="职位名" >
	</div>
	<div class="form-group">
		<label>Input Select</label> <select name="dep" class="form-control">
			<c:forEach items="${departmentlist}" var="list">
				<option value="${list.name}">${list.name}</option>
			</c:forEach>
		</select>
	</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</div>
</form>