<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>이 페이지의 모달과 css, 자바스크립트만 가져서 메인페이지에 옮겨주세요</title>

<!-- 제이쿼리 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery/jquery-2.0.0.js"></script>

<!-- 부트스트랩 -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/boot/css/bootstrap.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/boot/js/bootstrap.min.js"></script>

</head>
<body>

<script>
	$(function()
	{
		$("#modal_open").click(function()
		{
			//1단계 모달 열기
		});
		
		$("#first").click(function()
		{
			var email=$("email").val();
			
			if(email=="")
			{
				//없다고 알려주기
				//포커싱하기
			}
			
			$.post('${pageContext.request.contextPath}/user/userpwfirst', {email: email}, function(data)
			{
				if(data=='false')
				{
					//없다고 알려주기
					//다시 입력하라고 포커싱해주기
					return;
				
				}
				
				if(data=='true')
				{
					//지금 모달창 끄고 다음꺼 틀기
				
				}
				
			});
		});
		
	});
	
	
</script>


<h2>이 페이지의 모달과 css, 자바스크립트만 가져서 메인페이지에 옮겨주세요</h2>

<div>
	<h3>비밀번호 찾기</h3>
	<span>가입하신 이메일을 입력해주세요.</span>
	<form>
		<input type="email"  id="email" name="email">
		<input type="button" id="first" value="다음">
	</form>
</div>

<button id="modal_open">클릭</button>


</body>
</html>