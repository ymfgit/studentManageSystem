<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<c:forEach items="${profile}" var="b">
			<tr>
				<td>编号</td>
				<td>${b.getId() }</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${b.getName() }</td>
			</tr>
			<tr>
				<td>生日</td>
				<td>${b.getBirthday() }</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${b.getGender() }</td>
			</tr>
			<tr>
				<td>职业</td>
				<td>${b.getCareer() }</td>
			</tr>
			<tr>
				<td>住所</td>
				<td>${b.getAddress() }</td>
			</tr>
			<tr>
				<td>电话</td>
				<td>${b.getMobile() }</td>
			</tr>
		</c:forEach>
	</table>
	<a href="list"><input type="button" value="返回"></a>
</body>
</html>