<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>사원수정</h2>
	<form action="updateEmp.do" method="POST">
		사원명 : <input type="text" name="ename" value="${up.ename}"><br>
		직급 : <input type="text" name="job" value="${up.job}"><br>
		급여 : <input type="number" name="sal" value="${up.sal}"><br>
		입사일 : <input type="text" name="hiredate" value="${up.hiredate}"><br>
	
		<input type="submit" value="수정">
	</form>
	
	<a href="listEmp.do">목록</a>
</body>
</html>