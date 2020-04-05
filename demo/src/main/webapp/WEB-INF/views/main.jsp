<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${login.id eq null}">
<a href="/login.do">로그인</a><br>
<a href="/listDept.do">부서목록</a>
</c:if>
<c:if test="${login.id ne null}">
<a href="/logout.do">로그아웃</a><br>
<a href="/listDept.do">부서목록</a>
<a></a>
</c:if>
</body>
</html>