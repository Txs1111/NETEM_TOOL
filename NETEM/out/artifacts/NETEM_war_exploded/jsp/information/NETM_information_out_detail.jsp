<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Default</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/information.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/display.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/style.css"/>
</head>
<body>
	<div style="width: 100%;" id="main_block">
		<!-- 头部部分和返回键 -->
		<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
			<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
			<div class="head_line"><b>   考试大纲</b></div>
		</div>
		
		
		<!-- 内容 -->
		<div class="re_container">
			<div class="re_head">
				<div class="re_BQ">考研英语考试大纲</div>
				<div class="re_year">年份：2021年</div>			
			</div>
			<div class="re_typeQ">
				<ul>
					<li class="re_typeSum">
						<span class="re_type">词汇【电子版】</span>
					</li>
					<li class="re_typeSum">
						<span class="re_type">语法【电子版】</span>
					</li>
					<li class="re_typeSum">
						<span class="re_type">汇总【电子版】</span>
					</li>
				</ul>
			</div>
			<div class="re_footer">
				 <a href="" class="button dark">
					<ul>
						<li>&#68;ownload</li>
						<li>&#68;ownloaded</li>
						<li>Open File</li>
					</ul>
					<div>
						<svg viewBox="0 0 24 24"></svg>
					</div>
				</a>
			</div>			
		</div>	
	</div>
	
	<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/TweenMax.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/js/script.js"></script>
</body>
</html>
