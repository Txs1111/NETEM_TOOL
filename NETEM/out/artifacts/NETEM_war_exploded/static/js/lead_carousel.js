// 轮播图
window.addEventListener('load', function() {
	    var focus = document.querySelector('.focus');
	    var ul = focus.children[0];
	    var ol = focus.children[1];
	    var w = focus.offsetWidth; 
	    var index = 0;
		var ol_index=0
	    var timer = setInterval(function() { 
	        index++;  
			ol_index++;
	        var translatex = -index * w; 
	        ul.style.transition = 'all .5s';   
	        ul.style.transform = 'translateX(' + translatex + 'px)';
			if(ol_index>=5){
				ol_index=0;
				ol.querySelector('.bg').classList.remove('bg');
					
				ol.children[ol_index].classList.add('bg');
				
			}else if(ol_index<0){
				ol_index=4;
				ol.querySelector('.bg').classList.remove('bg');
					
				ol.children[ol_index].classList.add('bg');
			}else{
				ol.querySelector('.bg').classList.remove('bg');
					
				ol.children[ol_index].classList.add('bg');
			}
			
			
			
	    }, 3000);

	    // 给ul绑定监听函数（每次轮播移动的都是整个ul）  过渡结束（transitionend）时执行
	    ul.addEventListener('transitionend', function() {
	        if(index >= 5) {   
	            index = 0;
	            ul.style.transition = '';
	            var translatex = -index * w;
	            ul.style.transform = 'translateX(' + translatex + 'px)';
	        } else if(index < 0) {   
	            index = 4;
	            ul.style.transition = '';
	            var translatex = -index * w;
	            ul.style.transform = 'translateX(' + translatex + 'px)';
	        }
	       
	    })
	    // 手指滑动轮播图
	    var startX = 0;
	    var moveX = 0;
	    var flag = false;
	    // 给ul绑定手指触摸事件
	    ul.addEventListener('touchstart', function(e) {
	        startX = e.targetTouches[0].pageX; 
	        clearInterval(timer);
	    })
	    // 给ul绑定手指移动事件
	    ul.addEventListener('touchmove', function(e) {
	        moveX = e.targetTouches[0].pageX - startX;
	        var translatex = -index * w + moveX;
	        ul.style.transition = 'none';
	        ul.style.transform = 'translateX(' + translatex + 'px)';
	        flag = true;
	        e.preventDefault();
	    })
	    // 给ul绑定手指离开事件
	    ul.addEventListener('touchend', function(e) {
	        if(flag) {
	            if(Math.abs(moveX) > 50) {
	                if(moveX > 0) {
	                    index--;
						ol_index--;
	                } else {  
	                    index++;
						ol_index++;
	                }
	                var translatex = -index * w;
	                ul.style.transition = 'all .5s';
	                ul.style.transform = 'translateX(' + translatex + 'px)';
	            } else {    // 小于50px就回弹
	                var translatex = -index * w;
	                ul.style.transition = 'all .1s';
	                ul.style.transform = 'translateX(' + translatex + 'px)';
	            }
				if(ol_index>=5){
					ol_index=0;
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
					
				}else if(ol_index<0){
					ol_index=4;
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
				}else{
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
				}
				
	        }
	        // 结束后 把flag重新改为false，并开启定时器让图片开始轮播
	        flag = false;
	        // 先清除再开启，保证只有一个定时器在运行（不然会有bug）
	        clearInterval(timer);
	        timer = setInterval(function() {
	            index++;
				ol_index++;
	            var translatex = -index * w;
	            ul.style.transition = 'all .4s';
	            ul.style.transform = 'translateX(' + translatex + 'px)';
				if(ol_index>=5){
					ol_index=0;
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
					
				}else if(ol_index<0){
					ol_index=4;
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
				}else{
					ol.querySelector('.bg').classList.remove('bg');
						
					ol.children[ol_index].classList.add('bg');
				}
				
	        }, 3000);
	     })
	}) 
