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

<!-- 커스텀 CSS -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/userpwcheck.css?ver=0.005"/>

</head>
<body>

<!-- 커스텀 JS -->
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/userpwcheck.js?ver=0.001"></script>


<h2>이 페이지의 모달과 css, 자바스크립트만 가져가서 메인페이지에 옮겨주세요</h2>
<button id="modal_open">클릭</button>

<!-- 비밀번호 찾기 1단계 모달 -->
<div class="modal fade" id="modal_first">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header" id="pwck">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span class="pwckNotice">가입하신 이메일을 입력해주세요.<br/></span>
	<form>
		<input type="email"  id="email" name="email" class="pwinput">
		<br/>
		<div id="emailWarn" class="warning"> </div>
		<br/>
		<input type="button" id="first" value="다음" class="pwbtn">
	</form>
   </div>
  </div>
 </div>
</div>


<!-- 비밀번호 찾기 2단계 모달 -->
<div class="modal fade" id="modal_second">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header" id="pwck">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span class="pwckNotice">고객님의 메일로 인증코드를 보내드렸습니다.<br/>아래에 입력하여 인증완료되면 비밀번호를 알려드립니다.<br/></span>
	<form>
		<input type="text"  id="code" name="code" class="pwinput">
		<br/>
		<span id="codeWarn" class="warning"> </span>
		<br/>
		<input type="button" id="second" value="비밀번호 찾기" class="pwbtn">
	</form>
   </div>
  </div>
 </div>
</div>


<!-- 비밀번호 찾기 3단계(결과창) 모달 -->
<div class="modal fade" id="modal_third">
 <div  class="modal-dialog">
  <div class="modal-content">
  
   <div class="modal-header" id="pwck">
	비밀번호 찾기
   </div>
   
   <div class="modal-body">
	<span class="pwckNotice">고객님의 비밀번호는 다음과 같습니다.<br/></span>
	<span id="third_result"> </span>	
   </div>
  </div>
 </div>
</div>


</body>
</html>






















