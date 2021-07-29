<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.NETEM.pojo.lead.Lead_User" %>
<%@ page import="java.util.List" %>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Default</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/lead.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/popup-material-theme.min.css"/>
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/vintage-popup.min.css"/>
		<style>考研指引</style>
	</head>
	<body style="background-color: #F7F7F7;">
	<% List<Lead_User> aim = (List<Lead_User>) request.getAttribute("aim");%>
		<div style="width: 100%;height: 700px;" id="main_block">
			
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研指引</b>
				</div>    
			</div>
			
			<div class="neck_line">
				
				考研目的
			</div>
			<div class="line_behide"></div>
			<% if (aim != null) for (Lead_User a : aim) {%>
			<div class="one_block" style="margin-top: -40px;">
				<div class="msg_author">
					<div class="msg" id="popupTrigge1" data-popup-target="demoPopup">
						<%=a.getContent()%>
					</div>
					<div class="line_middle"></div>
					<div class="author">
						<div class="author_img">
							<img src="${pageContext.request.contextPath}/static/img/lead_img/Patrick_Star_avatar.jfif" width="100%" height="100%">
						</div>
						<div class="author_name">
							<%=a.getName()%>
						</div>
						<div class="likes">
							<img src="${pageContext.request.contextPath}/static/img/lead_img/like_orig.png" width="100%" height="100%"><%=a.getLikes()%>
						</div>
					</div>
				</div>
				<div class="date">
					<%=a.getTime()%>
				</div>
			</div>
			<%}%>

			<!-- 弹出层 -->
			<div class="popup" tabindex="-1" role="dialog" data-popup-id="demoPopup">
			    <div class="popup__container">
			        <div class="popup__close"><span></span><span></span></div>
			        <div class="popup__content">
						<div class="content_box">
							
						</div>
			        </div>
			    </div>
			</div>
			
			


				
			
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/lead.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/vintage-popup.min.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);	 
	});
</script>
<script>$('#popupTrigge1').popup();</script>
<script>$('#popupTrigge2').popup();</script>
<script>$('#popupTrigge3').popup();</script>