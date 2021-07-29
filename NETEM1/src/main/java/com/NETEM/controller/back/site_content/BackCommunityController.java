package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.CommunityControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日18:55:03
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—社区交流")
public class BackCommunityController {
    @Autowired
    CommunityControllerService communityControllerService;

    @GetMapping("/CommunityController")
    @ApiOperation("社区交流第一页")
    @AutoLog(value = "社区交流第一页", logType = 1, operateType = 1)
    public String communityController(Model model) {
        List<Community> communitys = communityControllerService.getCommunitys(1);
        if (communitys != null) {
            model.addAttribute("communitys",communitys);
        }
        return "../webback/site_content/community_control";
    }
}
