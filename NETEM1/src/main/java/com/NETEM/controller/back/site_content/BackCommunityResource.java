package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.CommunityResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日19:22:59
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—社区资源")
public class BackCommunityResource {
    @Autowired
    CommunityResourceService communityResourceService;

    @GetMapping("/CommunityResource")
    @ApiOperation("社区资源第一页")
    @AutoLog(value = "社区资源第一页", logType = 1, operateType = 1)
    public String communityresource(Model model) {
        List<Community> resources = communityResourceService.getResources(1);
        if (resources != null) {
            model.addAttribute("resources", resources);
        }
        return "../webback/site_content/community_resource";
    }
}
