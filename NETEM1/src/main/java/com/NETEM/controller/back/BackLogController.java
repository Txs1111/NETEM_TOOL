package com.NETEM.controller.back;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.Log;
import com.NETEM.service.back.LogControllerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 2021年7月27日17:17:23
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—网站日志")
public class BackLogController {
    @Autowired
    private LogControllerService logControllerService;

    @GetMapping("/LogController")
    @ApiOperation("网站日志第一页")
    @AutoLog(value = "网站日志第一页", logType = 1, operateType = 1)
    public String logController(Model model) {
        List<Log> logs = logControllerService.getLogs(1);
        if (logs != null) {
            model.addAttribute("logs", logs);
        }
        return "../webback/log_control";
    }
    @PostMapping("/SearchLogs")
    @ResponseBody
    @ApiOperation("查找符合条件的网站日志")
    @AutoLog(value = "查找符合条件的网站日志", logType = 1, operateType = 1)
    public List<Log> SearchLogs(String id, String userName, String studentCode1, String where, String describe, String addTime, String consumeTime) {
        List<Log> logs = logControllerService.searchLogs(id, userName, studentCode1, where, describe, addTime, consumeTime);
        System.out.println(id+","+ userName+","+ studentCode1+","+ where+","+ describe+","+ addTime+","+ consumeTime);
        return logs;
    }
}
