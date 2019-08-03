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

$("#resume").click(function() {
	$.ajax({
		type : "POST",
		url : "getAllResume.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#recruit").click(function() {
	$.ajax({
		type : "POST",
		url : "getrecruitment.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#addresume").click(function() {
	$.ajax({
		type : "POST",
		url : "addresume2.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
$("#myinterview").click(function() {
	$.ajax({
		type : "POST",
		url : "getMyInterview.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});
