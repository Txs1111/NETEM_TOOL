package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.ExpControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日18:03:48
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考研经验")
public class BackExpController {
    @Autowired
    ExpControllerService expControllerService;

    @GetMapping("/ExpController")
    @ApiOperation("考研经验第一页")
    @AutoLog(value = "考研经验第一页", logType = 1, operateType = 1)
    public String expController(Model model) {
        List<Lead_User> exps = expControllerService.getExps(1);
        if (exps != null) {
            model.addAttribute("exps", exps);
        }
        return "../webback/site_content/exp_control";
    }
}
