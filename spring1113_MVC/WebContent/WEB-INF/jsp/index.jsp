<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>������ MVC ����</title>
</head>
<body>
	<h1>��û �Ķ���� ó��(Param)</h1>
	<h2>Param : ��û �Ķ���Ϳ� ���� ����</h2>
	<ul>
		<li><a href="param1?code=A">GET����� �Ķ���� ���а� A</a></li>
		<li><a href="param1?code=B">GET����� �Ķ���� ���а� B</a></li>
		<li><a href="param1?code=dd">GET����� �Ķ���� ���а� test</a></li>
	</ul>
	
	
	<h2>Exception</h2>
	<ul>
		<li><a href="param2?mycode=test">GET����� Mycode �Ķ���� ���а� test</a></li>
	</ul>
	
	<h1>��û �Ķ���� ó�� (@RequestParam)</h1>
	<h2>@RequestParam : ��û �Ķ���Ϳ� ���� ����</h2>
	<ul>
		<li><a href="param3?id=Test">param�� �ѱ�� 1</a></li>
		<li><a href="intDemo?num=300">int�� �ѱ��</a></li>
	</ul>
</body>
</html>