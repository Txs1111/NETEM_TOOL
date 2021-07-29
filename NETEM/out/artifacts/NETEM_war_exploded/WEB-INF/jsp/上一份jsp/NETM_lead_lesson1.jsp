<%@ page import="com.NETEM.pojo.lead.Lead_User" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,user-scalable=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Default</title>
    <link rel="stylesheet" href="css/normalize.css"/>
    <link rel="stylesheet" href="css/lead.css"/>
    <link rel="stylesheet" href="css/public_style.css"/>
    <style>考研指引</style>
</head>
<body>
<% List<Lead_User> exp = (List<Lead_User>) request.getAttribute("exp");%>
<div style="width: 100%;height: 700px;" id="main_block">

    <div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
        <a href="NETM_lead.html"><font color="white" size="6"> < </font></a>
        <div class="head_line">
            <b>考研指引</b>
        </div>
    </div>

    <div class="neck_line">
        考研经验
    </div>
    <% if (exp != null) for (Lead_User e : exp) {%>
    <div class="one_block" style="margin-top: -40px;">
        <div class="date">
            <%=e.getTime()%>
        </div>
        <div class="msg_author">
            <div class="msg">
                <%=e.getContent()%>
            </div>
            <div class="author">
                <div class="author_img">
                    <img src="img/lead_img/Patrick_Star_avatar.jfif" width="100%" height="100%">
                </div>
                <div class="author_name">
                    <%=e.getName()%>
                </div>
                <div class="likes">
                    <img src="img/lead_img/like_orig.png" width="100%" height="100%"><%=e.getLikes()%>
                </div>
            </div>
        </div>
    </div>
    <%}%>


</div>


</div>
</body>
</html>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="js/lead.js"></script>
<script>
    $(function () {
        var wid = $('#main_block').width();
        wid = wid * 0.8;
        $('.nav-bottom').width(wid);
    });
</script>

