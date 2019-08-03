<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="col-lg-6" style="width: 100%;background-color: white;">
	<div class="card alert">
		<div class="card-header">
			<h4>我的招聘列表</h4>
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
						<td>姓名</td>
						<td>生日</td>
						<td>年龄</td>
						<td>工作经历</td>
						<td>自我评价</td>
						<td>部门名</td>
						<td>职位名</td>
						<td>状态</td>
						<td>操作</td>
						<td></td>
						<td>面试时间</td>

					</tr>
				</thead>
				<tbody>
					<c:forEach items="${interviewlist}" var="list">
						<tr>
							<td>${list.id}</td>
							<td>${list.resume.name}</td>
							<td>${list.resume.birthday}</td>
							<td>${list.resume.age}</td>
							<td>${list.resume.experience}</td>
							<td>${list.resume.assessment}</td>
							<td>${list.department.name}</td>
							<td>${list.position.name}</td>
							<c:if test="${list.interview==1}">
								<td><span class="badge badge-primary"> <a
										style="vertical-align: inherit;"> 已通过 </a>
								</span></td>
							</c:if>
							<c:if test="${empty list.interview}">
								<td><span class="badge badge-success"> <a
										style="vertical-align: inherit;"> 未处理 </a>
								</span></td>
							</c:if>
							<c:if test="${list.interview==2}">
								<td><span class="badge badge-danger"> <a
										style="vertical-align: inherit;"> 已拒绝 </a>
								</span></td>
							</c:if>
							<c:if test="${list.interview != 1}">
								<td class="agree">接受面试</td>
								<td class="disagree">拒绝面试</td>
							</c:if>
							<c:if test="${list.interview == 1}">
								<td></td>
								<td></td>
							</c:if>
							<td>${list.interviewtime}</td>
						</tr>
					</c:forEach>
					<!-- <tr>
						<th scope="row">1</th>
						<td>Kolor Tea Shirt For Man</td>
						<td><span class="badge badge-primary">Sale</span></td>
						<td>January 22</td>
						<td class="color-primary">$21.56</td>
					</tr>
					<tr>
						<th scope="row">2</th>
						<td>Kolor Tea Shirt For Women</td>
						<td><span class="badge badge-success">Tax</span></td>
						<td>January 30</td>
						<td class="color-success">$55.32</td>
					</tr>
					<tr>
						<th scope="row">3</th>
						<td>Blue Backpack For Baby</td>
						<td><span class="badge badge-danger">Extended</span></td>
						<td>January 25</td>
						<td class="color-danger">$14.85</td>
					</tr> -->
				</tbody>
			</table>
		</div>
	</div>
	<!-- /# card -->
</div>
<!-- /# column -->

<script>
	$(".agree").click(function() {
		var time = prompt("面试时间", "");
		$.ajax({
			type : "POST",
			url : "agreed.action",
			data : {
				time : time,
				id : $(this).parent().find('td').eq(0).html()
			},
			success : function(msg) {
				$(".container-fluid").empty();
				$(".container-fluid").append(msg + "");
			}
		});
	});
	$("#disagreed").click(function() {
		alert("不同意");
	});
</script>
