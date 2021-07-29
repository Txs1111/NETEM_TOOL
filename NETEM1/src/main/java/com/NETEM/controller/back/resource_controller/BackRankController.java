package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.RankControllerService;
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
 * 2021年7月27日16:12:47
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—院校排名")
public class BackRankController {
    @Autowired
    private RankControllerService rankControllerService;

    @GetMapping("/RankController")
    @ApiOperation("院校排名第一页")
    @AutoLog(value = "院校排名第一页", logType = 1, operateType = 1)
    public String rankController(Model model) {
        List<Information> ranks = rankControllerService.getRanks(1);
        if (ranks!=null){
            model.addAttribute("ranks",ranks);
        }
        return "../webback/resource_controller/rank_control";
    }
    @PostMapping("/SearchRanks")
    @ResponseBody
    @ApiOperation("查找符合条件的院校排名")
    @AutoLog(value = "查找符合条件的院校排名", logType = 1, operateType = 1)
    public List<Information> SearchRanks(String id,String title,String content,String time) {
        List<Information> ranks = rankControllerService.searchRanks(id, title, content, time);
        return ranks;
    }
    @PostMapping("/AddRank")
    @ResponseBody
    @ApiOperation("管理员添加院校排名")
    @AutoLog(value = "管理员添加院校排名", logType = 1, operateType = 1)
    public int AddRank(String title,String content,String time,String image) {
        int i = rankControllerService.addRank(title, content, getString(), image);
        return i;
    }
    @PostMapping("/UpdateRank")
    @ResponseBody
    @ApiOperation("管理员修改院校排名")
    @AutoLog(value = "管理员修改院校排名", logType = 1, operateType = 1)
    public int UpdateRank(int id,String title,String content,String image) {
        int i = rankControllerService.updateRank(id, title, content, image);
        return i;
    }
}
