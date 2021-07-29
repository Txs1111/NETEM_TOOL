package com.NETEM.controller.front.community;


import com.NETEM.pojo.community.Community;
import com.NETEM.pojo.community.Response;
import com.NETEM.service.front.CommunityService;
import com.NETEM.service.front.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/Communication")
public class CommunityController {

    @Qualifier("communityServiceImpl")
    @Autowired
    private CommunityService communityService;

    @Autowired
    private ResponseService responseService;


    @RequestMapping("/getCommunication")
    public ModelAndView findCommunication(ModelAndView modelAndView){
        List<Community> findCommunication = communityService.findCommunication();
        modelAndView.addObject("findCommunication",findCommunication);
        modelAndView.setViewName("communication/NETM_communication");
        return modelAndView;  //在视图解析器中配置了前缀后缀
    }

    @RequestMapping("/getpost")
    public ModelAndView findone(int ID,ModelAndView modelAndView){
        Community one = communityService.findone(ID);
        List<Response> responses=responseService.findResponse(ID);
        modelAndView.addObject("one",one);
        modelAndView.addObject("responses",responses);

        modelAndView.setViewName("communication/NETM_community_inf");
        return modelAndView;
    }

    @RequestMapping("skipSetpost")
        public String skipSetpost(){ return"NETM_searchPage"; }

    @RequestMapping("getCommunityresource")
    public ModelAndView getCommunityresource(ModelAndView modelAndView){
        List<Community> getCommunityresource = communityService.findCommunityresource();
        modelAndView.addObject("getCommunityresource",getCommunityresource);
        modelAndView.setViewName("communication/NETM_community_resource");
        return modelAndView;
    }

    @RequestMapping("getCommunityQA")
    public ModelAndView getCommunityQA(ModelAndView modelAndView){
        List<Community> getCommunityQA = communityService.findCommunityQA();
        modelAndView.addObject("getCommunityresource",getCommunityQA);
        modelAndView.setViewName("communication/NETM_community_QA");
        return modelAndView;
    }

    @RequestMapping("/insertpost")
    public ModelAndView insertpost(ModelAndView modelAndView){
        return modelAndView;
    }
}

