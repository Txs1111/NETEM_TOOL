<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Default</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/communication.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
		<style></style>
	</head>
	<body>
		<div style="width: 100%;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line"><b>  发布帖子</b></div>
			</div>
			
			<div class="tab_type">
				<div class="child_tab">
					<b>社区</b>
				</div>
				<div class="tab_line"></div>
				<div class="child_tab">
					<b>问答</b>
				</div>
				<div class="tab_line"></div>
				<div class="child_tab">
					<b>资源</b>
				</div>
			</div>
			
			<div class="post_content">
				<div class="content_tittle">
					<input name="tittle" type="text" placeholder="请输入标题"/>
				</div>
				<div class="content_inf">
					<textarea name="content" type="text" placeholder="请输入内容"></textarea>
				</div>
				
				<div class="bottom_block">
					<button>发送</button>
				</div>
			</div>
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
	$(function(){
		$('.child_tab').click(function(){
			$(this).css('background-color','#e5bfef');
			$(this).siblings('.child_tab').css('background-color','white');
		});
	});
</script>
