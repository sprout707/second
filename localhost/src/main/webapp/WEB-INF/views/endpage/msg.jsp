<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<script type="text/javascript" src="/localhost/resources/js/jquery/jquery-2.0.0.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		var msg = "${msg }";
		if(msg != null){
			alert("${msg}");
		}
		
		var path = "${path }";
		if(path != null){
			location.href = path;
		}
	});
</script>

