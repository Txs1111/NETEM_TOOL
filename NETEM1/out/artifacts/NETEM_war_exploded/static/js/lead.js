$(document).ready(function(){
	$(".leafing_button").click(function(){
		
		$("body").css({"background-color":"#CDCDCD"});
		$(".aim_post").slideDown();
		// $(".cover_aim_block").show();
		
		
	});
	
	$(".go_out img").click(function(){
		$("body").css("background-color","#FFFFFF");
		$(".aim_post").slideUp();
	})
	var c=0;
	$(".likes").click(function(){
		if(c%2===0){	
			$(this).children('img').attr("src","img/lead_img/like_clicked.png");
		}else{	
			$(this).children('img').attr("src","img/lead_img/like_orig.png");
		}
		c++;
	});

	var count=0;
	$(".icon_likes img").click(function(){
		// var count=2;
		if(count%2===0){
			$(this).css("width","130%");
		}else{
			$(this).css("width","100%");
		}
		count++;
		
	});
	$(".font_box, .msg, .aim_content, .include").click(function(){
		var txt=$(this).text();
		$(".content_box").text(txt);
	});
	
});



