<%@ page  contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
<html>
<head>
<meta content="charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1px" cellpadding="0px"  cellspacing="0px"width="600px" >
		<caption>人员基本信息表</caption>
		<thead style="background: yellow;">
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
		</thead>
		<tbody align="left">
			
			<c:forEach items="${sessionScope.profile }" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.name }</td>
					<td>${item.birthday }</td>
					<td>${item.gender }</td>
					<td>${item.career }</td>
					<td>${item.address }</td>
					<td>${item.mobile }</td>
					<td>
						<a href="Profile_detail?id=${item.id }"><input type="submit" name="detail" value="明细"/></a>
					<!-- </form> -->
					<a href="Profile_update?id=${item.id }"><input type="button" name="update" value="修改"></a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
		
		</table>	
</body>
</html>