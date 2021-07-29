<%@ page import="com.NETEM.pojo.information.Teacher" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Default</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/communication.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/information.css"/>
	<!-- 引入information的字体图标文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/info_fonts.css"/>
</head>
<body>
<% List<Teacher> teachers = (List<Teacher>) request.getAttribute("teacher"); %>
	<div style="width: 100%;" id="main_block">
		<!-- 头部部分和返回键 -->
		<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
			<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
			<div class="head_line"><b>  课程介绍</b></div>
		</div>
		
		
		<!-- 内容 -->
		<div class="big-container">
			<!-- 搜索栏 -->
			<div class="container-head">
				<a href="searchPage">
					<div class="index-search">搜索院校资料</div>
					<span class="iconfont icon-head1">&#xe624;</span>
				</a>
			</div>
		
			<div class="all_head">
				<span class="iconfont icon-paper">&#xe69d;</span>
				<span class="year_real" style="color: #000000;">优秀老师</span>
			</div>
			</div>
			
			<div class="te_container">
				<ul>
					<% for (Teacher t:teachers){%>
					<li class="te_course">
					<a href="${pageContext.request.contextPath}/NETEM/teacherDetail/<%=t.getID()%>">
							<div class="te_course_induce">
								<div class="te_course_title"><%=t.getName()%></div>
								<div class="te_course_less">
									<%=t.getShortIntroduce()%>
								</div>
							</div>
							<div class="te_course_img">
								<img src="${pageContext.request.contextPath}/static/img/info_img/teacher1.jpeg" >
							</div>
					</a>
					</li>
					<%}%>
				</ul>
				
			</div>
		</div>	
	</div>
</body>
</html>
