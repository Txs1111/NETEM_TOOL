<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>估分预测</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/mark.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
</head>
<body>

<div style="width: 100%;height: 700px;" id="main_block">
    <div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
        <a onClick="javascript :history.back(-1);"><font color="white" size="6"> < </font></a>
        <div class="head_line"><b> 估分预测</b></div>
    </div>

    <div class="major_block">
        <div class="text_line" >
            <b>选择你的专业</b>
        </div>
        <select id="select">
            <option value="" disabled="disabled" selected> - -
            </option>
            <%
                List<String> allMajor = (List<String>) request.getAttribute("allMajor");
                if (allMajor != null)
                    for (String am : allMajor) {
            %>
            <option value="<%=am%>"><%=am%>
            </option>
            <%}%>
        </select>
        <div class="step_1">
            <div class="st_text_line">
                <b>输入分数</b>
            </div>

            <div id="allClassId">


            </div>

            <div class="school_line">
                <span>是否有心仪的学校？</span>
                <div class="small_select_block">
                    <select id="school" class="small_select">
                        <option value="" disabled="disabled" selected> - - </option>
                        <%
                            List<String> allCollege = (List<String>) request.getAttribute("allCollege");
                            if (allCollege != null)
                                for (String ac : allCollege) {
                        %>
                        <option value="<%=ac%>"><%=ac%></option>
                        <%}%>
                    </select>
                </div>
            </div>
            <div class="botton_line">
                <a id="submit" >
                    <button class="forecast" onclick="count()">查询</button>
                </a>

            </div>
        </div>
    </div>
</div>
<div class="nav-bottom">
    <ul class="local-nav">

        <li>
            <a href="${pageContext.request.contextPath}/NETEM/information">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/information.png" style="width: 100%;height: 100%;"/>
						</span>
                <span class="grey_font">考研资料</span>
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/NETEM/lead">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/lead.png" style="width: 100%;height: 100%;"/>
						</span>
                <span class="grey_font">考研指引</span>
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/NETEM/mark">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/mark_active.png" style="width: 100%;height: 100%;"/>
						</span>
                <span>估分预测</span>
            </a>
        </li>
        <li>
            <a href="${pageContext.request.contextPath}/Communication/getCommunication">
						<span class="local-nav-icon">
							<img src="${pageContext.request.contextPath}/static/img/icon_img/communication.png" style="width: 100%;height: 100%;"/>
						</span>
                <span class="grey_font">论坛交流</span>
            </a>
        </li>
    </ul>
</div>
</body>
</html>

<script>
    $(function () {
        var wid = $('#main_block').width();
        wid = wid * 0.8;
        $('.nav-bottom').width(wid);

        $('#select').change(function () {
            $('.step_1').fadeOut();
            $('.step_1').fadeIn('slow');
            allclass();

        });
        $('.mark_input input').focus(function () {
            $('.nav-bottom').hide();
        });
        $('.mark_input input').blur(function () {
            $('.nav-bottom').show();
        });
    });
</script>
<script>
    let college = new Array();
    function allclass() {
        let major = $('#select').val();
        major = "${pageContext.request.contextPath}/NETEM/mark/" + major;
        $.ajax({
            url: major,
            type: "post",
            success: function (data) {
                $("#allClassId").empty();
                if (data.length > 0) {
                    for (let i = 0; i < data.length; i++) {
                        $("#allClassId").append('' +
                            '<div class="mark_block">' +
                            '   <div class="mark_tittle">' + data[i] + '</div>' +
                            '<div class="mark_input"><input class="majorSubject" onblur="majorSubject(this)"/></div></div>');
                    }
                }
            }
        })
    };

    function count() {
        let URL = "${pageContext.request.contextPath}/NETEM/forecast_result/"+JSON.stringify(college);
        var ifEmpty = false;
        $('.majorSubject').each(function (){
           if($(this).val()==null||$(this).val()==""){
               ifEmpty = true;
           }
        });

        if(ifEmpty){
            alert('还有没填写好的分数哦~');
        }else{
            $.ajax({
                url: "${pageContext.request.contextPath}/NETEM/forecast_result",
                type: "POST",
                contentType : 'application/json;charset=utf-8', //设置请求头信息
                data: JSON.stringify(college),    //将Json对象序列化成Json字符串，JSON.stringify()原生态方法
                //data: $.toJSON(customerArray),            //将Json对象序列化成Json字符串，toJSON()需要引用jquery.json.min.js
                success: function(data){
                    let c = new Array();
                    if (data.length > 0) {
                        for (let i = 0; i < data.length; i++) {
                            c.push(data[i].name)
                        }
                        let a ="#";
                        if(c!=null && $('#school').val()==null){
                            a ="${pageContext.request.contextPath}/NETEM/forecast_result/"+ $('#select').val() +"/"+c;
                        }else if(c!=null && $('#school').val()!=null){
                            a ="${pageContext.request.contextPath}/NETEM/forecast_result/"+ $('#select').val() +"/"+$('#school').val();
                        }
                        self.location.href=a;
                    }
                }
            })
        }
    };

    function majorSubject(obj) {
        let mark_Line = obj.value;
        let Subject = obj.parentNode.previousSibling.innerText.replace(/(^\s*)|(\s*$)/g, "");
        let URL = "${pageContext.request.contextPath}/NETEM/getCollege/" + $('#select').val() + "/" + Subject + "/" + mark_Line;
        $.ajax({
            url: URL,
            type: "post",
            success: function (data) {
                if (data.length > 0) {
                    for (let i = 0; i < data.length; i++) {
                        college.push({"name": data[i]});
                    }
                }

            }
        })
    };
</script>





