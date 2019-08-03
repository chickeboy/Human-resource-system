$("#attendance").click(function() {
	$.ajax({
		type : "POST",
		url : "getattendancedays.action",
		success : function(msg) {
			$(".container-fluid").empty();
			$(".container-fluid").append(msg + "");
		}
	});
});