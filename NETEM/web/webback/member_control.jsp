<%@ page import="com.NETEM.pojo.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.NETEM.service.back.Impl.MemberControllerServiceImpl" %>
<%@ page import="com.NETEM.pojo.User_role" %>
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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/sidebar-menu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/public_style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/webback/js/jquery-3.4.1.js"></script>
    <style type="text/css">
    </style>
</head>
<body>
<% List<User_role> allMember = (List<User_role>) request.getAttribute("allMember");
   List<User_role> roles = (List<User_role>) request.getAttribute("roles");%>
<!-- 右边内容 -->
<div class="main_block">
    <div class="head_black"></div>
    <div class="middle_area">
        <div class="panel">
            <div class="panel-heading">
                <h3 class="green_font">成员管理</h3>
            </div>
            <div class="panel-body">
                <label>
                    id:<input type="text" class="form-control"/>
                </label>
                <label>
                    用户名:<input type="text" class="form-control"/>
                </label>
                <label>
                    角色:<input type="text" class="form-control"/>
                </label>
                <button type="button" class="btn btn-primary green_style" onclick="searchMembers()">
                    <i class="fa fa-search"></i> &nbsp;搜索&nbsp;
                </button>
            </div>
        </div>
        <table class="table table-hover table-bordered">
            <thead class="thead_style">
            <tr>
                <th class="chosen"><input type="checkbox" class="chosen_check"></th>
                <th>Id</th>
                <th>用户名</th>
                <th>角色</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody class="allMember">
            <% if (allMember != null) for (User_role u : allMember) {%>
            <tr>
                <td>
                    <input type="checkbox" class="chosen_check">
                </td>
                <td class="studentCode"><%=u.getStudentCode1()%>
                </td>
                <td class="name"><%=u.getName()%>
                </td>
                <td>
                    <select class="form-control">
                        <option disabled="disabled" selected value="<%=u.getRoleId()%>"><%=u.getRole()%></option>
                        <% for (User_role r : roles) {%>
                        <option value="<%=r.getRoleId()%>"><%=r.getRole()%></option>
                        <%}%>
                    </select>
                <td onclick="setPower(this)">
                    修改
                </td>
            </tr>
            <%}%>
            </tbody>
        </table>
        <script>
            // 修改用户权限ajax
            function setPower(obj) {
                //获取用户id
                let id = $('.form-control').val();
                alert(id);
                //获取用户角色
                let role = "";
                let URL = "${pageContext.request.contextPath}/BackNETEM/UpdateMember";
                $.ajax({
                    url: URL,
                    type: "post",
                    data: {id: 1,name:"谭炳昊" ,role: 2},
                });
            }
            //搜索成员
            function searchMembers() {
                let id = "";
                let name = "";
                let role = "";
                let URL = "${pageContext.request.contextPath}/BackNETEM/SearchMembers";
                alert('进入'+URL)
                $.ajax({
                    url: URL,
                    type: "post",
                    data: {id: '',name:'谭' ,role: ''},
                    success:function (data){
                        $('.allMember').empty();
                        $('.allMember').append('');
                    }
                });
            }
        </script>
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
            <li class="treeview" id="li_active">
                <a href="MemberController" class="point_a">
                    <i class="fa fa-users"></i> <span>成员管理</span>
                </a>
            </li>
            <li class="treeview">
                <a href="resource_control.html">
                    <i class="fa fa-files-o"></i>
                    <span>资源管理</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li><a href="TermController"><i class="fa fa-circle-o"></i> 考研术语</a></li>
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