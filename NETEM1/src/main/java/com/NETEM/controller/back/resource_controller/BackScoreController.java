package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.ScoreControllerService;
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
 * 2021年7月27日16:21:43
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—历年分数")
public class BackScoreController {
    @Autowired
    private ScoreControllerService scoreControllerService;

    @GetMapping("/ScoreController")
    @ApiOperation("历年分数第一页")
    @AutoLog(value = "历年分数第一页", logType = 1, operateType = 1)
    public String scoreController(Model model) {
        List<Information> scores = scoreControllerService.getScores(1);
        if (scores != null) {
            model.addAttribute("scores", scores);
        }
        return "../webback/resource_controller/score_control";
    }

    @PostMapping("/SearchScores")
    @ResponseBody
    @ApiOperation("查找符合条件的历年分数")
    @AutoLog(value = "查找符合条件的历年分数", logType = 1, operateType = 1)
    public List<Information> SearchScores(String id, String title, String content, String time) {
        List<Information> score = scoreControllerService.searchScore(id, title, content, time);
        return score;
    }

    @PostMapping("/AddScore")
    @ResponseBody
    @ApiOperation("管理员添加历年分数")
    @AutoLog(value = "管理员添加历年分数", logType = 1, operateType = 1)
    public int AddScores(String title, String content, String image) {
        int i = scoreControllerService.addScore(title, content, getString(), image);
        return i;
    }

    @PostMapping("/UpdateScore")
    @ResponseBody
    @ApiOperation("管理员修改历年分数")
    @AutoLog(value = "管理员修改历年分数", logType = 1, operateType = 1)
    public int UpdateRank(int id, String title, String content, String image) {
        int i = scoreControllerService.updateScore(id, title, content, image);
        return i;
    }
}
