<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>스프링 MVC 예제</title>
</head>
<body>
	<h1>요청 파라미터 처리(Param)</h1>
	<h2>Param : 요청 파라미터에 따른 구분</h2>
	<ul>
		<li><a href="param1?code=A">GET방식의 파라미터 구분값 A</a></li>
		<li><a href="param1?code=B">GET방식의 파라미터 구분값 B</a></li>
		<li><a href="param1?code=dd">GET방식의 파라미터 구분값 test</a></li>
	</ul>
	
	
	<h2>Exception</h2>
	<ul>
		<li><a href="param2?mycode=test">GET방식의 Mycode 파라미터 구분값 test</a></li>
	</ul>
	
	<h1>요청 파라미터 처리 (@RequestParam)</h1>
	<h2>@RequestParam : 요청 파라미터에 따른 구분</h2>
	<ul>
		<li><a href="param3?id=Test">param값 넘기기 1</a></li>
		<li><a href="intDemo?num=300">int값 넘기기</a></li>
	</ul>
</body>
</html>