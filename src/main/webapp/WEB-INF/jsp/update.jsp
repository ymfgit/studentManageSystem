<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script>
	
	
</script>
</head>
<body>
	<form action="updateDetails" method="post">

		<table border="1">
			<tr>
				<td>编号</td>
				<td><input type="text" name="id" id="id"
					value="${profile.id }" readonly="readonly"></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="name" id="name"
					value="${profile.name }"></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input type="text" name="birth"
					value="${profile.birthday }"></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><select name="gender">
						<c:if test="${profile.gender=='男' }">
							<option name="gender">${profile.gender}</option>
						</c:if>
						<option name="gender">女</option>

						<c:if test="${profile.gender=='女' }">
							<option name="gender">${profile.gender}</option>
						</c:if>
						<option name="gender">男</option>
				</select></td>
			</tr>
			<tr>
				<td>职业</td>
				<td><input type="text" name="career" id="career"
					value="${profile.career}"></td>
			</tr>
			<tr>
				<td>住所</td>
				<td><input type="text" name="address" id="address"
					value="${profile.address}"></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" name="mobile" id="mobile"
					value="${profile.mobile}"></td>
			</tr>

		</table>
		<input type="submit" value="修改"> <a href="list"><input
			type="button" value="返回"></a>
	</form>
</body>
</html>