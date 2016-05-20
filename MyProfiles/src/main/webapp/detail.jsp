<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta content="charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		String id=request.getParameter("id");
	%>
	<%=id%>.......  --%>
	<form action="Profile_fan" style="margin:80px auto;width:360px; ">
		<table border="1px" cellpadding="0px"  cellspacing="0px" >
			<tbody align="left">
			<tr>
				<td>编号</td>
				<td>${sessionScope.detail.id }</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td>${sessionScope.detail.name }</td>
			</tr>
			<tr>
				<td>生日</td>
				<td>${sessionScope.detail.birthday }</td>
			</tr>
			<tr>
				<td>性别</td>
				<td>${sessionScope.detail.gender }</td>
			</tr>
			<tr>
				<td>职业</td>
				<td>${sessionScope.detail.career }</td>
			</tr>
			<tr>
				<td>住所</td>
				<td>${sessionScope.detail.address }</td>
			</tr>
			<tr>
				<td>电话</td>
				<td>${sessionScope.detail.mobile }</td>
			</tr>
			
			</tbody>
		</table><br/>
		<input type="submit" value="返回" />
	</form>
</body>
</html>