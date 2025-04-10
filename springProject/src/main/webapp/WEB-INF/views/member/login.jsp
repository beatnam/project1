<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/login.jsp</title>
</head>
<body>

<jsp:include page="../inc/top.jsp"></jsp:include>

<!-- http://localhost:8080/MVCProject/insert.me -->
<!-- http://localhost:8080/MVCProject/member/insert.jsp -->
<h1>가상주소 login.me => 실제페이지 member/login.jsp</h1>
<h1>로그인</h1>
<form action="${pageContext.request.contextPath }/member/loginPro.me" method="post">
		아이디 : <input type="text" name="id"><br>
		비밀번호 : <input type="password" name="passwd"><br>
		<input type="submit" value="로그인">
</form>
</body>
</html>