<%@  page contentType="text/html; charset=utf-8" pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en-US">
<head>

<title>搜藏</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">

<link rel="stylesheet" type="text/css" href="styles.css">
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	window.onload = function() {
		var  result="${param.xian}";
		if(result==1){
			$("#favss").css("display","block");
			$("#yuntu").css("display","none");
			
		}else if(result==2){
			$("#favss").css("display","none");
			$("#yuntu").css("display","block");
		}
	}
	function add() {
		window
				.open(
						'fav.do?op=toAdd',
						'newwindow',
						'height=300, width=400, toolbar=no, menubar=no, scrollbars=no, resizable=no,location=no, status=no');
	}
</script>
</head>
<body>
	<form name="favForm" method="post"
		action="/cang/fav.do;jsessionid=FF8C0487A99814B144B07E5633524A0F">
		<input type="hidden" name="op" value="toList" />

		<div class="banner" valign="top">搜藏</div>

		<table cellspacing="0" cellpadding="0" border="0">
			<tr>
				<td style="text-align: right;" valign="top">
					<!-- 左边Tag列表 -->
					<div class="left_labels">
						<table class="labels_table" cellspacing="0" cellpadding="0"
							border="0">
							<tr>
								<td><a href="Yun_add.action" style="font-weight: bold;">添加书签</a></td>
							</tr>
							<tr>
								<!-- class="selected_label"  -->
								<td id="tagAll"><a href="Yun_Seach.action?type=allsl">全部</a></td>
							</tr>
							<tr>
								<td><a href="Yun_Seach.action?type=wei">未分类</a></td>
							</tr>
							<c:forEach items="${tags}" var="item">
								<tr>
									<td><a href="Yun_Seach.action?type=${item.t_name}">${item.t_name}</a></td>
								</tr>
							</c:forEach>
							<tr>
								<td><a style="font-weight: bold;" href="Yun_toYun.action">云图</a>
								</td>
							</tr>
						</table>
					</div>
				</td>
				<td>
					<!-- 右边fav内容 -->
					<div class="content_links">
						<div id="favss" style="display: none;">
							<c:forEach items="${favorites}" var="item">
								<div style="padding: 6px 10px;">
									<div>
										<a href="${item.f_url}" style="color: blue; font-size: 18px;"
											target="_blank">${item.f_label}</a>
									</div>
									<div style="color: black; font-size: 16px;">
										${item.f_desc}</div>
									<div style="color: green; font-size: 14px;">${item.f_url}
									</div>
								</div>
							</c:forEach>
						</div>
						<div id="yuntu" style="display: none;">
							<c:forEach items="${tags}" var="item">
								<a href="Yun_Seach.action?type=${item.t_name}" style="font-size:${item.t_count*5+10} ">${item.t_name}</a>
							</c:forEach>
						</div>
					</div>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>