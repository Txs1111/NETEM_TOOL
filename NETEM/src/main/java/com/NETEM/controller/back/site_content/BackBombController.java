package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.BombControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日17:58:54
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考研雷区")
public class BackBombController {
    @Autowired
    BombControllerService bombControllerService;

    @GetMapping("/BombController")
    @ApiOperation("考研雷区第一页")
    @AutoLog(value = "考研雷区第一页", logType = 1, operateType = 1)
    public String bombController(Model model) {
        List<Lead_User> bombs = bombControllerService.getBombs(1);
        if (bombs != null) {
            model.addAttribute("bombs",bombs);
        }
        return "../webback/site_content/bomb_control";
    }

}
