<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line">
					<b>考研指引</b>
				</div>
			</div>
			<div class="">
				<div class="one_targeted" style="margin-top: 80px;">
					<div class="include" id="popupTrigge1" data-popup-target="demoPopup">
						研究生（Postgraduate）是国民教育的一种学历，一般由拥有硕士点、博士点的普通高等学校开展，研究生毕业后，也可称研究生，含义为具有研究生学历的人。. 在中国，研究生分为 硕士研究生 及 博士研究生 。. 按照学位类型的不同，分为 学术型研究生 及 专业型研究生 两种。. 学术型研究生一般是指拥有学术型学位的人员，按学科设立，其以学术研究为导向，偏重理论和研究，培养大学教师和科研机构的研究人员为主。. 专业型研究生，与学术型学位研究生处于同一层次，是培养具有扎实理论基础，并适应特定行业或职业实际工作需要的应用型高层次专门人才。.
					</div>
				</div>
				<div class="one_targeted">
					<div class="include" id="popupTrigge2" data-popup-target="demoPopup">
						硕士研究生，即攻读硕士学位的研究生，简称硕士生，人们日常生活中所说的考上了硕士，读硕士等，正是指硕士研究生。硕士研究生是本科之后的深造学历，与本科生相比研究生教育更注重培养学生的研究问题和分析问题的能力，特别是该学科科研教学的能力。
					</div>
				</div>
				<div class="one_targeted">
					<div class="include" id="popupTrigge3" data-popup-target="demoPopup">
						统招研究生（包含全日制及非全日制两种学习形式）分为硕士研究生和博士研究生。考取硕士研究生一般需要考外语、政治、综合科目（根据报考专业不同而不同）和专业课。而考博士研究生不需要考政治。
					</div>
				</div>
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