<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.NETEM.pojo.lead.Term" %>
<%@ page import="java.util.List" %>
<html>
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
	<body style="background-color: #F5F5F5;">
	<%
		List<Term> allTerms = (List<Term>) request.getAttribute("allTerms");
		Term oneTerm = (Term) request.getAttribute("oneTerm");%>
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研指引</b>
				</div>
			</div>
			
		
			<div class="termPage_head">
				<div class="font">考研术语</div>
				<!-- <div class="line_blow"></div> -->
				<a href="${pageContext.request.contextPath}/NETEM/toSearchPage" class="jumpToSearchPage">
					<div class="search">    
					    <img src="${pageContext.request.contextPath}/static/img/lead_img/search.png" width="100%" height="100%">
					</div>
				</a> 
			</div>
			<div class="line_blow"></div>
			
			<!-- 考研相关术语的展示 -->
			<div class="terms">
				<% if (allTerms != null)
					for (Term terms:allTerms) {%>
				<div class="one_term_block" >
					<div class="block_layer1" id="popupTrigge1" data-popup-target="demoPopup" >
						<div class="term_keyword">
							<%=terms.getName()%>
						</div>
						<div class="term_explanation" >
							<div class="font_box" >
								<%=terms.getContent()%>
							</div>
							
						</div>
					</div>
					<div class="round_top">
						
					</div>
					<div class="round_middle">
						
					</div>
					<div class="round_bottom">
						
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
<script>$('#popupTrigge4').popup();</script>