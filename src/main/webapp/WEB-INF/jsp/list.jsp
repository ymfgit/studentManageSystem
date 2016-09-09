<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>列表明细</title>
<script type="text/javascript">
	//alert("${profile}");
</script>
</head>
<body>
	<table border="1" width="800px">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>生日</th>
			<th>性别</th>
			<th>职业</th>
			<th>住所</th>
			<th>电话</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${profile }" var="a">
			<tr>
				<td>${a.getId()}</td>
				<td>${a.getName() }</td>
				<td>${a.getBirthday() }</td>
				<td>${a.getGender() }</td>
				<td>${a.getCareer() }</td>
				<td>${a.getAddress() }</td>
				<td>${a.getMobile() }</td>
				<td><a href="showDetails?id=${a.getId()}"><input
						type="button" value="明细" /></a> <a href="update?id=${a.getId() }"><input
						type="button" value="修改" /></a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>