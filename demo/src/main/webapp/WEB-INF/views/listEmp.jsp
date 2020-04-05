<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원 리스트</h2>
	<a href="/insertEmp.do">사원등록</a>
	<hr>
	<table border="1" width="80%">
		<tr>
			<td>사원번호</td>
			<td>사원이름</td>
		</tr>
		
		<c:forEach var="e" items="${e }">
			<tr>
				<td><a href="detailEmp.do?eno=${e.eno }">${e.eno }</a></td>
				<td>${e.ename }</td>
			</tr>
		</c:forEach>
	
	</table>
</body>
</html>