<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="CheckTriangle">
	<table>
			<tr>
				<td>Canh 1: </td>
				<td>
					<input type="text" name="num1" value="${s1}">
				</td>
			</tr>
			<tr>
				<td>Canh 2: </td>
				<td>
					<input type="text" name="num2" value="${s2}">
				</td>
			</tr>
			<tr>
				<td>Canh 3: </td>
				<td>
					<input type="text" name="num3" value="${s3}">
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="Submit" name="c" value="Check">
				</td>
			</tr>
			<tr>
				<td>La tam giac? </td>
				<td>
					<input type="text" value="${t}">
				</td>
			</tr>
			<tr>
				<td>Chu vi: </td>
				<td>
					<input type="text" value="${cv}">
				</td>
			</tr>
			<tr>
				<td>Dien tich: </td>
				<td>
					<input type="text" value="${dt}">
				</td>
			</tr>
	</table>
 </form>
</body>
</html>