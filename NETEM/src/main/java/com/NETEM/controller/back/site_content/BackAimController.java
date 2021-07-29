package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.AimControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日17:34:02
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考研目的")
public class BackAimController {
    @Autowired
    AimControllerService aimControllerService;

    @GetMapping("/AimController")
    @ApiOperation("考研目的第一页")
    @AutoLog(value = "考研目的第一页", logType = 1, operateType = 1)
    public String aimController(Model model) {
        List<Lead_User> aims = aimControllerService.getAims(1);
        if (aims != null) {
            model.addAttribute("aims",aims);
        }
        return "../webback/site_content/aim_control";
    }
}
