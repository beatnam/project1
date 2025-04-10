<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/list.jsp</title>
</head>
<body>
<h1>member/list.jsp</h1>
<table border="1">
	<tr><td>아이디</td><td>비밀번호</td><td>이름</td></tr>
	<c:forEach var="memberDTO" items="${memberList }">
	
	<tr><td>${memberDTO.id }</td><td>${memberDTO.passwd }</td><td>${memberDTO.name }</td></tr>
	</c:forEach>
</table>
<a href="main.me">메인으로 이동</a>
</body>
</html>