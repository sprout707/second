<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- jQuery -->
<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery/jquery-2.0.0.js"></script>

<!-- css -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/userupdate.css?ver=0.017"/>
<title>회원정보 수정</title>

<c:if test="${!empty resultMsg }">
	<script type="text/javascript">
		$(document).ready(function()
		{
			$("#updateResult").text("${resultMsg}");
			$("#updateResult").show();
			$("#updateResult").fadeOut(3000);
		});
	</script>
</c:if>

</head>
<body>

<div id="updateResult">
</div>

<h1>회원정보 수정 페이지</h1>

<nav class="memberup">
	<ul>
		<li>왼쪽 네비입니다</li>
		<li>왼쪽 네비입니다</li>
	</ul>
</nav>

<div id="full_wrapper">
<form id="userUpdate" method="post" action="${pageContext.request.contextPath }/user/userupdate" enctype="multipart/form-data"> <!-- 유저업데이트 -->

	<input type="text" name="no" hidden="hidden" value="${userInfo.no }"/> 

<div class="memberup_wrapper" id="necessary">
<div class="memberup_title">필수사항</div>
	
	<table>
		<tr>
			<td class="alignright">이름</td>
			<td><input type="text" id="name" name="name" value="${userInfo.name }" required="required"/><br/><br/></td>
		</tr>
		<tr>
			<td> </td><td><p class="notice">공개 프로필에는 성을 제외한 이름만 표시됩니다. 예약 요청 시 때 호스트는 회원님의 성과 이름을 모두 확인할 수 있습니다.<br/><br/></p></td>
		</tr>
		
		<tr>
			<td class="alignright">성별
			<img class="lock" src="${pageContext.request.contextPath }/resources/img/img_lock.png"/>
			</td>
			<td>
			<select name="gender" id="gender">
			  <option value="M"
			  	<c:if test="${userInfo.gender=='M' }"> selected='selected'</c:if>
			  >남자</option>
			  <option value="F"
				<c:if test="${userInfo.gender=='F' }"> selected='selected'</c:if>
			  >여자</option>
			</select>
			</td>
		</tr>
		<tr>
			<td> </td><td><p class="notice">이 자료는 통계 목적으로 사용되며 다른 회원들에게 절대 공개되지 않습니다.<br/><br/></p></td>
		</tr>
		
		<tr>
			<td class="alignright">생년월일 <img class="lock" src="${pageContext.request.contextPath }/resources/img/img_lock.png"/></td>
			<td>
				<select name="month" id="month">
					<c:forEach var="i"  begin="1" end="12" step="1">
						<option value="${i }"
						<c:if test="${i==userInfo.month }"> selected='selected'</c:if>
						>${i }월</option>
					</c:forEach>
				</select>
				<select name="date" id="date">
					<c:forEach var="i"  begin="1" end="31" step="1">
						<option value="${i }"
						<c:if test="${i==userInfo.date }"> selected='selected'</c:if>
						>${i }</option>
					</c:forEach>
				</select>
				<select name="year" id="year">
					<c:forEach var="i"  begin="1916" end="1998" step="1">
						<option value="${i }"
						<c:if test="${i==userInfo.year }"> selected='selected'</c:if>
						>${i }</option>
					</c:forEach>
				</select>
			</td>
		</tr>
		<tr>
			<td> </td><td><p class="notice">이 자료는 통계 목적으로 사용되며 다른 회원들에게 절대 공개되지 않습니다.<br/><br/></p></td>
		</tr>
		
		<tr>
			<td class="alignright">이메일 주소 <img class="lock" src="${pageContext.request.contextPath }/resources/img/img_lock.png"/></td>
			<td><input type="email" name="email" value="${userInfo.email }"/></td>
		</tr>
		<tr>
			<td> </td> <td><p class="notice">이메일 주소는 다른 에어비앤비 회원에게 공개되지 않습니다. <br/><br/></p></td>
		</tr>
		
		<tr>
			<td class="alignright">전화번호</td>
			<td><input type="tel" name="phone" value="${userInfo.phone }"></td>
		</tr>
		<tr>
			<td> </td><td><p class="notice">예약이 완료될 경우에만 공유됩니다. 번호가 공유되면 개인적으로 연락할 수 있습니다.<br/><br/></p></td>
		</tr>
		
	</table>
</div>

<div class="memberup_wrapper" >
<div class="memberup_title">선택사항</div>

	<table>
		<tr>
			<td class="alignright">게스트 프로필 <img class="lock" src="${pageContext.request.contextPath }/resources/img/img_lock.png"/></td>
			<td><img alt="프로필사진" src="${userInfo.fileName }"></td>
		</tr>
		<tr>
			<td> </td><td><input type="file" name="file" class="btn"/></td>
		</tr>
	</table>

</div>

<input type="submit" class="btn" id="memberUpdateBtn" value="저장하기"/>
<br/><br/><br/><br/><br/><br/>
</form>

</div>


</body>
</html>
















