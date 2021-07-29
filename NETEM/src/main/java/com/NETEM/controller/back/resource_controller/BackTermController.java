package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Term;
import com.NETEM.service.back.resource_controller.TermControllerService;
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
 * 2021年7月27日15:45:12
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考研术语")
public class BackTermController {
    @Autowired
    private TermControllerService termControllerService;

    @GetMapping("/TermController")
    @ApiOperation("考研术语第一页")
    @AutoLog(value = "考研术语第一页", logType = 1, operateType = 1)
    public String termController(Model model) {
        List<Term> terms = termControllerService.getTerms(1);
        if (terms != null) {
            model.addAttribute("terms", terms);
        }
        return "../webback/resource_controller/term_control";
    }

    @PostMapping("/SearchTerms")
    @ResponseBody
    @ApiOperation("查找符合条件的考研目的")
    @AutoLog(value = "查找符合条件的考研目的", logType = 1, operateType = 1)
    public List<Term> SearchTerms(String id, String termName, String time) {
        List<Term> terms = termControllerService.searchTerm(id, termName, time);
        return terms;
    }

    @PostMapping("/AddTerm")
    @ResponseBody
    @ApiOperation("管理员添加术语")
    @AutoLog(value = "管理员添加术语", logType = 1, operateType = 1)
    public int AddTerm(String termTitle, String termContent) {
        int i = termControllerService.addTerm(termTitle, termContent, getString());
        return i;
    }

    @PostMapping("/UpdateTerm")
    @ResponseBody
    @ApiOperation("管理员修改术语")
    @AutoLog(value = "管理员修改术语", logType = 1, operateType = 1)
    public int UpdateTerm(int id, String termTitle, String termContent) {
        int i = termControllerService.updateTerm(id, termTitle, termContent);
        return i;
    }
}
