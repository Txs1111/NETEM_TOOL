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
		
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a href="information"><font color="white" size="6"> <  </font></a>
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
					<span class="iconfont icon-paper">&#xe604;</span>
					<span class="year_real">院校排名</span>
				</div>				
			</div>
			
			<div class="major">
				408计算机
			</div>
			
			<div class="rank_content" style="margin-bottom: 37%;">
				<div class="uni">
					<ul>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">清华大学
								<span class="uni_span">985|211|自主划线|综合排名1</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">浙江大学
								<span class="uni_span">985|211|自主划线|综合排名2</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">华中科技大学
								<span class="uni_span">985|211|自主划线|综合排名3</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">北京大学
								<span class="uni_span">985|211|自主划线|综合排名4</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">上海交通大学
								<span class="uni_span">985|211|自主划线|综合排名5</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">东北大学
								<span class="uni_span">985|211|自主划线|综合排名6</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">北京邮电大学
								<span class="uni_span">985|211|自主划线|综合排名12</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">西安电子科技大学
								<span class="uni_span">985|211|自主划线|综合排名13</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
						<li class="uni_detail_li">
							<a href="#">
								<div class="uni_name">西安交通大学
								<span class="uni_span">985|211|自主划线|综合排名14</span>
								<span class="uni_right">></span>			
								</div>
							</a>							
						</li>
					</ul>
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
