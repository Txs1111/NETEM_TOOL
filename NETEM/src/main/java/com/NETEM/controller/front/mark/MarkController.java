package com.NETEM.controller.front.mark;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.mark.Mark;
import com.NETEM.service.front.MarkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2021年7月14日14:33:55
 *
 * @author Lyon
 */

@Controller
@RequestMapping("/NETEM")
@Api(tags = "估分预测")
public class MarkController {

    @Autowired
    public MarkService markService;

    static Set<Mark> name = new HashSet<Mark>();

    /**
     * 获取所有的大学和专业
     *
     * @param model
     * @return
     */
    @GetMapping("/mark")
    @ApiOperation("获取所有的大学和专业")
    @AutoLog(value = "获取所有的大学和专业", logType = 1, operateType = 1)
    public String mark(Model model) {
        List<String> allMajor = markService.getAllMajor();
        model.addAttribute("allMajor", allMajor);
        List<String> allCollege = markService.getAllCollege();
        model.addAttribute("allCollege", allCollege);
        name.clear();
        return "mark/NETM_mark";
    }

    /**
     * 由专业获取课程
     *
     * @param major
     * @param model
     * @return
     */
    @PostMapping("/mark/{major}")
    @ResponseBody
    @ApiOperation("由专业获取课程")
    @AutoLog(value = "由专业获取课程", logType = 1, operateType = 1)
    public List<String> mark1(@PathVariable String major, Model model) {
        List<String> allClass = markService.getAllClass(major);
        return allClass;
    }

    /**
     * ajax获取复合条件的大学
     *
     * @param marks
     * @return
     */
    @PostMapping("/forecast_result")
    @ResponseBody
    @ApiOperation("ajax获取复合条件的大学")
    @AutoLog(value = "ajax获取复合条件的大学", logType = 1, operateType = 1)
    public Set<Mark> forecast_result(@RequestBody List<Mark> marks) {
        for (Mark m : marks) {
            name.add(m);
        }
        return name;
    }

    /**
     * 获取大学信息
     *
     * @param major
     * @param colleges
     * @param model
     * @return
     */
    @GetMapping("/forecast_result/{major}/{colleges}")
    @ApiOperation("获取大学信息")
    @AutoLog(value = "获取大学信息", logType = 1, operateType = 1)
    public String forecast_result(@PathVariable String major, @PathVariable List<String> colleges, Model model) {
        System.out.println("colleges.toArray():" + colleges);
        ArrayList<String> lists = new ArrayList<String>();
        for (String c : colleges) {
            lists.add(c);
        }
        List<List<Mark>> marks = new ArrayList<List<Mark>>();
        for (String c : lists) {
            marks.add(markService.getColleges(major, c));
        }
        model.addAttribute("marks", marks);
        return "mark/NETM_forecast_result";
    }

    /**
     * 由课程查询符合条件的大学
     *
     * @param major
     * @param majorSubject
     * @param markLine
     * @param model
     * @return
     */
    @PostMapping("/getCollege/{major}/{majorSubject}/{markLine}")
    @ResponseBody
    @ApiOperation("由课程查询符合条件的大学")
    @AutoLog(value = "由课程查询符合条件的大学", logType = 1, operateType = 1)
    public List<String> getCollege(@PathVariable String major, @PathVariable String majorSubject, @PathVariable int markLine, Model model) {
        List<String> college = markService.getCollege(major, majorSubject, markLine);
        return college;
    }
}
















