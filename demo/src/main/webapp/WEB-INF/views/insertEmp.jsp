<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원등록</h2>
	<form action="insertEmp.do" method="POST">
		사원번호 : <input type="number" name="eno"><br>
		사원명 : <input type="text" name="ename"><br>
		직급 : <input type="text" name="job"><br>
		급여 : <input type="number" name="sal"><br>
		입사일 : <input type="text" name="hiredate"><br>
	
		<input type="submit" value="등록">
	</form>
</body>
</html>