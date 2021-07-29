package com.NETEM.controller.back.site_content;

import com.NETEM.common.AutoLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2021年7月27日20:20:37
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—回复管理")
public class BackResponseController {

    @GetMapping("/ResponseController")
    @ApiOperation("回复管理第一页")
    @AutoLog(value = "回复管理第一页", logType = 1, operateType = 1)
    public String responseController() {
        return "../webback/response_control";
    }
}
