<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width,initial-scale=1.0">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>Default</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/normalize.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/public_style.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/search.css" />
		<style>
			input{
				border-radius: 4px!important;
			}
			button{
				border-radius: 4px!important;
			}
		</style>
	</head>
	<body>
		<div style="width: 100%;height: 700px;" id="main_block">
			<div style="width: 100%;height: 50px;background-color: #570D8A;" class="top_block">
				<a onClick="javascript :history.back(-1);"><font color="white" size="6"> <  </font></a>
				<div class="head_line"><b>  搜索帖子</b></div>
			</div>
			
			<form action="TR_searchResult.html" method="get" id="form_1">
				<div class="first_search">
					<div class="st_search">
						<input placeholder="输入关键字"  id="keyword"/>
					</div>
						<div class="st_submit">
							<button id="imgSearch" class="submit_btn" type="button" onclick="window.location.href = '${pageContext.request.contextPath}/NETEM/SearchedTerm/<%="在"%>'">搜索</button>
						</div>
				</div>
			</form>
			
			
			<div class="second_block">
				
				<div class="nd_line">
					<b>历史搜索</b>
					<input type="button" value="清除记录" id="spanDelete" class="clear" />
				</div>
				<ul class="chose_line history_search">
				</ul>
			</div>
			
			
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>
<script>
	var referrerPath = "ReferrerPath";
		var localStorageKey = "search_term_history";//唯一标识符
		
		$(document).ready(function() {
		    //搜索时记录搜索关键字
		    $("#imgSearch").click(function() {
		        var keyword = $("#keyword").val();
		        setSearchHistory(keyword);
		    });
		
		    //显示搜索记录
		    showSearchHistory();
		
		    //删除搜索记录
		    $("#spanDelete").click(function() {
		        var r = confirm("确定删除搜索记录？");
		        if (r == true) {
		            localStorage.removeItem(localStorageKey);
		            $(".history_search").html("");
		        } else {
		            console.log("您按了取消！")
		        }
		
		    });
		
		    function setSearchHistory(keyword) {
		        var items = getSearchHistory();
		        // if (items.length >= 2) {
		        //     localStorage.removeItem(items.indexOf(1));
		        //     return;
		        // }
		
		        var item = {
		            referrerPath,
		            keyword
		        };
		
		        for (var i = 0; i < items.length; i++) {
		            if (items[i].referrerPath === item.referrerPath && items[i].keyword === item.keyword) {
		                return;
		            }
		        }
		
		        items.push(item);
		        var strItems = JSON.stringify(items);
		        localStorage.setItem(localStorageKey, strItems);
		    }
		
		    function getSearchHistory() {
		        var strItems = localStorage.getItem(localStorageKey);
		        var items = JSON.parse(strItems);
		        if (items === null) {
		            items = [];
		        }
		        return items;
		    }
		
		    function showSearchHistory() {
		        var arrProductSearchHistroy = new Array();
		        $.each(getSearchHistory(), function(i, o) {
		            var url = o.referrerPath + "?keyword=" + o.keyword;
					// console.log(o.keyword.sort());
		            var item = "<li class=\"li_item small_option\">" + o.keyword + "</li>";
		            arrProductSearchHistroy.push(item);
		        });
				arrProductSearchHistroy.reverse();
		        $(".history_search").html(arrProductSearchHistroy.join(""));
		    }
		});
		
	
	$(function(){ 
		$('.small_option').each(function(){
			$(this).width($(this).width() + 12);
		});
		$('.small_option').click(function(){
			if($(this).css('background-color')=="rgb(21, 160, 198)"){
				$(this).css("background-color","#f5f5f5");
				$(this).css("color","gray");
				$(this).siblings('.small_option').css("background-color","#f5f5f5");
				$(this).siblings('.small_option').css("color","gray");
			}else{ 
				$(this).css("background-color","#15a0c6");
				$(this).css("color","white");
				$(this).siblings('.small_option').css("background-color","#f5f5f5");
				$(this).siblings('.small_option').css("color","gray");
			}
		});
		$('.submit_btn').click(function(){
			if($("#keyword").val()==""||$("#keyword").val()==null){
				alert("不可以搜索空值哦");
			}else{
				$('#form_1').submit();
			}
		});
		$('.li_item').click(function(){
			$("#keyword").val($(this).text());
		});
	});
</script>
