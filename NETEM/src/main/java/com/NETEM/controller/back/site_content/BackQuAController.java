package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.QuAControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月27日19:13:36
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—社区问答")
public class BackQuAController {
    @Autowired
    QuAControllerService quAControllerService;

    @GetMapping("/QAController")
    @ApiOperation("社区问答第一页")
    @AutoLog(value = "社区问答第一页", logType = 1, operateType = 1)
    public String QAController(Model model) {
        List<Community> qAs = quAControllerService.getQAs(1);
        if (qAs != null) {
            model.addAttribute("qAs",qAs);
        }
        return "../webback/site_content/QA_control";
    }
}
