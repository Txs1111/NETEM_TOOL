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
		<% %>
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
						<span class="iconfont icon-paper">&#xe69d;</span>
						<span class="year_real" style="color: #000000;">优秀老师</span>
					</div>
				</div>
				
				
				<div class="gallery-wrapper">
					<div class="tier">
						<div class="teach_intro">
							林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
						</div>
						<div class="white_panel">
							<img src="./img/info_img/teacher222.webp" class="thumb">
						</div>
					</div>
					
					<div class="tier">
						<div class="teach_intro">
							林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
						</div>
						<div class="white_panel">
							<img src="./img/info_img/teacher1.jpeg" class="thumb">
						</div>
					</div>
					<div class="tier">
						<div class="white_panel">
							<img src="./img/info_img/teacher1.jpeg" class="thumb">
						</div>
						<div class="teach_intro">
							林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
						</div>
					</div>
					<div class="tier">
						<div class="white_panel">
							<img src="./img/info_img/teacher1.jpeg" class="thumb">
						</div>
						<div class="teach_intro">
							林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
						</div>
					</div>					
				</div>
				
				
				
				
				
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
