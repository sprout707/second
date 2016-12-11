<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>

</head>
<body>
	<h1>게시판</h1>
	
	<form action="${pageContext.request.contextPath }/help/insert" method="post" enctype="multipart/form-data">
		<table>
		  <tr>
		  
		    <td>
		     <select name="help_categoryNo">
			   <c:forEach var="h" items="${category }">
			    <option value="${h.no }">${h.type }</option>
			   </c:forEach>		      
		     </select>
		    </td>
		    
		    <td>
		     <input type="text" placeholder="제목을 입력하세요" name="title">
		    </td>
		    
		  </tr>
		  
		  <tr>
		    <td colspan="2">
		     <textarea rows="20" cols="70" name="content" placeholder="내용을 입력하세요."></textarea>
		    </td>
		  </tr>
		  
		  <tr>
		    <td>파일</td>
		    <td>
		     <input type="file" id="fileName1" name="file" class="jin_file outlineNone">
		    </td>
		  </tr>
		  
		  <tr>
		  	<td colspan="2">
		  	 <input type="submit" value="글쓰기">
		  	</td>
		  </tr>
		</table>
	</form>

</body>
</html>