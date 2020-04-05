<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="insertEmp.do">등록</a>
	
	<h2>상세목록</h2>
	<table border="1" width="80%">
			<tr><td>사원번호</td><td>${e.eno}</td></tr>
			<tr><td>사원명</td><td>${e.ename}</td></tr>
			<tr><td>직급</td><td>${e.job}</td></tr>
			<tr><td>급여</td><td>${e.sal}</td></tr>
			<tr><td>입사일</td><td>${e.hiredate}</td></tr>
	</table>
	<a href="/updateEmp.do?eno=${e.eno}">수정</a>
	<a href="/deleteEmp.do?eno=${e.eno}">삭제</a>
</body>
</html>