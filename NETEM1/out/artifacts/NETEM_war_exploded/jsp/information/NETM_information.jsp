<%@ page import="java.util.List" %>
<%@ page import="com.NETEM.pojo.information.Information" %>
<%@ page import="com.NETEM.pojo.information.RealExam" %>
<%@ page import="com.NETEM.pojo.information.Outline" %>
<%@ page import="com.NETEM.pojo.information.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>考研资料</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/information.css" />
	<!-- 引入information的字体图标文件 -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/info_fonts.css"/>
</head>
<body>
<%
	List<Information> Rank = (List<Information>) request.getAttribute("Rank");
	List<Information> Mark = (List<Information>) request.getAttribute("Mark");
	List<Information> Admission = (List<Information>) request.getAttribute("Admission");
	List<RealExam> realExam = (List<RealExam>) request.getAttribute("realExam");
	List<Outline> outline = (List<Outline>) request.getAttribute("outline");
	List<Teacher> teacher = (List<Teacher>) request.getAttribute("teacher");
%>
	<div style="width: 100%;height: 700px;" id="main_block">
		<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
			<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
			<div class="head_line">
				<b>考研资料</b>
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

			<!-- 时间线 -->
			<div class="time">
				<a href="timeLine">
					<img src="${pageContext.request.contextPath}/static/img/info_img/time.jpg" >
				</a>
			</div>

			<!-- 局部导航栏 -->
			<nav id="operbox">
				<div class="nav_part">
					<a href="rankDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/rank.png">
						<span>院校排名</span>
					</a>
					<a href="markDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/mark.png" >
						<span>历年分数</span>
					</a>
					<a href="real_examDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/real.png" >
						<span>历年真题</span>
					</a>
					<a href="outlineDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/outline.png" >
						<span>考试大纲</span>
					</a>
					<a href="admissionDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/admission.png" >
						<span>报录情况</span>
					</a>
					<a href="teacherDetails">
						<img src="${pageContext.request.contextPath}/static/img/info_img/teacher.png" >
						<span>优秀老师</span>
					</a>
				</div>
			</nav>

			<!-- 具体内容 -->
			<div class="small-container">
				<ul>
					<!-- 院校排名 -->
				    <li class="lili rank_ul_li">
						<div class="level">
							<span class="small-left">院校排名</span>
							<a href="rankDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<ul class="ululul">
							<% if (Rank != null) for(int i =0;i<Rank.size();i++){%>
							<li><a href="${pageContext.request.contextPath}/NETEM/rankDetail/<%=Rank.get(i).getID()%>"><%=Rank.get(i).getTitle()%></a></li><%}%>
						</ul>
				    </li>

					<li style="display: block;width: 100%; height: 5px;background-color: #f4f4f4;"></li>

					<!-- 历年分数 -->
					<li class="lili mark_ul_li" style="padding-top: 3%;">
						<div class="level">
							<span class="small-left">历年分数</span>
							<a href="markDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<ul class="ululul" style="text-align: center;">
							<% if (Mark != null) for(int i =0;i<Mark.size();i++){%>
							<li><a href="${pageContext.request.contextPath}/NETEM/markDetail/<%=Mark.get(i).getID()%>"><%=Mark.get(i).getTitle()%></a></li><%}%>
						</ul>
					</li>

					<li style="display: block;width: 100%; height: 5px;background-color: #f4f4f4;"></li>

					<!-- 历年真题 -->
					<li class="lili real_ul_li">
						<div class="level" style="margin-top: 3%;">
							<span class="small-left">历年真题</span>
							<a href="real_examDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<ul class="ululul real_ul">
							<% if (realExam != null) for(int i =0;i<realExam.size();i++){%>
							<li><a href="${pageContext.request.contextPath}/NETEM/real_examDetail/<%=realExam.get(i).getID()%>"><%=realExam.get(i).getTitle()%></a></li><%}%>
						</ul>
					</li>

					<li style="display: block;width: 100%; height: 5px;background-color: #f4f4f4;"></li>

					<!-- 考试大纲 -->
					<li class="lili outline_ul_li">
						<div class="level">
							<span class="small-left">考试大纲</span>
							<a href="outlineDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<%--                        使用循环遍历出内容--%>
						<%--                        <% if (outline != null) for(int i =0;i<outline.size();i++){%>--%>


						<%--                        <p class="outline_p1"><%=outline.get(i).getTitle()%></p>--%>
						<%--                        <a href="NETM_information_outline" class="outline_b">--%>
						<%--                            <%=outline.get(i).getContent()%>--%>
						<%--                        </a>--%>
						<%--                        <p class="resource">来源：<%=outline.get(i).getResource()%></p>--%>
						<%--                        <%}%>--%>
						<% if (outline != null){%>
						<p class="outline_p1"><%=outline.get(0).getTitle()%></p>
						<a href="${pageContext.request.contextPath}/NETEM/outlineDetail/<%=outline.get(0).getID()%>" class="outline_b">
							<%=outline.get(0).getContent()%>
						</a>
						<p class="resource">来源：<%=outline.get(0).getResource()%></p>

						<p class="outline_p2"><%=outline.get(1).getTitle()%></p>
						<a href="${pageContext.request.contextPath}/NETEM/outlineDetail/<%=outline.get(1).getID()%>" class="outline_b">
							<%=outline.get(1).getContent()%>
						</a>
						<p class="resource">来源：<%=outline.get(1).getResource()%></p>
						<%}%>
					</li>


					<li style="display: block;width: 100%; height: 5px;background-color: #f4f4f4;"></li>

					<!-- 报录情况 -->
					<li class="lili admission_ul_li">
						<div class="level">
							<span class="small-left">报录情况</span>
							<a href="admissionDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<ul class="ululul">
							<% if (Admission != null) for(int i =0;i<Admission.size();i++){%>
							<li><a href="${pageContext.request.contextPath}/NETEM/admissionDetail/<%=Admission.get(i).getID()%>"><%=Admission.get(i).getTitle()%></a></li><%}%>
						</ul>
					</li>

					<li style="display: block;width: 100%; height: 5px;background-color: #f4f4f4;"></li>

					<!-- 优秀老师 -->
					<li class="lili teacher_ul_li">
						<div class="level">
							<span class="small-left">优秀老师</span>
							<a href="teacherDetails" class="lilili">
								<img src="${pageContext.request.contextPath}/static/img/info_img/more.png" >
							</a>
						</div>
						<div class="teacher_pic">
							<% if (teacher!=null){%>
							<div class="teacher_pic_one">
								<div class="teacher_pic_img"></div>
								<div class="teacher_pic_intro">
									<p style="color:#23a8f2;"><%=teacher.get(0).getName()%></p>
									<div class="teacher_pic_content">
										<a href="${pageContext.request.contextPath}/NETEM/teacherDetail/<%=teacher.get(0).getID()%>">
											<%=teacher.get(0).getShortIntroduce()%>
										</a>
									</div>
								</div>
							</div>
							<div class="teacher_pic_two">
								<div class="teacher_pic_img"></div>
								<div class="teacher_pic_intro">
									<p style="color:#23a8f2;"><%=teacher.get(1).getName()%></p>
									<div class="teacher_pic_content">
										<a href="${pageContext.request.contextPath}/NETEM/teacherDetail/<%=teacher.get(1).getID()%>">
											<%=teacher.get(1).getShortIntroduce()%>
										</a>
									</div>
								</div>
							</div>
							<%}%>
						</div>
					</li>
				</ul>
			</div>
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
				<a href="${pageContext.request.contextPath}/NETEM/Community">
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
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-scrolltofixed.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);
		$('#operbox').scrollToFixed({
			 marginTop:50,
		});
	});
</script>