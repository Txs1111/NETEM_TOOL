package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.service.back.resource_controller.RealExamControllerService;
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
 * 2021年7月27日16:50:53
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—历年真题")
public class BackRealExamController {
    @Autowired
    private RealExamControllerService realExamControllerService;

    @GetMapping("/RealExamController")
    @ApiOperation("历年真题第一页")
    @AutoLog(value = "历年真题第一页", logType = 1, operateType = 1)
    public String realexamController(Model model) {
        List<RealExam> realExams = realExamControllerService.getRealExams(1);
        if (realExams != null) {
            model.addAttribute("realExams", realExams);
        }
        return "../webback/resource_controller/real_exam_control";
    }

    @PostMapping("/SearchRealExams")
    @ResponseBody
    @ApiOperation("查找符合条件的历年真题")
    @AutoLog(value = "查找符合条件的历年真题", logType = 1, operateType = 1)
    public List<RealExam> SearchRealExams(String id, String title, String year, String time) {
        List<RealExam> realExams = realExamControllerService.searchRealExams(id, title, year, time);
        return realExams;
    }

    @PostMapping("/AddRealExam")
    @ResponseBody
    @ApiOperation("管理员添加历年真题")
    @AutoLog(value = "管理员添加历年真题", logType = 1, operateType = 1)
    public int AddRealExam(String title, String year, String dataUrl) {
        int i = realExamControllerService.addRealExam(title, year, getString(), dataUrl);
        return i;
    }

    @PostMapping("/UpdateRealExam")
    @ResponseBody
    @ApiOperation("管理员修改历年真题")
    @AutoLog(value = "管理员修改历年真题", logType = 1, operateType = 1)
    public int UpdateRealExam(int id, String title, String year, String dataUrl) {
        int i = realExamControllerService.updateRealExam(id, title, year, dataUrl);
        return i;
    }

}
