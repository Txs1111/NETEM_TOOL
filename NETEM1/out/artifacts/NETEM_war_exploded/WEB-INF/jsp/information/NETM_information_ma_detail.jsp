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
</head>
<body>
	<div style="width: 100%;" id="main_block">
		<!-- 头部部分和返回键 -->
		<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
			<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
			<div class="head_line"><b>  分数公布</b></div>
		</div>
		
		
		<!-- 内容 -->
		<div class="ma_container">
			<div class="ma_title">
				<div class="ma_strong">浙江大学2020计算机考研复试线，浙江大学2020考研复试分数线已公布</div>		
			</div>
			<div class="ma_content">
				<div class="ma_tips_a">
					2020浙江大学考研复试分数线已公布！点击查看>>34所自划线院校2020考研复试分数线。2020考研国家线已公布，当前2020考研考生需全力准备考研复试/调剂工作>>考研复试学习指南，让你不再盲目备战。
				</div>
				<div class="ma_tips_a">
					浙江大学2020年硕士研究生复试分数线的基本要求
				</div>
				<div class="ma_tips_a">
					一、学术学位各学科基本要求
				</div>
				<div class="ma_tips_img">
					<img src="${pageContext.request.contextPath}/static/img/info_img/ma_tips_img1.jpg" class="lightense" >
				</div>
				<div class="ma_tips_a">
					二、专业学位各类别基本要求
				</div>
				<div class="ma_tips_img">
					<img src="${pageContext.request.contextPath}/static/img/info_img/ma_tips_img2.jpg" class="lightense" >
				</div>
				<div class="ma_tips_a">
					三、上述两表所列分数线(管理类联考除外)满足以下情况视同上线：若单科低1分，总分相应高20分及以上；单科低2分，总分高25分及以上；以此类推，单科每低1分，总分相应再提高5分。但单科不得低于5分(含5分)，且仅限1门单科。适用该政策上线的考生，总分相应扣减后计算各项排名。
				</div>
				<div class="ma_tips_a">
					四、强军计划考生、工程师学院单独考试考生，外语不低于40分，政治不低于40分，业务课不低于60分，总分不低于270分，可参加复试。
				</div>
				<div class="ma_tips_a">
					五、国家少数民族高层次骨干人才培养计划考生初试成绩同时满足以下要求的，可参加复试：
				</div>
				<div class="ma_tips_a">
					1．总分成绩要求：依据所报考专业在表中基本分数线的总分降低4%。
				</div>
				<div class="ma_tips_a">
					2．单科成绩要求：满分为100分的科目成绩不低于50分，满分为150分的科目成绩不低于75分，满分为200分的科目成绩不低于100分，满分为300分的科目成绩不低于150分。
				</div>
				<div class="ma_tips_a">
					六、退役大学生士兵专项计划考生初试成绩同时满足以下要求的，可参加复试：
				</div>
				<div class="ma_tips_a">
					1．总分成绩要求：依据所报考专业在表中基本分数线的总分降低10%。
				</div>
				<div class="ma_tips_a">
					2．单科成绩要求：满分为100分的科目成绩不低于50分，满分为150分的科目成绩不低于75分，满分为200分的科目成绩不低于100分，满分为300分的科目成绩不低于150分。
				</div>
				<div class="ma_tips_a">
					七、西藏公共管理人才培养计划考生，外语不低于40分，管理类联考综合能力不低于80分，总分不低于140分可参加复试。
				</div>
				<div class="ma_tips_a">
					八、参加“大学生志愿服务西部计划”“三支一扶计划”“农村义务教育阶段学校教师特设岗位计划”“赴外汉语教师志愿者”“高校学生应征入伍服现役退役”“选聘高校毕业生到村任职”等项目的考生，加分政策按教育部统一规定的范围和标准执行。符合条件的考生请在学校基本分数线公布一周内把相关证明和证件扫描后发送到研究生招生处邮箱
				</div>
				<div class="ma_tips_a">
					相关复试工作安排另行通知，请考生关注学校研究生招生网和各学院(系)官网通知。
				</div>
				<div class="ma_tips_a">
					浙江大学研究生招生处
				</div>
				<div class="ma_tips_a">				
					2020年4月15日
				</div>
				
			</div>
		</div>
	</div>
</body>
</html>
<script src="${pageContext.request.contextPath}/static/js/lightense.js"></script>
<script>
    window.addEventListener('load', function () {
        var el = document.querySelectorAll('img.lightense');
        Lightense(el);
    }, false);
    Lightense(elements, {
        time: 300,
        padding: 40,
        offset: 40,
        keyboard: true,
        cubicBezier: 'cubic-bezier(.2, 0, .1, 1)',
        background: 'rgba(255, 255, 255, .98)',
        zIndex: 2147483647
    });
</script>