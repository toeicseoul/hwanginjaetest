<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>form2.jsp</title>
</head>
<body>
	<div>
		<fieldset>
			<legend>VO ��ü ����ϱ�</legend>
			<form action="formTest" method="post">
				<p>
					<!-- 
					oninvalid=setCustomValidity('Ŀ���͸���¡ �޽���')
					[a-z] : �ҹ���
					[A-Z] : �빮��
					[a-zA-Z]{3} : �� ������
					[0-9] : ����
					+
					$ : �� ���ڿ�
					^ : ���� ���ڿ�
					[^a-zA-Z] : �����ڴ� ����
					oninput : ���� ���� ���¸� üũ
				 -->
					�ۼ��� : <input type="text" name="writer" required="required"
						pattern="[^a-zA-Z]+" oninvalid="this.setCustomValidity('�ѱ۸� �Է�')"
						onchange="this.setCustomValidity('')">
				</p>
				<p>
					�μ���ȣ : <input type="number" name="deptno" min="10" step="10"
						max="50" required="required">
				</p>

				<p>
					Blog : <input type="url" name="url" list="data"
						placeholder="url �Է�" required="required">
				</p>
				<datalist id="data">
					<option>http://blog.naver.com/javabook</option>
					<option>http://blog.naver.com/whiteshadow
				</datalist>
				<p>
					<input type="submit" value="send">
				</p>

			</form>
		</fieldset>
	</div>
</body>
</html>