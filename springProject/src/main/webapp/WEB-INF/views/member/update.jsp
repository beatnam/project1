<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/update.jsp</title>
</head>
<body>

<jsp:include page="../inc/top.jsp"></jsp:include>

<!-- http://localhost:8080/MVCProject/update.me -->
<!-- http://localhost:8080/MVCProject/member/update.jsp -->
<h1>가상주소 update.me => 실제페이지 member/update.jsp</h1>
<h1>회원정보 수정</h1>
<form action="updatePro.me" method="post">
		아이디 : <input type="text" name="id" value="${memberDTO.id}" readonly><br>
		비밀번호 : <input type="password" name="passwd"><br>
		이름 : <input type="text" name="name" value="${memberDTO.name }"><br>
		<input type="submit" value="회원정보 수정">
</form>
</body>
</html>