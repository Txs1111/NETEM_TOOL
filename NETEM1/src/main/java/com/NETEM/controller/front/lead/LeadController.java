package com.NETEM.controller.front.lead;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.pojo.lead.Term;
import com.NETEM.service.front.LeadService;
import com.NETEM.service.front.TermService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.NETEM.Tool.Time.getString;


/**
 * 2021年7月12日08:58:24
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/NETEM")
@Api(tags = "引导")
public class LeadController {
    @Autowired
    private TermService termService;
    @Autowired
    private LeadService leadService;

    /**
     * 进入添加资源页面
     *
     * @return
     */
    @GetMapping("/addLead")
    @ApiOperation("进入添加资源页面")
    @AutoLog(value = "进入添加资源页面", logType = 1, operateType = 1)
    public String toAddLead() {
        return "lead/NETM_lead_sent_post";
    }

    /**
     * 添加资源页面,添加成功
     *
     * @return
     */
    @PostMapping("/AddLeadSuccess")
    @ResponseBody
    @ApiOperation("添加资源页面,添加成功")
    @AutoLog(value = "添加资源页面,添加成功", logType = 1, operateType = 1)
    public int AddLeadSuccess(String userId, int type, String content) {
        return leadService.addLead(type, userId, content, getString());
    }

    /**
     * 添加资源，需要在前端form中输入类型type
     *
     * @param type
     * @param userId
     * @param content
     * @param model
     * @return
     */
    @PostMapping("/addLead/{type}/{userId}/{content}")
    @ApiOperation("添加资源，需要在前端form中输入类型type")
    @AutoLog(value = "添加资源", logType = 1, operateType = 1)
    public String addLead(@PathVariable int type, @PathVariable String userId, @PathVariable String content, Model model) {
        if (type > 0 && userId != null && content != null) {
            leadService.addLead(type, userId, content, getString());
        }
        return "redirect:/NETEM/lead";
    }

    /**
     * 主页面，获得9个术语
     *
     * @param model
     * @return
     */
    @GetMapping("/lead")
    @ApiOperation("主页面，获得9个术语")
    @AutoLog(value = "主页面，获得9个术语", logType = 1, operateType = 1)
    public String get9Term(Model model) {
        List<Term> terms = termService.get9Term();
        model.addAttribute("terms", terms);
        List<Lead_User> aim = leadService.getAim();
        List<Lead_User> bomb = leadService.getBomb();
        List<Lead_User> exp = leadService.getEXP();
        model.addAttribute("aim", aim);
        model.addAttribute("bomb", bomb);
        model.addAttribute("exp", exp);
        return "lead/NETM_lead";
    }

    /**
     * 获取所有的考研目的
     *
     * @return
     */
    @GetMapping("/aim")
    @ApiOperation("获取所有的考研目的")
    @AutoLog(value = "获取所有的考研目的", logType = 1, operateType = 1)
    public String aim(Model model) {
        List<Lead_User> aim = leadService.getAllAim();
        model.addAttribute("aim", aim);
        return "lead/NETM_lead_aim";
    }

    /**
     * 获取所有的考研雷区
     *
     * @return
     */
    @GetMapping("/bomb")
    @ApiOperation("获取所有的考研雷区")
    @AutoLog(value = "获取所有的考研雷区", logType = 1, operateType = 1)
    public String bomb(Model model) {
        List<Lead_User> bomb = leadService.getAllBomb();
        model.addAttribute("bomb", bomb);
        return "lead/NETM_lead_bomb";
    }

    /**
     * 获取所有的考研经验
     *
     * @return
     */
    @GetMapping("/exp")
    @ApiOperation("获取所有的考研经验")
    @AutoLog(value = "获取所有的考研经验", logType = 1, operateType = 1)
    public String exp(Model model) {
        List<Lead_User> exp = leadService.getAllEXP();
        model.addAttribute("exp", exp);
        return "lead/NETM_lead_lesson";
    }
}
