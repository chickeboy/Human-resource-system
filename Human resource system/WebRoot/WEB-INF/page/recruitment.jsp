<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-lg-6" style="width: 100%;background-color: white;">
	<div class="card alert">
		<div class="card-header">
			<h4>招聘信息列表</h4>
			<div class="card-header-right-icon">
				<ul>
					<li class="card-close" data-dismiss="alert"><i
						class="ti-close"></i></li>
					<li class="card-option drop-menu"><i class="ti-settings"
						data-toggle="dropdown" aria-haspopup="true" aria-expanded="true"
						role="link"></i>
						<ul class="card-option-dropdown dropdown-menu">
							<li><a href="#"><i class="ti-loop"></i> Update data</a></li>
							<li><a href="#"><i class="ti-menu-alt"></i> Detail log</a></li>
							<li><a href="#"><i class="ti-pulse"></i> Statistics</a></li>
							<li><a href="#"><i class="ti-power-off"></i> Clear ist</a></li>
						</ul></li>

				</ul>
			</div>
		</div>
		<div class="card-body">
			<table style="width: 100%;"
				class="table table-responsive table-hover ">
				<thead>
					<tr>
						<td>id</td>
						<td>发布时间</td>
						<td>部门</td>
						<td>职位</td>
						<td>操作</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${recruitmentlist}" var="list">
						<tr>
							<td>${list.id}</td>
							<td>${list.time}</td>
							<td>${list.position}</td>
							<td>${list.department}</td>
							<td><a class="operation">投递简历</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<!-- /# card -->
</div>
<!-- /# column -->

<script type="text/javascript">
	$(".operation").click(function() {
		$.ajax({
			type : "POST",
			url : "getAllResume2.action",
			data : {
				recruitmentid : $(this).parent().parent().find('td').eq(0).html()
			},
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	});
</script>