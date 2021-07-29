
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Default</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/normalize.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lead.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/public_style.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/popup-material-theme.min.css"/>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/vintage-popup.min.css"/>

		<style>考研指引</style>
	</head>
	<body >
    <%
        List<Term> terms = (List<Term>) request.getAttribute("terms");
        List<Lead_User> aim = (List<Lead_User>) request.getAttribute("aim");
        List<Lead_User> bomb = (List<Lead_User>) request.getAttribute("bomb");
        List<Lead_User> exp = (List<Lead_User>) request.getAttribute("exp");%>
		<div style="width: 100%;height: 700px;" id="main_block">

			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研指引</b>
				</div>
			</div>
				<ul class="top_nav">
					<li><div class="top_nav_icon"><img src="img/lead_img/term1_top_nav.png" width="100%" height="100%"></div><div class="top_nav_font">术语</div></li>
					<li><div class="top_nav_icon"><img src="img/lead_img/aim1-top_nav.png" width="100%" height="100%"></div><div class="top_nav_font">目标</div></li>
					<li><div class="top_nav_icon"><img src="img/lead_img/bomb1_top_nav.png" width="100%" height="100%"></div><div class="top_nav_font">雷区</div></li>
					<li><div class="top_nav_icon"><img src="img/lead_img/lesson1_top_nav.png" width="100%" height="100%"></div><div class="top_nav_font">经验</div></li>
				</ul>

			<!-- </div> -->
			<div class=" lead isTerms" id="isTerms">
				<div class="icon_term icon"><img src="./img/lead_img/icon_term2.png" style="width: 100%;height: 100%;"></div>
				<span class="pre">考研相关术语</span>
				<span class="subse"><a href="term">更多</a></span>
			</div>

			<!-- 使用轮播图展示考研术语 -->
			<div class="workForTabs">
							<div class="focus SlideShow">
								<!-- <div id="leftArrow">
									<img src="img/lead_img/left_arrow.png" width="100%" ">
								</div> -->
								<ul class="showTerms" id="showTerms">
									<li class="Two_one_page">
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(0).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(0).getContent()); %></div></div>
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(1).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(1).getContent()); %></div></div>
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(2).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(2).getContent()); %></div></div>
									</li>
									<li class="Two_one_page">
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(3).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(3).getContent()); %></div></div>
								        <div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(4).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(4).getContent()); %></div></div>
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(5).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(5).getContent()); %></div></div>
									</li>
									<li class="Two_one_page">
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(6).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(6).getContent()); %></div></div>
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(7).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(7).getContent()); %></div></div>
										<div class="child"><div class="keyword"><div id="circle"></div><div id="word"><% if (terms != null) out.print(terms.get(8).getName()); %></div></div><div class="explanation"><% if (terms != null) out.print(terms.get(8).getContent()); %></div></div>
									</li>
								</ul>

								<ol>
								    <li class="bg"></li>
								    <li></li>
								    <li></li>
									<li></li>
									<li></li>
								</ol>
							</div>
							</div>

			<div class="lead isAims" id="isAims">
				<div class="icon_aim icon" ><img src="./img/lead_img/icon_aim2.png" style="width: 100%;height: 100%;"></div>
				<span class="pre">考研目的</span>
				<span class="subse"><a href="aim">更多</a></span>
			</div>

			<div class="show_aims">
                <% for (Lead_User a : aim) {%>
				<div id="one_aim_block">
					<div class="user_info">
						<div class="user_head">
							<img src="img/lead_img/Patrick_Star_avatar.jfif" width="100%" height="100%">
						</div >
					    <div class="user_name"><% if (aim != null) out.print(a.getName()); %></div>
					</div>
					<div class="content_likes">
						<div class="aim_content"><% if (aim != null) out.print(a.getContent()); %></div>
						<div class="icon_likes"><img src="img/lead_img/likes.png" alt="" width="100%"><% if (aim != null) out.print(a.getLikes()); %></div>
					</div>
				</div>
                <%}%>
		    </div>

			<div class="lead isBombs" id="isBombs">
				<div class="icon_bomb icon"><img src="./img/lead_img/icon_bomb3.png" style="width: 100%;height: 100%;"></div>
				<span class="pre">考研雷区</span>
				<span class="subse"><a href="bomb">更多</a></span>
			</div>
              <!-- 显示用户发表的考研雷区的模块 -->
			<div class="show_bombs" >
                <% for (Lead_User b : bomb) {%>
				<div id="one_bomb_block">
					<div class="user_info">
						<div class="user_head">
							<img src="img/lead_img/octopus_head.jfif" width="100%" height="100%">
						</div >
					    <div class="user_name"><% if (bomb != null) out.print(b.getName()); %></div>
					</div>
					<div class="content_likes">
						<div class="bomb_content"><% if (bomb != null) out.print(b.getContent()); %></div>
						<div class="icon_likes"><img src="img/lead_img/likes.png" alt="" width="100%"><% if (bomb != null) out.print(b.getLikes()); %></div>
					</div>
				</div>
                <%}%>

			</div>

			<div class="lead isLessons" id="isLessons">
				<div class="icon_lesson icon" ><img src="./img/lead_img/icon_lesson3.png" style="width: 100%;height: 100%;"></div>
				<span class="pre">考研经验</span>
				<span class="subse"><a href="exp">更多</a></span>
			</div>
			<!-- 显示用户发表的考研经验的模块 -->
			<div class="show_lessons">
                <% for (Lead_User e : exp) {%>
				<div id="one_lesson_block">
					<div class="user_info">
						<div class="user_head">
							<img src="img/lead_img/Spongebob_head.jfif" width="100%" height="100%">
						</div >
					    <div class="user_name"> <% if (exp != null) out.print(e.getName()); %></div>
					</div>
					<div class="content_likes">
						<div class="lesson_content"> <% if (exp != null) out.print(e.getContent()); %></div>
						<div class="icon_likes"><img src="img/lead_img/likes.png" alt="" width="100%"> <% if (exp != null) out.print(e.getLikes()); %></div>
					</div>
				</div>
                <%}%>

			</div>

		</div>


		<!-- 发布目的 -->
		<a href="addLead">
			<div class="leafing_button button_forAimPost">
				<img src="img/icon_img/and.png" class="leafing_button_img"/>
				<div class="leafing_button_line" >发帖</div>
			</div>
		</a>
		<!-- 发表评论 -->
		<div class="aim_post">
			<div class="go_out"><img src="img/icon_img/close.png" alt="" width="16px" height="16px"></div>
			<div class="message"><textarea type="text" placeholder="请输入你的看法~"></textarea></div>
			<div class="expression_post">
				<div class="expression"><img src="img/lead_img/expression.png" alt=""></div>
				<div class="post"><input type="submit"></div>
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
