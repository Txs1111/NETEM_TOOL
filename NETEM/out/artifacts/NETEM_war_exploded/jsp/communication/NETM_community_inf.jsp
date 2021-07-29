<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Default</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/communication.css" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
	<style>
	</style>
</head>
<body>
<div style="width: 100%;" id="main_block">
	<!-- 头部部分和返回键 -->
	<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
		<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
		<div class="head_line"><b>  论坛交流</b></div>
	</div>

	<!-- 帖子标题 -->
	<div class="inf_tittle"><b>
		${one.title}
	</b></div>
	<div class="inf_headblock">
		<div class="inf_head">
			<img src="${pageContext.request.contextPath}/static/img/head_img/shark.jpg" />
		</div>
		<div class="inf_niciname">
			${one.userId}
		</div>
	</div>
	<div class="inf_content">
		<div class="text_area">
			${one.content}
		</div>
		<div class="img_area">
			<img src="${one.image}" class="pimg"/>
			<img src="${one.image}" class="pimg"/>
			<img src="${one.image}" class="pimg"/>
		</div>
	</div>

	<div class="grey_line"></div>

	<div class="comment_block">
		<div class="comment_tittle">
			<div><b>回复与评论</b></div>
		</div>
		<!-- 评论 -->
  <c:forEach items="${responses}" var="response" varStatus="i">
	  <c:if test="${response.FId==0}">
		  <div class="one_comment">
			  <div class="head_niciname">
				  <div class="head">
					  <img src="${pageContext.request.contextPath}/static/img/head_img/shark2.jpg" />
				  </div>
				  <div class="niciname comment_niciname">
						  ${response.userId}
				  </div>
			  </div>
			  <div class="comment_content">
				  <div>
						  ${response.content}
				  </div>
			  </div>
			  <div class="comment_time">
				  <div class="responce_time">${response.addTime}</div>
				  <div class="responce" ><input type="hidden" id="postid" value="${response.ID}">回复</div>

				  <c:forEach items="${responses}" var="reresponse" varStatus="i">
					  <c:if test="${reresponse.FId==response.ID}">
						  <div class="responce_responce">
							  <div class="head_niciname">
								  <div class="head">
									  <img src="${pageContext.request.contextPath}/static/img/head_img/shark2.jpg" />
								  </div>
								  <div class="niciname comment_niciname">
									  ${reresponse.userId}
								  </div>
							  </div>
							  <div class="comment_content">
								  <div>
									 ${reresponse.content}
								  </div>
							  </div>
							  <div class="rr_comment_time">
								  <div class="rr_responce_time"${reresponse.addTime}&nbsp;&nbsp;&nbsp;></div>
							  </div>

							  <div class="grey_smallline"></div>
							  <!-- 评论的评论 -->
						  </div>
					  </c:if>
					  <!-- 评论的评论 -->
				  </c:forEach>
			  </div>
		  </div>
	  </c:if>
  </c:forEach>
		

	</div>
</div>


<!-- 发表评论 -->
<form action="${pageContext.request.contextPath}/Response/addresponse" method="post">
	<input type="hidden" name="postID" value="${responses.get(1).postId}">
<div class="aim_post">
	<div class="go_out"><img src="${pageContext.request.contextPath}/static/img/icon_img/close.png" alt="" width="16px" height="16px"></div>
	<div class="message"><textarea name="content" type="text" placeholder="请输入你的看法~">

	</textarea></div>
	<div class="expression_post">
		<div class="expression"><img src="${pageContext.request.contextPath}/static/img/lead_img/expression.png" alt=""></div>

		<div class="post">
				<input id="POST" type="hidden" name="responseID" value="">
				<input type="submit">
		</div>
</div>

</div>
</form>

<div class="nav-bottom">
	<div class="inf_local-nav">
		<div class="response_long" id="response"><input type="hidden" class="postid" value="0"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;回复帖子</div>
		<div class="response_msg">
			<div class="response_dioc">
				<img src="${pageContext.request.contextPath}/static/img/icon_img/comment.png" width="16px" height="16px"/>&nbsp;17
			</div>
			<div class="like_block">
				<img src="${pageContext.request.contextPath}/static/img/icon_img/like.png" width="20px" height="20px"  id="like_pic"/>&nbsp;
				<div class="num_like">20</div>
			</div>
		</div>
	</div>
</div>
<!-- 点击图片层 -->
<div id="outerdiv_1" style="position:fixed;top:0;left:0;background:rgba(0,0,0,0.7);z-index:2;width:100%;height:100%;display:none;">
	<div id="innerdiv_1" style="position:absolute;">
		<img id="bigimg_1" style="border:1px solid #fff;" src="" />
	</div>
</div>
</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/click_show.js"></script>
<script>
	$(function(){
		var wid = $('#main_block').width();
		wid = wid*0.8;
		$('.nav-bottom').width(wid);
		var iflike = '0';
		var consequ = true;
		$('#response').click(function(){
			var xx=$(this).find(".postid").val();
			$('.post').find('#POST').attr("value",xx);
			$('.aim_post').show();
		});
		$('.responce').click(function(){
			var xxx=$(this).find(".postid").val();
			$('.post').find('#POST').attr("value",xxx);
			$('.aim_post').show();
		});

		$("#getpostid").click( function(){
			$("#postid").attr("value",${response.userId});
		} );

		$('.like_block').click(function(){
			if(consequ){
				$('#like_pic').attr('src', 'img/icon_img/like_active.png');
				$('.like_block').css('color','#EB5255');
				var tex = $('.num_like').text().trim();
				tex = Number(tex);
				tex = tex+1;
				$('.num_like').text(tex);
				consequ = false;
			} else{
				$('#like_pic').attr('src', 'img/icon_img/like.png');
				$('.like_block').css('color','#BBBBBB');
				var tex = $('.num_like').text().trim();
				tex = Number(tex);
				tex = tex-1;
				$('.num_like').text(tex);
				consequ = true;
			}
		});
		$('.go_out').click(function(){
			$('.aim_post').hide();
		});
	});
</script>