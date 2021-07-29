<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>论坛交流</title>
		<link rel="stylesheet" href="css/normalize.css" />
		<link rel="stylesheet" href="css/communication.css" />
		<link rel="stylesheet" href="css/public_style.css" />
		<style></style>
	</head>
	<body>
		<div style="width: 100%;" id="main_block"> 
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> < </font></a>
				<div class="head_line"><b>  论坛交流</b></div>
			</div>
			
			<div class="yard_block stable">
				<div class="section_tab_active"><b>问答</b></div>
				<div class="section_tab">
					<a href="${pageContext.request.contextPath}/Communication/getCommunication">社区</a>
				</div>
				<div class="section_tab">
					<a href="${pageContext.request.contextPath}/Communication/getCommunityresource">资源</a>
				</div>
				<div class="section_tab"></div>
				<div class="line_bottom"></div>
			</div>
			<div class="search_icon">
				<img src="img/icon_img/search.png" width="100%" height="100%"/>
			</div>
			<div style="height: 700px;overflow-y: scroll;">
				
				<div class="QA_block">
					<div class="QA_left_text">
						<div class="QA_tittle">
							鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?
						</div>
						<div class="QA_date_comment">
							<div class="comment_pic">
								<img src="img/icon_img/comment.png" width="9px" height="9px" />
							</div>
							<div>&nbsp;:19</div>
							<div class="date">&nbsp;&nbsp;2021-6-9&nbsp;&nbsp;&nbsp;&nbsp;</div>
						</div>
					</div>
					
					<div class="QA_right_img">
						<div class="QA_img_block">
							<img src="img/example_img/1.jpeg" class="pimg"/>
						</div>
					</div>
				</div>
				
				<div class="QA_block">
					<div class="QA_text">
						<div class="QA_tittle">
							鬼灵贼会被砍吗?鬼灵贼会被砍吗?
						</div>
						<div class="QA_date_comment">
							<div class="comment_pic">
								<img src="img/icon_img/comment.png" width="9px" height="9px" />
							</div>
							<div>&nbsp;:19</div>
							<div class="date">&nbsp;&nbsp;2021-6-9&nbsp;&nbsp;&nbsp;&nbsp;</div>
						</div>
					</div>
					
				</div>
				
				<div class="QA_block">
					<div class="QA_left_text">
						<div class="QA_tittle">
							鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?
						</div>
						<div class="QA_date_comment">
							<div class="comment_pic">
								<img src="img/icon_img/comment.png" width="9px" height="9px" />
							</div>
							<div>&nbsp;:19</div>
							<div class="date">&nbsp;&nbsp;2021-6-9&nbsp;&nbsp;&nbsp;&nbsp;</div>
						</div>
					</div>
					
					<div class="QA_right_img">
						<div class="QA_img_block">
							<img src="img/example_img/1.jpeg" class="pimg"/>
						</div>
					</div>
				</div>
				
				<div class="QA_block">
					<div class="QA_text">
						<div class="QA_tittle">
							鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?鬼灵贼会被砍吗?
						</div>
						<div class="QA_date_comment">
							<div class="comment_pic">
								<img src="img/icon_img/comment.png" width="9px" height="9px" />
							</div>
							<div>&nbsp;:19</div>
							<div class="date">&nbsp;&nbsp;2021-6-9&nbsp;&nbsp;&nbsp;&nbsp;</div>
						</div>
					</div>
					
				</div>
			</div>
		</div>
		
		<div class="take_place"></div>
		<!-- 悬浮加号 -->
		<a href="NETM_send_post.html">
			<div class="leafing_button">
				<img src="img/icon_img/and.png" class="leafing_button_img"/>
				<div class="leafing_button_line">发帖</div>
			</div>
		</a>
		
		<!-- 底部导航栏 -->
		<div class="nav-bottom">
			<ul class="local-nav">
				<li>
					<a href="NETM_lead.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/lead.png" style="width: 100%;height: 100%;" />
						</span>
						<span   class="grey_font">考研指引</span>
					</a>
				</li>
				<li>
					<a href="NETM_information.html">
						<span class="local-nav-icon">
							<img src="img/icon_img/information.png" style="width: 100%;height: 100%;" />
						</span>
						<span class="grey_font">考研资料</span>
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
							<img src="img/icon_img/communication_active.png" style="width: 100%;height: 100%;" />
						</span>
						<span>论坛交流</span>
					</a>
				</li>
			</ul>
		</div>
				<div id="outerdiv_1" style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;">
			    <div id="innerdiv_1" style="position:absolute;">
			        <img id="bigimg_1" style="border:1px solid #fff;" src="" />
			    </div>
			</div>
	</body>
</html>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/click_show.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);
	});
</script>
