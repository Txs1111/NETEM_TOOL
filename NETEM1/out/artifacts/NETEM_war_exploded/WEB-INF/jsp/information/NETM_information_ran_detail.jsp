<%@ page import="com.NETEM.pojo.information.Information" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Default</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/information.css"/>
</head>
<body>
<%Information rank = (Information) request.getAttribute("Rank");%>
	<div style="width: 100%;" id="main_block">
		<!-- 头部部分和返回键 -->
		<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
			<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
			<div class="head_line"><b>  排名公布</b></div>
		</div>


		<!-- 内容 -->
		<div class="ran_container"><%=rank%>
				<!-- 院校排名标题 -->
				<div class="ran_title">
					浙江排名前十的研究生院校有哪些？你心仪院校上榜没？

				</div>
				
				<div class="ran_head">
					<div class="ran_head_img">
						<img src="${pageContext.request.contextPath}/static/img/info_img/jr.jpg" >
					</div>
					<div class="ran_organ">
						FSshark<br>
						<span style="color: #b9bec2;font-size: 10px;">2020-12-25</span>
					</div>
				</div>
				
				<div class="ran_content">
					<div class="ran_premise" style="text-indent: 2em;font-size: 14px;">
						许多学生选择参加研究生入学考试，那么浙江省较好的考研学校是什么？它们的排名是多少？让我们来看看。
					</div>
					<div class="ran_firstLevel">
						浙江考研学校排名
					</div>
					<ol>
						<li>浙江大学</li>
						<li>杭州电子科技大学</li>
						<li>浙江工业大学</li>
						<li>浙江理工大学</li>
						<li>浙江海洋大学</li>
						<li>浙江农林大学</li>
						<li>温州医科大学</li>
						<li>浙江中医药大学</li>
						<li>浙江师范大学</li>
						<li>杭州师范大学</li>
					</ol>
					<div class="ran_tips" style="font-size: 14px;">
						注：学校名单主要是根据学校的社会知名度，并通过对学校教师、硬件设施、学校规模面积、学校建设历史、高级荣誉等重点学校指标的综合整理，供每个人申请入学参考。
					</div>
					<div class="ran_school">
						<div class="ran_blank"></div>
						<span class="ran_ranksch">浙江大学</span>
					</div>
					<div class="ran_sch_detail">
						<div class="ran_sch_detail_a">浙江大学简称“浙大”，坐落于“人间天堂”杭州。前身是1897年创建的求是书院。1928年更名为国立浙江大学。浙江大学是目前国内学科门类最齐全的综合性大学之一。</div>
						<div class="ran_sch_detail_b">该校四大王牌专业分别是：计算机科学与技术专业、软件工程专业、控制科学与工程专业、临床医学专业。</div>
					</div>
					<div class="ran_school">
						<div class="ran_blank"></div>
						<span class="ran_ranksch">杭州电子科技大学大学</span>
					</div>
					<div class="ran_sch_detail">
						<div class="ran_sch_detail_a">杭州电子科技大学，简称“杭电”，是浙江省唯一的一所与国防科工委共建的高校，也是浙江省首批重点建设的5所高校之一。</div>
						<div class="ran_sch_detail_b">该校经管学科优势明显，工、理、经、管、文、法、教、艺等多学科均排名靠前。本校热门专业有计算机科学与技术、电子信息、审计、电子科学与技术、管理科学与工程等等。</div>
					</div>
					<div class="ran_more">
						更多院校排名详情关注中公教育
					</div>					
				</div>			
		</div>
	</div>
</body>
</html>