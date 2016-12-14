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
		//1단계 모달창 열기
		$("#modal_open").click(function()
		{
			$("#modal_first").modal();
			$("#emailWarn").text("");
		});
		
		//1단계 '다음'버튼 클릭 시 로직
		$("#first").click(function()
		{
			//1. 이메일 유효성 검사
			var email=$("#email").val();
			var regex=/^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/;
			
			  //1-1. 이메일 입력값 체크 1: 입력했는지 확인
			if(email=="" || email==null)
			{
				$("#emailWarn").text("이메일을 입력하세요");
				$("#email").focus();
				return;
			}
			  //1-2. 이메일 입력값 체크 2: 이메일 유형인지 확인
			if(regex.test(email) == false)
			{
				$("#emailWarn").text("test@localhost.com 과 같은 형태의 이메일 주소를 입력하세요");
				$("#email").focus();
				return;
			}
			
			
			//2. 이메일 확인 동작 페이지로 값을 넘겨줌
			$.post('${pageContext.request.contextPath}/user/userpwfirst', {email: email}, function(data)
			{
				if(data=='')
				{
					$("#emailWarn").text("서버가 불안정합니다. 잠시후 다시 시도해 주세요 ㅠ^ㅠ");
					$("#email").focus();
					return;
				}

				var result=data.result;
				code=data.code;
				
				if(result=='false')
				{
					$("#emailWarn").text(email+"이라는 계정은 없습니다! 새로 가입하거나 다른 이메일을 입력하세요!");
					$("#email").focus();
					return;
				}
				
				if(result=='true')
				{
					$("#modal_second").modal(); //2단계 모달창을 열어준다.
					return;
				}
				
				
				
			});
		});
		
		//2단계 모달창 열릴 때 로직
		$("#modal_second").on('shown.bs.modal', function()
		{
			$("#codeWarn").text("");
			$("#code").focus();
		});
		
		//2단계 모달창 입력 후 버튼 클릭 이벤트
		$("#second").click(function()
		{
			var code=code;
			var inputCode=$("#code").val();
			
			if(inputCode!=code)
			{
				$("#codeWarn").text("잘못 입력하셨습니다!");
				$("#code").focus();
				return;
			}
			
			$.post('${pageContext.request.contextPath}/user/userpwfirst', {result: 'true'}, function(data)
			{
				if(data==null || data=='')
				{
					$("#codeWarn").text("서버가 불안정합니다. 잠시후 다시 시도해 주세요 ㅠ^ㅠ");
					return;
				}
				
				$("#third_result").text(data);
				$("#modal_third").modal();
			});
		});
		
		//3단계 모달창 파괴 시 이벤트
		$("#modal_second").on('hidden.bs.modal', function()
		{
			$("#third_result").text("");
		});
		
	});
	
	
</script>


<h2>이 페이지의 모달과 css, 자바스크립트만 가져가서 메인페이지에 옮겨주세요</h2>
<button id="modal_open">클릭</button>

<!-- 비밀번호 찾기 1단계 모달 -->
<div class="modal fade" id="modal_first">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span>가입하신 이메일을 입력해주세요.</span>
	<form>
		<input type="email"  id="email" name="email">
		<br/>
		<span id="emailWarn" class="warning"> </span>
		<br/>
		<input type="button" id="first" value="다음">
	</form>
   </div>
  </div>
 </div>
</div>


<!-- 비밀번호 찾기 2단계 모달 -->
<div class="modal fade" id="modal_second">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span>고객님의 메일로 인증코드를 보내드렸습니다.<br/>아래에 입력하여 인증완료되면 비밀번호를 알려드립니다.</span>
	<form>
		<input type="text"  id="code" name="code">
		<br/>
		<span id="codeWarn" class="warning"> </span>
		<br/>
		<input type="button" id="second" value="비밀번호 찾기">
	</form>
   </div>
  </div>
 </div>
</div>


<!-- 비밀번호 찾기 3단계(결과창) 모달 -->
<div class="modal fade" id="modal_third">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span>고객님의 비밀번호는 다음과 같습니다.</span>
	<span id="third_result"> </span>	
   </div>
  </div>
 </div>
</div>


</body>
</html>






















