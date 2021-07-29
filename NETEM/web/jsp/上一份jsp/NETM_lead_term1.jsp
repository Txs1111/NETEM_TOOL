<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.NETEM.pojo.lead.Term" %>
<%@ page import="java.util.List" %>
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Default</title>
		<link rel="stylesheet" href="css/normalize.css" />
		<link rel="stylesheet" href="css/lead.css" />
		<link rel="stylesheet" href="css/public_style.css" />
		<style>考研指引</style>
	</head>
	<body>
	<%
		List<Term> allTerms = (List<Term>) request.getAttribute("allTerms");
		Term oneTerm = (Term) request.getAttribute("oneTerm");%>
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a href="lead"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研指引</b>
				</div>
			</div>
			
			<!-- 考研术语模块标题 -->
			<div class="head">
				<span>考研相关术语</span>
			</div>
			
			<!-- 搜索模块 -->
			<div class="search">
				<input type="text" name="" id="" class="term_input" value="全日制研究生" />
				<input type="submit" name="" id="" class="term_search" value="搜索" />
			</div>
			
			<!-- 考研相关术语的展示 -->
			<div class="terms">

				<% if (allTerms != null)
					for (Term terms:allTerms) {%>

				<div id="one_term_block">
					<div class="top_decoration"></div>
					<div class="container_term"><%=terms.getName()%></div>
					<div class="explanation_term"><%=terms.getContent()%></div>
				</div>

				<%}%>



			</div>
	    </div>
		
		<!-- 底部导航 -->
		<div class="nav-bottom">
			<ul class="local-nav">
				<li>
					<a href="lead">
						<span class="local-nav-icon">
							<img src="img/icon_img/lead_active.png" style="width: 100%;height: 100%;" />
						</span>
						<span>考研指引</span>
					</a>
				</li>
				<li>
					<a href="information">
						<span class="local-nav-icon">
							<img src="img/icon_img/information.png" style="width: 100%;height: 100%;" />
						</span>
						<span class="grey_font">考研资料</span>
					</a>
				</li>
				<li>
					<a href="mark">
						<span class="local-nav-icon">
							<img src="img/icon_img/mark.png" style="width: 100%;height: 100%;" />
						</span>
						<span class="grey_font">估分预测</span>
					</a>
				</li>
				<li>
					<a href="communication">
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
<script type="text/javascript" src="js/lead.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);	 
	});
</script>
