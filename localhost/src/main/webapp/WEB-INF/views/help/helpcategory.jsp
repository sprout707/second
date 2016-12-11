<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=UTF-8">
<title>localhost 도움말</title>

<script type="text/javascript" src="http://code.jquery.com/jquery.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/helplist.css"/>
<script type="text/javascript">

	//first_nav이외의 리스트를 숨긴다. -> css로 분리 가능
	$(document).ready(function()
	{
		$("#first_nav").show();
		
		$("#start_nav").hide();
		$("#idprofile_nav").hide();
		$("#second_profile_nav").hide();
		$("#hosting_nav").hide();
		$("#second_lodging_nav").hide();
		$("#second_booking_nav").hide();
		$("#second_payment_nav").hide();
		$("#travel_nav").hide();
		$("#second_houseBook_nav").hide();
		$("#second_charge_nav").hide();
		$("#second_travelList_nav").hide();
		$("#secure_nav").hide();
		
	});

</script>
</head>
<body>

 <div id="help_header">
  <h1>어떻게 도와드릴까요?</h1>
  <form action="${pageContext.request.contextPath }/help/helplist/search" method="get" id="searchHelp">
  	<input type="text" name="search" placeholder="질문을 입력하거나 키워드로 검색하세요">
  </form>
 </div>
	
<!--  <div id="help_custom">
  <h2>맞춤 도움말을 보려면 로그인하세요</h2>
  <button onclick="location.href='#'" id="btn_login">로그인</button>
  <button onclick="location.href='#'" id="btn_join">회원가입</button>
 </div> -->
 
 <!-- 네비 동작(자바스크립트) -->
<script type="text/javascript">

	$(function()
	{
		
		$("#start").click(function()
		{
			$("#first_nav").hide();
			$("#start_nav").show();
			
			$(".back").click(function()
			{				
				$("#start_nav").hide();
				$("#first_nav").show();
			});
		}); 
				
		$("#idprofile").click(function()
		{
			$("#first_nav").hide();
			$("#idprofile_nav").show();
			
			$(".back").click(function()
			{				
				$("#idprofile_nav").hide();
				$("#first_nav").show();
			});
		});
		
			$("#second_profile").click(function()
			{
				$("#idprofile_nav").hide();
				$("#second_profile_nav").show();
			});
			
			$(".sec_back1").click(function()
			{				
				$("#second_profile_nav").hide();
				$("#idprofile_nav").show();
			});
		
		$("#hosting").click(function()
		{
			$("#first_nav").hide();
			$("#hosting_nav").show();			
		});
		
		$(".back").click(function()
		{				
			$("#hosting_nav").hide();
			$("#first_nav").show();
		});
		
			$("#second_lodging").click(function()
			{
				$("#hosting_nav").hide();
				$("#second_lodging_nav").show();
			});
			
			$(".sec_back2").click(function()
			{				
				$("#second_lodging_nav").hide();
				$("#hosting_nav").show();
			});
			
			$("#second_booking").click(function()
			{
				$("#hosting_nav").hide();
				$("#second_booking_nav").show();
				
				$(".sec_back3").click(function()
				{				
					$("#second_booking_nav").hide();
					$("#hosting_nav").show();
				}); 
			});
			
			$("#second_payment").click(function()
			{
				$("#hosting_nav").hide();
				$("#second_payment_nav").show();
				
				$(".sec_back4").click(function()
				{				
					$("#second_payment_nav").hide();
					$("#hosting_nav").show();
				});
			});
			
		$("#travel").click(function()
		{
			$("#first_nav").hide();
			$("#travel_nav").show();
			
			$(".back").click(function()
			{				
				$("#travel_nav").hide();
				$("#first_nav").show();
			});
		});
		
			$("#second_houseBook").click(function()
			{
				$("#travel_nav").hide();
				$("#second_houseBook_nav").show();
				
				$(".sec_back5").click(function()
				{				
					$("#second_houseBook_nav").hide();
					$("#travel_nav").show();
				});
			});
			
			$("#second_charge").click(function()
			{
				$("#travel_nav").hide();
				$("#second_charge_nav").show();
				
				$(".sec_back6").click(function()
				{				
					$("#second_charge_nav").hide();
					$("#travel_nav").show();
				});
			});
			
			$("#second_travelList").click(function()
			{
				$("#travel_nav").hide();
				$("#second_travelList_nav").show();
				
				$(".sec_back7").click(function()
				{				
					$("#second_travelList_nav").hide();
					$("#travel_nav").show();
				});
			});

		$("#secure").click(function()
		{
			$("#first_nav").hide();
			$("#secure_nav").show();
			
			$(".back").click(function()
			{				
				$("#secure_nav").hide();
				$("#first_nav").show();
			});
		});
		
	});
		

	
