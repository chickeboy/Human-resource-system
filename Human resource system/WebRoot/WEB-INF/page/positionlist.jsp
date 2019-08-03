<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-lg-6" style="width: 100%;background-color: white;">
	<div class="card alert">
		<div class="card-header">
			<h4>职位列表</h4>
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
						<th>部门</th>
						<th>职位名</th>
						<th>创建日期</th>
						<th>操作部门</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${Positionlist}" var="list">
						<tr>
							<td>${list.department}</td>
							<td>${list.name}</td>
							<td>${list.creationtime}</td>
							<td><a>修改</a><a id="delet">删除</a></td>
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