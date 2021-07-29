package com.NETEM.controller.front.community;

import com.NETEM.service.front.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Response")
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @RequestMapping("/addresponse")
    public String addResponse(int postID,int responseID,String content){
        String userId="0000";
        responseService.addResponse(postID,responseID,userId,content);
        return "redirect:/Communication/getpost?ID="+postID;
    }

}
