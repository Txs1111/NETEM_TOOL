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
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/sidebar-menu.css">
    <link rel="stylesheet" href="css/public_style.css">
    <style type="text/css">

    </style>
</head>
<body>

<!-- 右边内容 -->
<div class="main_block" style="background-color: #0056B3!important;">
    <div class="head_black"></div>
    <div class="chart_1">
        <div class="canvas_block">
            <canvas id="canvas1" width="635" height="295"/>
        </div>
    </div>
    <div class="chart_2">
        <div class="canvas_block">
            <canvas id="canvas2" width="635" height="295"/>
        </div>
    </div>
    <div class="chart_3">
        <div class="canvas_block">
            <canvas id="canvas3" width="635" height="295"/>
        </div>
    </div>
    <div class="chart_4">
        <div class="canvas_block">
            <canvas id="canvas4" width="635" height="295"/>
        </div>
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
            <li id="li_active">
                <a href="UserCase" class="point_a">
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
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/sidebar-menu.js"></script>
<script type="text/javascript" src="js/Chart.js"></script>
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
<script>
    var randomScalingFactor = function () {
        return Math.round(Math.random() * 100)
    };


    var lineChartData = {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
        datasets: [
            {
                label: "My First dataset",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
            },
            {
                label: "My Second dataset",
                fillColor: "rgba(151,187,205,0.2)",
                strokeColor: "rgba(151,187,205,1)",
                pointColor: "rgba(151,187,205,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(151,187,205,1)",
                data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
            }
        ]

    }


    var barChartData = {
        labels: ["January", "February", "March", "April", "May", "June", "July"],
        datasets: [
            {
                fillColor: "rgba(220,220,220,0.5)",
                strokeColor: "rgba(220,220,220,0.8)",
                highlightFill: "rgba(220,220,220,0.75)",
                highlightStroke: "rgba(220,220,220,1)",
                data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
            },
            {
                fillColor: "rgba(151,187,205,0.5)",
                strokeColor: "rgba(151,187,205,0.8)",
                highlightFill: "rgba(151,187,205,0.75)",
                highlightStroke: "rgba(151,187,205,1)",
                data: [randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor(), randomScalingFactor()]
            }
        ]

    }

    var pieData = [
        {
            value: 300,
            color: "#F7464A",
            highlight: "#FF5A5E",
            label: "Red"
        },
        {
            value: 50,
            color: "#46BFBD",
            highlight: "#5AD3D1",
            label: "Green"
        },
        {
            value: 100,
            color: "#FDB45C",
            highlight: "#FFC870",
            label: "Yellow"
        },
        {
            value: 40,
            color: "#949FB1",
            highlight: "#A8B3C5",
            label: "Grey"
        },
        {
            value: 120,
            color: "#4D5360",
            highlight: "#616774",
            label: "Dark Grey"
        }

    ];

    var radarChartData = {
        labels: ["Eating", "Drinking", "Sleeping", "Designing", "Coding", "Cycling", "Running"],
        datasets: [
            {
                label: "My First dataset",
                fillColor: "rgba(220,220,220,0.2)",
                strokeColor: "rgba(220,220,220,1)",
                pointColor: "rgba(220,220,220,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(220,220,220,1)",
                data: [65, 59, 90, 81, 56, 55, 40]
            },
            {
                label: "My Second dataset",
                fillColor: "rgba(151,187,205,0.2)",
                strokeColor: "rgba(151,187,205,1)",
                pointColor: "rgba(151,187,205,1)",
                pointStrokeColor: "#fff",
                pointHighlightFill: "#fff",
                pointHighlightStroke: "rgba(151,187,205,1)",
                data: [28, 48, 40, 19, 96, 27, 100]
            }
        ]
    };

    window.onload = function () {
        var ctx1 = document.getElementById("canvas1").getContext("2d");
        window.myLine = new Chart(ctx1).Line(lineChartData, {
            responsive: true
        });
        var ctx2 = document.getElementById("canvas2").getContext("2d");
        window.myBar = new Chart(ctx2).Bar(barChartData, {
            responsive: true
        });
        var ctx3 = document.getElementById("canvas3").getContext("2d");
        window.myPie = new Chart(ctx3).Pie(pieData);

        window.myRadar = new Chart(document.getElementById("canvas4").getContext("2d")).Radar(radarChartData, {
            responsive: true
        });
    }


</script>