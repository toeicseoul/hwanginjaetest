<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>msgDto.jsp</title>
</head>
<body>
	<div>
		<ul>
			<li>작성자 : ${dto.writer }</li>
			<li>부서번호 : ${dto.deptno }</li>
			<li>블로그 : ${dto.url }</li>

		</ul>
	</div>
</body>
</html>