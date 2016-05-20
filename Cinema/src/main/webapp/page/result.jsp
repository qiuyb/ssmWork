<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; 
charset=utf-8" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
<head>
<title>电影信息</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8">
<meta charset="utf-8">
</head>

<body>
		<div><a href="/Cinema/index.jsp">返回首页</a></div>
		<table border="1" borderColor="#66CCCC" align="center" style="margin-top:40px; width:1024px;">
			<tr align="center">
				<td>电影名称</td>
				<td>类型</td>
				<td>主演</td>
				<td>导演</td>
				<td>票价</td>
			</tr>
			<c:choose>
				<c:when test="${empty sessionScope.result}">
					<tr>
						<td colspan="5"><c:out value="未找到符合条件的电影" /></td>
					</tr>
				</c:when>
				<c:when test="${!empty sessionScope.result}">
					<c:forEach items="${sessionScope.result}" var="film">
						<tr>
							<td width="120px">${film.filmname}</td>
							<td width="50px">${film.type.typename}</td>
							<td>${film.actor}</td>
							<td>${film.director}</td>
							<td width="40px">${film.ticketprice}</td>
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</table>
</body>
</html>
