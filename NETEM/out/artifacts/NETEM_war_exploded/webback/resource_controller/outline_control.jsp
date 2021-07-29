<%@ page import="com.NETEM.pojo.information.Outline" %>
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
    <!-- 字体css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/bootstrap-3.3.7.css">
    <!-- 侧边导航栏 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/sidebar-menu.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/public_style.css">
    <!-- 弹出层 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/vintage-popup.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/webback/css/popup-material-theme.min.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/webback/js/jquery-3.4.1.js"></script>
	<style type="text/css">
	</style>
</head>
<body>
<% List<Outline> outlines = (List<Outline>) request.getAttribute("outlines"); %>
	<!-- 右边内容 -->
	<div class="main_block">
		<div class="head_black"></div>
		<div class="middle_area">
		<div class="panel">
			<div class="panel-heading">
				<h3 class="green_font">考试大纲</h3>
			</div>
			<div class="panel-body">
				<label>
					id:<input type="text" class="form-control"/>
				</label>
				<label>
					标题:<input type="text" class="form-control"/>
				</label>
				<label>
					内容:<input type="text" class="form-control"/>
				</label>
				<label>
					年份:<input type="text" class="form-control"/>
				</label>
				<label>
					来源:<input type="text" class="form-control"/>
				</label>
				<label>
					添加时间:<input type="text" class="form-control"/>
				</label>
				<button type="button" class="btn btn-primary green_style" onclick="searchOutlines()">
					<i class="fa fa-search"></i> &nbsp;搜索&nbsp;
				</button>
				<button type="button" class="btn btn-primary blue_style add" data-popup-target="addPopup" onclick="addOutline()">
					<i class="fa fa-plus-square-o"></i> &nbsp;添加&nbsp;
				</button>
				<!-- 添加弹出层 -->
				<div class="popup" tabindex="-1" role="dialog" data-popup-id="addPopup">
				    <div class="popup__container">
				        <div class="popup__close"><span></span><span></span></div>
				        <div class="popup__content">
				           <div class="change_area">
							   <div class="panel-body">
							   	<label>
							   		标题:<input type="text" class="form-control"/>
							   	</label>
								<label style="margin-left: 20px;">
									图片:<input type="file" class=""/>
								</label>
								<br/>
							   	<label>
							   		内容:<textarea type="text" class="form-control" style="width: 600px;height: 120px;resize:none;"></textarea>
							   	</label>
								<br/>
							   	<label>
							   		年份:<input type="text" class="form-control"/>
							   	</label>
								<label style="margin-left: 20px;">
									来源:<input type="text" class="form-control"/>
								</label>
								<br/>
								<br/>
							   	<button type="button" class="btn btn-primary green_style" style="float: right;">
							   		 &nbsp;确认&nbsp;
							   	</button>
							   	
							   </div>
						   </div>
				        </div>
				    </div>
				</div>
			</div>
		</div>
		<table class="table table-hover table-bordered">
			<thead class="thead_style">
				<tr>
					<th class="chosen"><input type="checkbox" class="chosen_check"></th>
					<th>Id</th>
					<th>标题</th>
					<th>内容</th>
					<th>图片</th>
					<th>年份</th>
					<th>来源</th>
					<th>添加时间</th>
					<th>管理</th>
				</tr>
			</thead>
			<tbody>
			<% for (Outline o:outlines){%>
				<tr>
					<td>
							<input type="checkbox" class="chosen_check">
						</td>
					<td><%=o.getID()%></td>
					<td><%=o.getTitle()%></td>
					<td>
						<div>
							<%=o.getContent()%>
						</div>
					</td>
					<td><i class="fa fa-file-image-o file" aria-hidden="true"></i></td>
					<td><%=o.getYearTime()%></td>
					<td><%=o.getResource()%></td>
					<td><%=o.getAddTime()%></td>
						<td>
							<button class="change" data-popup-target="demoPopup" onclick="updateOutline()"><i class="fa fa-dedent"></i>&nbsp;&nbsp;修改</button>
							<button class="delete" data-popup-target="deletePopup" onclick="delOutline()"><i class="fa fa-close"></i>&nbsp;&nbsp;删除</button>
						</td>
					</tr>
			<%}%>
			</tbody>
		</table>
			<script>
				function searchOutlines(){
					let id='';
					let title='';
					let content='';
					let yearTime='';
					let resource='';
					let addTime='';
					let URL = "${pageContext.request.contextPath}/BackNETEM/SearchOutlines"
					$.ajax({
						type:"post",
						url:URL,
						data: {id: '', title: '', content: '', yearTime: '', resource: '', addTime: ''},
						success:function (data){
							alert('success'+data)
						},error:function (){
							alert('error')
						}
					})
				}
				function addOutline(){
					let title='';
					let content='';
					let yearTime='';
					let resource='';
					let image='';
					let URL = "${pageContext.request.contextPath}/BackNETEM/AddOutline"
					$.ajax({
						type:"post",
						url:URL,
						data: {title: 'ajax', content: 'ajax', image: 'ajax', yearTime: '2020', resource: 'ajax'},
						success:function (data){
							alert('success'+data)
						},error:function (){
							alert('error')
						}
					})
				}
				function updateOutline(){
					let id='';
					let title='';
					let content='';
					let yearTime='';
					let resource='';
					let addTime='';
					let image='';
					let URL = "${pageContext.request.contextPath}/BackNETEM/UpdateOutline"
					$.ajax({
						type:"post",
						url:URL,
						data:{id: 1, title: 'ajax', content: 'ajax', image: 'ajax', yearTime: '2020', resource: 'ajax'},
						success:function (data){
							alert('success'+data)
						},error:function (){
							alert('error')
						}
					})
				}
				function delOutline(){
					let id='';
					let title='';
					let content='';
					let yearTime='';
					let resource='';
					let addTime='';
					let URL = "${pageContext.request.contextPath}/BackNETEM/DelOutline"
					$.ajax({
						type:"post",
						url:URL,
						data:{},
						success:function (data){
							alert('success'+data)
						},error:function (){
							alert('error')
						}
					})
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
	
	<!-- 删除弹出层 -->
	<div class="popup" tabindex="-1" role="dialog" data-popup-id="deletePopup">
	    <div class="popup__container">
	        <div class="popup__close"><span></span><span></span></div>
	        <div class="popup__content">
	           <div class="change_area">
				   <div class="panel-body">
				   <div class="alert alert alert-danger" role="alert" style="font-size: 25px;">确认删除吗？</div>
				   	<button type="button" class="btn btn-primary blue_style" style="float: right;">
				   		 &nbsp;取消&nbsp;
				   	</button>
				   	<button type="button" class="btn btn-primary green_style" style="float: left;">
				   		 &nbsp;确认&nbsp;
				   	</button>
				   </div>
			   </div>
	        </div>
	    </div>
	</div>
	<!-- 修改弹出层 -->
	<div class="popup" tabindex="-1" role="dialog" data-popup-id="demoPopup">
	    <div class="popup__container">
	        <div class="popup__close"><span></span><span></span></div>
	        <div class="popup__content">
	           <div class="change_area">
				   <div class="panel-body">
					<label>
						标题:<input type="text" class="form-control"/>
					</label>
					<label style="margin-left: 20px;">
						图片<i class="fa fa-file-image-o file" aria-hidden="true"></i> 
					</label>
					<br/>
					<label>
						内容:<textarea type="text" class="form-control" style="width: 600px;height: 120px;resize:none;"></textarea>
					</label>
					<br/>
					<label>
						年份:<input type="text" class="form-control"/>
					</label>
					<label style="margin-left: 20px;">
						来源:<input type="text" class="form-control"/>
					</label>
					<br/>
					<br/>
					<button type="button" class="btn btn-primary green_style" style="float: right;">
						 &nbsp;确认&nbsp;
					</button>
					
				   </div>
	           </div>
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
			<li class="treeview" id="li_active">
				<a href="" class="point_a">
					<i class="fa fa-files-o"></i>
					<span>资源管理</span>
					<i class="fa fa-angle-left pull-right"></i>
				</a>
				<ul class="treeview-menu" id="open">
					<li><a href="TermController"><i class="fa fa-circle-o"></i> 考研术语</a></li>
					<li><a href="RankController"><i class="fa fa-circle-o"></i> 院校排名</a></li>
					<li><a href="ScoreController"><i class="fa fa-circle-o"></i> 历年分数</a></li>
					<li><a href="ReportController"><i class="fa fa-circle-o"></i> 学校录报</a></li>
					<li><a href="RealExamController"><i class="fa fa-circle-o"></i> 历年真题</a></li>
					<li><a href="OutlineController" class="green_font"><i class="fa fa-dot-circle-o"
																		  aria-hidden="true"></i> 考试大纲</a></li>
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
<script type="text/javascript" src="${pageContext.request.contextPath}/webback/js/vintage-popup.min.js"></script>
<script>
	$.sidebarMenu($('.sidebar-menu'));
	$('#li_active').addClass('li_active');
	if($("#li_active .point_a").css('background-color')=="rgb(0, 150, 136)"){
		$(this).removeClass('li_active');
	}
	$(function(){
			$('#li_active').mouseenter(function(){
				$(this).removeClass('li_active');
			});
			$('#li_active').mouseleave(function(){
				$(this).addClass('li_active');
						
			});
			
			$('.change').popup();
			$('.add').popup();
			$('.delete').popup();
	});
	
</script>