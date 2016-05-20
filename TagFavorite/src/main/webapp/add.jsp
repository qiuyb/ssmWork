<%@  page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<label style="color: red;">${sessionScope.addMsg}</label>
	<c:remove var="addMsg" scope="session"/>
	<form action="Yun_save.action" method="post"  enctype="multipart/form-data">
					名称：<input type="text" name="f_label" style="width: 265px;" /><br /><br />
					链接：<input type="text" name="f_url" style="width: 265px;"/><br /><br />
				Tag:<input type="text" name="f_tags" style="width: 280px;"/>
						<p style=" color: green;">可以多个，用“，”隔开</p>
					描述<textarea  name="f_desc" style="width: 280px;height: 50px;"></textarea><br />
		<br /> <input type="submit" value="添加" />&nbsp;<a href="Yun_list.action" style="text-decoration: none;"><input
			type="button" value="取消" /></a>
	</form>
</body>
</html>