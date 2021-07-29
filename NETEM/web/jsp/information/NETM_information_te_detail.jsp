<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>考研资料</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/information.css"/>
    <!-- 引入information的字体图标文件 -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/info_fonts.css"/>
</head>
<body>

<div style="width: 100%;height: 700px;" id="main_block">
    <div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
        <a onClick="javascript :history.back(-1);"><font color="white" size="6"> < </font></a>
        <div class="head_line">
            <b>考研资料</b>
        </div>
    </div>

    <!-- 内容 -->
    <div class="gallery-wrapper">
        <a href="NETM_information_te_detail.html">
            <div class="tier">
                <div class="teach_intro">
                    <span class="te_name">林学文</span>
                    <div class="white_panel">
                        <img src="${pageContext.request.contextPath}/static/img/info_img/teacher1.jpeg" class="thumb">
                    </div>
                    <br>
                    <div class="te_one">
                        林学文，男，1975年6月生，湖北省安陆市人，中国致公党党员，工学博士，博士后，教授，硕士生导师。
                    </div>
                    <div class="te_one">
                        2007年获东南大学《供热、供燃气、通风及空调工程》专业博士学位，2009年至2011年在东南大学《动力工程及工程热物理》博士后流动站完成博士后研究。师从国际著名地源热泵专家Dr.
                        Spitler
                        从事地源热泵及其相关领域的研究。现为扬州大学《供热、供燃气、通风及空调工程》、《流体机械及工程》及《动力工程（专业学位）》学科硕士研究生导师、扬州大学优秀青年骨干教师、扬州市“绿扬金凤计划”创新领军人才
                        、中国制冷学会高级会员、江苏省工程热物理学会理事、江苏省制冷学会青年工作委员会副主任委员、江苏省科技通讯咨询专家，兼任《北京工业大学学报》、《制冷学报》、《天津大学学报》、《东南大学学报》、《农业工程学报》、《上海理工大学学报》及《流体机械》等杂志地热能利用方面研究稿件的审稿人。
                    </div>
                    <div class="te_one">
                        已开设的本科教学课程：传热学、流体力学、空气调节、暖通空调、通风工程、建筑设备概论、工程设备、建筑环境与设备工程专业英语等；指导相关课程设计、毕业设计、毕业实习、生产实习等。
                    </div>
                    <div class="te_one">
                        已开设的研究生教学课程：热泵新技术及应用、计算传热学、暖通专业英语、高等传热学等。
                    </div>
                </div>

            </div>
        </a>

        <!-- 	<a href="NETM_information_te_detail.html">
                <div class="tier">
                    <div class="white_panel">
                        <img src="./img/info_img/teacher1.jpeg" class="thumb">
                    </div>
                    <div class="teach_intro">
                        林学文，电子科大外国语学院硕士，英语专业八级，雅思8.0，托福112，GRE334+5.0，EMBA（在读）。多年来从事国内考研英语及国外留学英语辅导，教学经验丰富。
                    </div>
                </div>
            </a>
            <a href="NETM_information_te_detail.html">
                <div class="tier">
                    <div class="teach_intro">
                        林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
                    </div>
                    <div class="white_panel">
                        <img src="./img/info_img/teacher222.webp" class="thumb">
                    </div>
                </div>
            </a>
            <a href="NETM_information_te_detail.html">
                <div class="tier">
                    <div class="white_panel">
                        <img src="./img/info_img/teacher1.jpeg" class="thumb">
                    </div>
                    <div class="teach_intro">
                        林学文，电子科大外国语学院硕士，英语专业八级，雅思8.0，托福112，GRE334+5.0，EMBA（在读）。多年来从事国内考研英语及国外留学英语辅导，教学经验丰富。
                    </div>
                </div>
            </a>
            <a href="NETM_information_te_detail.html">
                <div class="tier">
                    <div class="teach_intro">
                        林学文，中共党员，毕业于南京师范大学外语系。所撰写论文《浅谈英语教学中怎样培养学生英语交际能力》获重庆市一等奖、《英语教学中的探索》获宜宾县三等奖
                    </div>
                    <div class="white_panel">
                        <img src="./img/info_img/teacher222.webp" class="thumb">
                    </div>
                </div>
            </a> -->
    </div>


    <div class="nav-bottom">
        <ul class="local-nav">
            <li>
                <a href="">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/information_active.png"
                                 style="width: 100%;height: 100%;"/>
						</span>
                    <span>考研资料</span>
                </a>
            </li>
            <li>
                <a href="../lead">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/lead.png"
                                 style="width: 100%;height: 100%;"/>
						</span>
                    <span class="grey_font">考研指引</span>
                </a>
            </li>

            <li>
                <a href="../mark">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/mark.png"
                                 style="width: 100%;height: 100%;"/>
						</span>
                    <span class="grey_font">估分预测</span>
                </a>
            </li>
            <li>
                <a href="../communication">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/communication.png"
                                 style="width: 100%;height: 100%;"/>
						</span>
                    <span class="grey_font">论坛交流</span>
                </a>
            </li>
        </ul>
    </div>
</div>
</body>

</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
    $(function () {
        var wid = $('#main_block').width();
        wid = wid * 0.8;
        $('.nav-bottom').width(wid);
    });
</script>
