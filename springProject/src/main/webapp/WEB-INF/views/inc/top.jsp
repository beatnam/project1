<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--  inc/top.jsp -->

<h1> <a href="main.me">메인</a>
<!--  		  로그인 하지 않았을때 (세션값 없을때) -->
	<c:if test="${empty sessionScope.id}">
	  <a href="insert.me">회원가입</a>
	  <a href="login.me">로그인</a>
	</c:if>	
		  
		  <!-- 로그인 했을때 (세션값 있을때) -->
	<c:if test="${!empty sessionScope.id }">
		${sessionScope.id}님
		  <a href="logout.me">로그아웃</a>
		  <a href="info.me">회원정보 조회</a>
		  <a href="update.me">회원정보 수정</a>
		  <a href="delete.me">회원정보 삭제</a>
<!-- 		  관리자(admin) 만 볼수 있게 함 -->
		  <c:if test = "${sessionScope.id eq 'admin' }">
		  		<a href="list.me">회원 목록</a>
		  </c:if>
		  
	</c:if>
</h1>