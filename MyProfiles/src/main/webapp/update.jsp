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
	<form action="Profile_xiu" style="margin:80px auto;width:360px; ">
		<table border="1px" cellpadding="0px"  cellspacing="0px" >
			<tbody align="left">
			<tr>
				<td>编号</td>
				<td><input name="id" type="text" value="${sessionScope.update.id }" readonly="readonly" /></td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input name="name" type="text" value="${sessionScope.update.name }" /></td>
			</tr>
			<tr>
				<td>生日</td>
				<td><input name="birthday" type="text" value="${sessionScope.update.birthday }" /></td>
			</tr>
			<tr>
				<td>性别</td>
				<td><select name="gender">
					<option>男</option>
					<option>女</option>
				</select>
				<%-- ${sessionScope.detail.gender } --%></td>
			</tr>
			<tr>
				<td>职业</td>
				<td><input name="career" type="text" value="${sessionScope.update.career }" /></td>
			</tr>
			<tr>
				<td>住所</td>
				<td><input name="address" type="text" value="${sessionScope.update.address }" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input name="mobile" type="text" value="${sessionScope.update.mobile }" /></td>
			</tr>
			
			</tbody>
		</table><br/>
		<input type="submit" value="修改" />&nbsp;<a href="Profile_fan"><input type="button" value="返回"/></a>
	</form>
</body>
</html>