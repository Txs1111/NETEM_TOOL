<%@ page import="com.NETEM.pojo.information.Outline" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>考研资料</title>
		<link rel="stylesheet" href="css/normalize.css" />
		<link rel="stylesheet" href="css/public_style.css" />
		<link rel="stylesheet" type="text/css" href="css/information.css"/>
		<!-- 引入information的字体图标文件 -->
		<link rel="stylesheet" type="text/css" href="./css/info_fonts.css"/>
	</head>
	<body>
	<% List<Outline> outline = (List<Outline>) request.getAttribute("outline");%>
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a href="NETM_information.html"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研资料</b>
				</div>
			</div>

			<!-- 内容 -->
			<div class="big-container">
				<!-- 搜索栏 -->
				<div class="container-head">
					<div class="index-search">搜索院校资料</div>
					<span class="iconfont icon-head1">&#xe624;</span>
				</div>

				<div class="all_head">
					<span class="iconfont icon-paper">&#xe69f;</span>
					<span class="year_real">考试大纲</span>
				</div>
			</div>

			<div class="outline_content_div" style="margin-bottom: 80px;">
				<div class="outline_tips">计算机考研</div>
				<ul>
					<%if (outline!=null) for (Outline o:outline){%>
						<li class="outline_content_li">
							<a href="#"><%=o.getTitle()%></a>
						</li><li  class="outline_content_li">
							<span><%=o.getAddTime()%></span>
							<span><%=o.getResource()%></span>
						</li>
					<%}%>



				</ul>
			</div>

		</div>


		<div class="nav-bottom">
			<ul class="local-nav">
				<li>
					<a href="NETM_lead.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/lead.png" style="width: 100%;height: 100%;" />
						</span>
						<span  class="grey_font">考研指引</span>
					</a>
				</li>
				<li>
					<a href="NETM_information.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/information_active.png" style="width: 100%;height: 100%;" />
						</span>
						<span>考研资料</span>
					</a>
				</li>
				<li>
					<a href="NETM_mark.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/mark.png" style="width: 100%;height: 100%;" />
						</span>
						<span class="grey_font">估分预测</span>
					</a>
				</li>
				<li>
					<a href="NETM_communication.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/communication.png" style="width: 100%;height: 100%;" />
						</span>
						<span  class="grey_font">论坛交流</span>
					</a>
				</li>
			</ul>
		</div>
	</body>
</html>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);
	});
</script>
