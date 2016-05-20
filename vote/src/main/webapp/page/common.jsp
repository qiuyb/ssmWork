<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta content="charset=utf-8">
</head>
<body>
	<div class="profile">
		<c:choose>
			<c:when test="${sessionScope.user.vuusername eq null}">
				<a href='user_login.action'>登录</a>
			</c:when>
			<c:otherwise>您好，${sessionScope.user.vuusername }</c:otherwise>
		</c:choose>
		<span class="return"><a href="vote_list.action">返回列表</a></span>
		 <span class="addnew"><a href="subject_add.action">添加新投票</a></span>
		  <span class="modify"><a href="Subject!modify.action">维护</a></span>
	</div>
</body>
</html>