</script>

<div id="help_wrapper"> 
 <div id="help_nav">
  <div>
   <a href="../help/helplist">도움말 센터</a>
  </div>
  <ul id="first_nav">
   <li><a id="start">시작하기</a></li>
   <li><a id="idprofile">계정과 프로필</a></li>
   <li><a id="hosting">호스팅</a></li>
   <li><a id="travel">여행</a></li>
   <li><a href="#" style="text-decoration:none; color:black;">후기</a></li>
   <li><a id="secure">신뢰와 안전</a></li>
   <li><a href="#" style="text-decoration:none; color:black;">피드백</a></li>
   <li><a href="#" style="text-decoration:none; color:black;">문제 해결하기</a></li>
  </ul>
  
	  <ul id="start_nav">
	  	<li class="back"><a>←뒤로가기</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">이용방법</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">여행방법</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">호스팅방법</a></li>
	  </ul>
	  
	  <ul id="idprofile_nav">
	  	<li class="back"><a><a>←뒤로가기</a></a></li>
	  	<li id="second_profile"><a>프로필관리</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">보안과 비밀번호</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">문제해결</a></li>
	  </ul>
	  
		  <ul id="second_profile_nav">
		  	<li class="sec_back1"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">내정보</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">본인인증</a></li>
		  </ul>
	  
	  <ul id="hosting_nav">
	  	<li class="back"><a>←뒤로가기</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">호스트되기</a></li>
	  	<li id="second_lodging">숙소관리</li>
	  	<li id="second_booking">예약관리</li>
	  	<li id="second_payment">대금수령</li>
	  </ul>
	  
		  <ul id="second_lodging_nav">
		  	<li class="sec_back2"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">숙소등록</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">달력과 예약가능여부설정</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">즉시예약</a></li>
		  </ul>
		  
		  <ul id="second_booking_nav">
		  	<li class="sec_back3"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">예약 수락</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">변경과 취소</a></li>
		  </ul>
		  
		  <ul id="second_payment_nav">
		  	<li class="sec_back4"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">대금수령방법</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">환불</a></li>
		  </ul>
	  
	  <ul id="travel_nav">
	  	<li class="back"><a>←뒤로가기</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">숙소찾기</a></li>
	  	<li id="second_houseBook">숙소예약</li>
	  	<li id="second_charge">결제</li>
	  	<li id="second_travelList">여행목록</li>
	  </ul>
	  
		  <ul id="second_houseBook_nav">
		  	<li class="sec_back5"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">호스트에게 연락하기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">예약 요청</a></li>
		  </ul>
		  
		  <ul id="second_charge_nav">
		  	<li class="sec_back6"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">요금과 수수료</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">결제 방법</a></li>
		  </ul>
		  
		  <ul id="second_travelList_nav">
		  	<li class="sec_back7"><a>←뒤로가기</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">여행중</a></li>
		  	<li><a href="#" style="text-decoration:none; color:black;">계획변경</a></li>
		  </ul>
	  
	  <ul id="secure_nav">
	  	<li class="back"><a>←뒤로가기</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">호스트</a></li>
	  	<li><a href="#" style="text-decoration:none; color:black;">게스트</a></li>
	  </ul> 
 </div>