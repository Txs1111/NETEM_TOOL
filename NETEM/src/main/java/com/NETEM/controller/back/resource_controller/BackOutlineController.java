package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Outline;
import com.NETEM.service.back.resource_controller.OutlineControllerService;
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
 * 2021年7月27日17:00:59
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考试大纲")
public class BackOutlineController {
    @Autowired
    private OutlineControllerService outlineControllerService;

    @GetMapping("/OutlineController")
    @ApiOperation("考试大纲第一页")
    @AutoLog(value = "考试大纲第一页", logType = 1, operateType = 1)
    public String outlineController(Model model) {
        List<Outline> outlines = outlineControllerService.getOutlines(1);
        if (outlines != null) {
            model.addAttribute("outlines", outlines);
        }
        return "../webback/resource_controller/outline_control";
    }

    @PostMapping("/SearchOutlines")
    @ResponseBody
    @ApiOperation("查找符合条件的考试大纲")
    @AutoLog(value = "查找符合条件的考试大纲", logType = 1, operateType = 1)
    public List<Outline> SearchOutlines(String id, String title, String content, String yearTime, String addTime, String resource) {
        List<Outline> outlines = outlineControllerService.searchOutlines(id, title, content, yearTime, resource, addTime);
        return outlines;
    }

    @PostMapping("/AddOutline")
    @ResponseBody
    @ApiOperation("管理员添加考试大纲")
    @AutoLog(value = "管理员添加考试大纲", logType = 1, operateType = 1)
    public int AddOutline(String title, String content, String yearTime, String resource, String image) {
        int i = outlineControllerService.addOutline(title, content, yearTime,getString(), resource, image);
        return i;
    }

    @PostMapping("/UpdateOutline")
    @ResponseBody
    @ApiOperation("管理员修改考试大纲")
    @AutoLog(value = "管理员修改考试大纲", logType = 1, operateType = 1)
    public int UpdateOutline(int id, String title, String content, String yearTime, String resource, String image) {
        int i = outlineControllerService.updateOutline(id, title, content, yearTime, resource, image);
        return i;
    }
}
