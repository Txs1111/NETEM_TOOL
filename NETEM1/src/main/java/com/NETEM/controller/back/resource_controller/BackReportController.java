package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.ReportControllerService;
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

import static com.NETEM.Tool.Time.getString;

/**
 * 2021年7月27日16:33:51
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—报录情况")
public class BackReportController {
    @Autowired
    private ReportControllerService reportControllerService;

    @GetMapping("/ReportController")
    @ApiOperation("报录情况第一页")
    @AutoLog(value = "报录情况第一页", logType = 1, operateType = 1)
    public String reportController(Model model) {
        List<Information> reports = reportControllerService.getReports(1);
        if (reports!=null){
            model.addAttribute("reports",reports);
        }
        return "../webback/resource_controller/report_control";
    }
    @PostMapping("/SearchReports")
    @ResponseBody
    @ApiOperation("查找符合条件的报录情况")
    @AutoLog(value = "查找符合条件的报录情况", logType = 1, operateType = 1)
    public List<Information> SearchReports(String id, String title, String content, String time) {
        List<Information> score = reportControllerService.searchReport(id, title, content, time);
        return score;
    }

    @PostMapping("/AddReport")
    @ResponseBody
    @ApiOperation("管理员添加报录情况")
    @AutoLog(value = "管理员添加报录情况", logType = 1, operateType = 1)
    public int AddReports(String title, String content, String time, String image) {
        int i = reportControllerService.addReport(title,content,getString(),image);
        return i;
    }

    @PostMapping("/UpdateReport")
    @ResponseBody
    @ApiOperation("管理员修改报录情况")
    @AutoLog(value = "管理员修改报录情况", logType = 1, operateType = 1)
    public int UpdateRank(int id, String title, String content, String image) {
        int i = reportControllerService.updateReport(id, title, content, image);
        return i;
    }
}
