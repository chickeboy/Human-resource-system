$("#adddepartment").click(function() {
	$.ajax({
		type : "POST",
		url : "addpage.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#departmentmain").click(function() {
	$.ajax({
		type : "POST",
		url : "findallDepartment.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#positionlist").click(function() {
	$.ajax({
		type : "POST",
		url : "Positionlist.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#addPosition").click(function() {
	$.ajax({
		type : "POST",
		url : "findallDepartment2.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#addinterview").click(function() {
	$.ajax({
		type : "POST",
		url : "getAllInterview.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#recruitment").click(function() {
	$.ajax({
		type : "POST",
		url : "getAllrecruitment2.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});

$("#recruitmentadd").click(function() {
	$.ajax({
		type : "POST",
		url : "addrecruitment.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#department").change(function() {
	$.ajax({
		type : "POST",
		url : "getR.action",
		data : {
			department : $("#department").val()
		},
		success : function(msg) {
			$("#position").empty();
			for (var i = 0; i < msg.length; i++) {
				$("#position").append("<option value='" + msg[i].name + "'>" + msg[i].name + "</option>");
			}
			;

		/* removeAll();
		if (msg == "") {
			$("#position").append("<option value=''>暂无市</option>"); //为Select追加一个Option
		} else {
			for (var i = 0; i < msg.length; i++) {
				$("#position").append("<option value='" + msg[i].name + "'>" + msg[i].name + "暂无市</option>");
			}
		}; */
		}
	});
});

$("#myinterview").click(function() {
	$.ajax({
		type : "POST",
		url : "addrecruitment.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});

$("#allinterview").click(function() {
	$.ajax({
		type : "POST",
		url : "allinterview.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});

$("#transfer").click(function() {
	$.ajax({
		type : "POST",
		url : "showAllEmploy.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
	
