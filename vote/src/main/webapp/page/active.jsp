<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<base href="/vote/">
<meta content="charset=utf-8">
<title>激活</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<body>
	<div id="header" class="wrap">
		<img src="images/logo.gif" />
	</div>
	<div id="navbar" class="wrap">
		<div class="search">
			<form method="get" action="index.html">
				<input type="text" name="keywords" class="input-text" /><input
					type="submit" name="submit" class="input-button" value="" />
			</form>
		</div>
	</div>
	<div id="message" class="box">
		<h2>提示信息</h2>
		<div class="content">
			<p>
				恭喜：进入激活页面<a href="user_check.action?actionId=${actionId}">确定激活&gt;&gt;</a>
			</p>
		</div>
	</div>
	<div id="footer" class="wrap">源辰信息 &copy; 版权所有</div>
</body>
</html>
