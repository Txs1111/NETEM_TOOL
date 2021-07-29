<%@ page import="com.NETEM.pojo.lead.Term" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <!--[if IE]>
    <script src="http://libs.useso.com/js/html5shiv/3.7/html5shiv.min.js"></script>
    <![endif]-->
    <!-- <link rel="stylesheet" href="css/bootstrap-3.3.7.css"> -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/bootstrap-3.3.7.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/sidebar-menu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/public_style.css">
    <style type="text/css">
    </style>
</head>
<body>
<% List<Term> terms = (List<Term>) request.getAttribute("terms"); %>
<!-- 右边内容 -->
<div class="main_block">
    <div class="head_black"></div>
    <div class="middle_area">
        <div class="panel">
            <div class="panel-heading">
                <h3 class="green_font">考研术语</h3>
            </div>
            <div class="panel-body">
                <label>
                    id:<input type="text" class="form-control"/>
                </label>
                <label>
                    术语:<input type="text" class="form-control"/>
                </label>
                <label>
                    添加时间:<input type="text" class="form-control"/>
                </label>
                <button type="button" class="btn btn-primary green_style">
                    <i class="fa fa-search"></i> &nbsp;搜索&nbsp;
                </button>
            </div>
        </div>
        <table class="table table-hover table-bordered">
            <thead class="thead_style">
            <tr>
                <th class="chosen"><input type="checkbox" class="chosen_check"></th>
                <th>ID</th>
                <th>术语</th>
                <th>术语介绍</th>
                <th>添加时间</th>
                <th>管理</th>
            </tr>
            </thead>
            <tbody>

            <% for (Term t:terms){%>
            <tr>
                <td>
                    <input type="checkbox" class="chosen_check">
                </td>
                <td><%=t.getID()%></td>
                <td><%=t.getName()%></td>
                <td class="content">
                    <div><%=t.getContent()%>
                    </div>
                </td>
                <td><%=t.getAddTime()%></td>
                <td>
                    <button class="change"><i class="fa fa-dedent"></i>&nbsp;&nbsp;修改</button>
                    <button class="delete"><i class="fa fa-times-rectangle-o"></i>&nbsp;&nbsp;删除</button>
                </td>
            </tr>
            <%}%>
            </tbody>
        </table>

        <ul class="pagination">
            <li><a href="#">&laquo;</a></li>
            <li><a href="#">1</a></li>
            <li><a href="#">2</a></li>
            <li><a href="#">3</a></li>
            <li><a href="#">4</a></li>
            <li><a href="#">5</a></li>
            <li><a href="#">&raquo;</a></li>
        </ul>
    </div>
</div>


<!-- 左部导航栏 -->
<aside class="main-sidebar">
    <section class="sidebar">
        <ul class="sidebar-menu">
            <li class="header">𝐍𝐄𝐓𝐄𝐌&nbsp;&nbsp;V0.1</li>
            <li class="treeview">
                <a href="MemberController">
                    <i class="fa fa-users"></i> <span>成员管理</span>
                </a>
            </li>
            <li class="treeview" id="li_active">
                <a href="" class="point_a">
                    <i class="fa fa-files-o"></i>
                    <span>资源管理</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu" id="open">
                    <li><a href="TermController" class="green_font"><i class="fa fa-dot-circle-o"
                                                                       aria-hidden="true"></i> 考研术语</a></li>
                    <li><a href="RankController"><i class="fa fa-circle-o"></i> 院校排名</a></li>
                    <li><a href="ScoreController"><i class="fa fa-circle-o"></i> 历年分数</a></li>
                    <li><a href="ReportController"><i class="fa fa-circle-o"></i> 学校录报</a></li>
                    <li><a href="RealExamController"><i class="fa fa-circle-o"></i> 历年真题</a></li>
                    <li><a href="OutlineController"><i class="fa fa-circle-o"></i> 考试大纲</a></li>
                    <li><a href="TeacherController"><i class="fa fa-circle-o"></i> 考研老师</a></li>
                </ul>
            </li>
            <li>
                <a href="UserCase">
                    <i class="fa fa-pie-chart"></i> <span>使用情况</span>
                </a>
            </li>
            <li>
                <a href="LogController">
                    <i class="fa fa-calendar"></i> <span>网站日志</span>
                </a>
            </li>
            <li class="treeview">
                <a>
                    <i class="fa-comments-o fa"></i> <span>站内内容</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li><a href="AimController"><i class="fa fa-circle-o"></i> 考研目的</a></li>
                    <li><a href="ExpController"><i class="fa fa-circle-o"></i> 考研经验</a></li>
                    <li><a href="BombController"><i class="fa fa-circle-o"></i> 考研雷区</a></li>
                    <li><a href="CommunityController"><i class="fa fa-circle-o"></i> 社区交流</a></li>
                    <li><a href="QAController"><i class="fa fa-circle-o"></i> 社区问答</a></li>
                    <li><a href="CommunityResource"><i class="fa fa-circle-o"></i> 社区资源</a></li>
                    <li><a href="ResponseController"><i class="fa fa-circle-o"></i> 回复管理</a></li>
                </ul>
            </li>
        </ul>
    </section>
</aside>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/webback/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/webback/js/sidebar-menu.js"></script>
<script>
    $.sidebarMenu($('.sidebar-menu'));
    $('#li_active').addClass('li_active');
    if ($("#li_active .point_a").css('background-color') == "rgb(0, 150, 136)") {
        $(this).removeClass('li_active');
    }
    $(function () {
        $('#li_active').mouseenter(function () {
            $(this).removeClass('li_active');
        });
        $('#li_active').mouseleave(function () {
            $(this).addClass('li_active');

        });
    });

</script>