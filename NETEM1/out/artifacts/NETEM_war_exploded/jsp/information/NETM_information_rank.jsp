<%@ page import="com.NETEM.pojo.information.Information" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>考研资料</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/information.css"/>
		<!-- 引入information的字体图标文件 -->
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/info_fonts.css"/>
		<style>
			body{
				background-color: #F4F4F4;
			}
		</style>
	</head>
	<body>
		<% List<Information> ranks = (List<Information>) request.getAttribute("Rank"); %>
		<div style="width: 100%;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>院校排名</b>
				</div>
			</div>
			
			<!-- 内容 -->
			<div class="big-container">
				<!-- 搜索栏 -->
				<div class="container-head">
					<a href="NETM_information_searchPage.html">
						<div class="index-search">搜索院校资料</div>
						<span class="iconfont icon-head1">&#xe624;</span>
					</a>
				</div>		
			</div>
			

			<div class="real_content">
				<ul>
					<% for(Information i:ranks){ %>
					<li class="twenty">
						<a href="${pageContext.request.contextPath}/NETEM/rankDetail/<%=i.getID()%>">
							<span class="iconfont icon-shijuan yellow_ifont">&#xe60c;</span>
							<span class="wenzi"><%=i.getTitle()%></span>
						</a>
						<div class="grey_smallline"></div>
					</li>
					<%}%>

				</ul>
			</div>
		</div>

		<div class="nav-bottom">
			<ul class="local-nav">
				<li>
					<a href="${pageContext.request.contextPath}/NETEM/information">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/information_active.png" style="width: 100%;height: 100%;" />
						</span>
						<span>考研资料</span>
					</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/NETEM/lead">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/lead.png" style="width: 100%;height: 100%;" />
						</span>
						<span  class="grey_font">考研指引</span>
					</a>
				</li>
				<li>
					<a href="${pageContext.request.contextPath}/NETEM/mark">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/mark.png" style="width: 100%;height: 100%;" />
						</span>
						<span class="grey_font">估分预测</span>
					</a>
				</li>
				<li>
					<a href="../communication">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/communication.png" style="width: 100%;height: 100%;" />
						</span>
						<span  class="grey_font">论坛交流</span>
					</a>
				</li>
			</ul>
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);	 
	});
</script>
