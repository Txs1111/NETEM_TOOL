package com.NETEM.controller.front.lead;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Term;
import com.NETEM.service.front.TermService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 2021年7月12日09:20:10
 *
 * @author Lyon
 */

@Controller
@RequestMapping("/NETEM")
@Api(tags = "术语")
public class TermController {
    @Autowired
    private TermService termService;


    /**
     * 获取所有术语
     *
     * @param model
     * @return
     */
    @GetMapping("/term")
    @ApiOperation("获取所有术语")
    @AutoLog(value = "获取所有术语", logType = 1, operateType = 1)
    public String allTerm(Model model) {
        List<Term> allTerms = termService.getAllTerm();
        model.addAttribute("allTerms", allTerms);
        return "lead/NETM_lead_term";
    }


    /**
     * 根据id，获取一个术语
     *
     * @param id
     * @param model
     * @return
     */
    @PostMapping("/oneterm/{id}")
    @ApiOperation("根据id，获取一个术语")
    @AutoLog(value = "根据id，获取一个术语", logType = 1, operateType = 1)
    public String aTerm(@PathVariable int id, Model model) {
        Term oneTerm = termService.getOneTerm(id);
        model.addAttribute("oneTerm", oneTerm);
        return "lead/NETM_lead_term";
    }

    /**
     * 进入搜索术语页面
     *
     * @return
     */
    @GetMapping("/toSearchPage")
    @ApiOperation("进入搜索术语页面")
    @AutoLog(value = "进入搜索术语页面", logType = 1, operateType = 1)
    public String toSearchPage() {
        return "lead/NETM_lead_searchPage";
    }

    /**
     * 搜索术语结果
     *
     * @param content
     * @return
     */
    @GetMapping("/SearchedTerm/{content}")
    @ApiOperation("进入搜索术语页面")
    @AutoLog(value = "进入搜索术语页面", logType = 1, operateType = 1)
    public String SearchedTerm(@PathVariable String content,Model model) {
        List<Term> terms = termService.searchTerms(content);
        model.addAttribute("terms", terms);
        return "lead/NETM_lead_SearchedTermPage";
    }

}
