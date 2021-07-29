package com.NETEM.controller.back;

import com.NETEM.common.AutoLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2021年7月16日10:33:26
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—使用情况")
public class BackUserCase {

    @GetMapping("/UserCase")
    @ApiOperation("使用情况第一页")
    @AutoLog(value = "使用情况第一页", logType = 1, operateType = 1)
    public String usercase() {
        return "../webback/user_case";
    }




}
