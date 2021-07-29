<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.NETEM.pojo.mark.Mark" %>
<%@ page import="java.util.HashSet" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>论坛交流</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/mark.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/fcicon.css?vs=20200819">
    <style></style>
</head>
<body>
<%
    List<List<Mark>> marks = (List<List<Mark>>) request.getAttribute("marks");
%>
<div style="width: 100%;" id="main_block">
    <div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
        <a onClick="javascript :history.back(-1);"><font color="white" size="6"> < </font></a>
        <div class="head_line"><b> 预测录取</b></div>
    </div>
    <div class="result_top">
        <div class="again"><a href="${pageContext.request.contextPath}/NETEM/mark"><u>再次查询</u></a></div>
        <div class="sign">*预测结果仅供参考！</div>
        <div class="major_show">专业：<%if (marks != null) out.print(marks.get(0).get(0).getMajor());%></div>
    </div>

    <div class="result_tittle">预测结果</div>
    <% HashSet<String> name = new HashSet<>();
        for (List<Mark> n : marks) {
            for (Mark n2 : n)
                name.add(n2.getName());
        }
        for (String n : name) { 
    %>
    <div class="college_card purple_card">
        <div class="left_icon">
            <i class="fc-icon-<%=n%>"></i>
        </div>
        <div class="right_msg">
            <div class="college_name">
                <b><%=n%>
                </b>
            </div>
            <% for (List<Mark> nn : marks) {
                for (Mark n2 : nn) {
                    if (n2.getName().equals(n)) {%>
            <div class="subject"><%=n2.getMajorSubject()%>:<%=n2.getMarkLine()%>
            </div>
            <% }

            }
            }%>
        </div>
    </div>
    <%}%>
</div>


</body>
</html>
