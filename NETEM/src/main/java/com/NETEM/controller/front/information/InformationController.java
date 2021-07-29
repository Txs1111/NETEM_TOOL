package com.NETEM.controller.front.information;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Information;
import com.NETEM.pojo.information.Outline;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.pojo.information.Teacher;
import com.NETEM.service.front.InformationService;
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
 * 2021年7月13日10:40:02
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/NETEM")
@Api(tags = "资源")
public class InformationController {
    @Autowired
    private InformationService informationService;

    /**
     * 院校排名的详情页面
     *
     * @param model
     * @return
     */
    @GetMapping("/timeLine")
    @ApiOperation("展示时间线的一个跳转链接")
    @AutoLog(value = "进入考研时间线模块", logType = 1, operateType = 1)
    public String timeLine(Model model) {
        return "information/NETM_information_timeline";
    }

    /**
     * 进入资源主页获取所有版块内容的两个资源
     *
     * @param model
     * @return
     */
    @GetMapping("/information")
    @ApiOperation("进入资源主页获取所有版块内容的两个资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String information(Model model) {
        List<Information> Rank = informationService.getAdmission();
        if (Rank != null) {
            model.addAttribute("Rank", Rank);
        }
        List<Information> Mark = informationService.getMark();
        if (Mark != null) {
            model.addAttribute("Mark", Mark);
        }
        List<Information> Admission = informationService.getAdmission();
        if (Admission != null) {
            model.addAttribute("Admission", Admission);
        }
        List<Outline> outline = informationService.getOutline();
        if (outline != null) {
            model.addAttribute("outline", outline);
        }
        List<RealExam> realExam = informationService.getRealExam();
        if (realExam != null) {
            model.addAttribute("realExam", realExam);
        }
        List<Teacher> teacher = informationService.getTeacher();
        if (teacher != null) {
            model.addAttribute("teacher", teacher);
        }
        return "information/NETM_information";
    }

    /**
     * 院校排名的二级页面数据
     *
     * @param model
     * @return
     */
    @GetMapping("/rankDetails")
    @ApiOperation("院校排名的二级页面数据")
    @AutoLog(value = "进入院校排名目录模块", logType = 1, operateType = 1)
    public String rankDetails(Model model) {
        List<Information> Rank = informationService.getAllRank();
        if (Rank != null) {
            model.addAttribute("Rank", Rank);
        }
        return "information/NETM_information_rank";
    }

    /**
     * 单个院校排名的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/rankDetail/{ID}")
    @ApiOperation("单个院校排名的详情页面")
    @AutoLog(value = "进入院校排名单个详细模块", logType = 1, operateType = 1)
    public String rankDetail(@PathVariable int ID, Model model) {
        Information Rank = informationService.getRankByID(ID);
        if (Rank != null) {
            model.addAttribute("Rank", Rank);
        }
        return "information/NETM_information_ran_detail";
    }

    /**
     * 历年分数的二级页面
     *
     * @param model
     * @return
     */
    @GetMapping("/markDetails")
    @ApiOperation("历年分数的二级页面")
    @AutoLog(value = "进入历年分数目录模块", logType = 1, operateType = 1)
    public String markDetails(Model model) {
        List<Information> Mark = informationService.getAllMark();
        if (Mark != null) {
            model.addAttribute("Mark", Mark);
        }
        return "information/NETM_information_mark";
    }

    /**
     * 单个历年分数的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/markDetail/{ID}")
    @ApiOperation("单个历年分数的详情页面")
    @AutoLog(value = "进入历年分数单个详细模块", logType = 1, operateType = 1)
    public String markDetail(@PathVariable int ID, Model model) {
        Information Mark = informationService.getMarkByID(ID);
        if (Mark != null) {
            model.addAttribute("Mark", Mark);
        }
        return "information/NETM_information_ma_detail";
    }

    /**
     * 报录情况的二级页面
     *
     * @param model
     * @return
     */
    @GetMapping("/admissionDetails")
    @ApiOperation("报录情况的二级页面")
    @AutoLog(value = "进入报录情况目录模块", logType = 1, operateType = 1)
    public String admissionDetails(Model model) {
        List<Information> Admission = informationService.getAllAdmission();
        if (Admission != null) {
            model.addAttribute("Admission", Admission);
        }
        return "information/NETM_information_admission";
    }

    /**
     * 单个报录情况的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/admissionDetail/{ID}")
    @ApiOperation("单个报录情况的详情页面")
    @AutoLog(value = "进入报录情况单个详细模块", logType = 1, operateType = 1)
    public String admissionDetail(@PathVariable int ID, Model model) {
        Information Admission = informationService.getAdmissionByID(ID);
        if (Admission != null) {
            model.addAttribute("Admission", Admission);
            System.out.println(Admission);
        }
        return "information/NETM_information_ad_detail";
    }

    /**
     * 考试大纲的二级页面
     *
     * @param model
     * @return
     */
    @GetMapping("/outlineDetails")
    @ApiOperation("考试大纲的二级页面")
    @AutoLog(value = "进入考试大纲目录模块", logType = 1, operateType = 1)
    public String outline_details(Model model) {

        List<Outline> outline = informationService.getAllOutline();
        if (outline != null) {
            model.addAttribute("outline", outline);
        }
        return "information/NETM_information_outline";
    }
    /**
     * 单个考试大纲的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/outlineDetail/{ID}")
    @ApiOperation("单个考试大纲的详情页面")
    @AutoLog(value = "进入考试大纲单个详细模块", logType = 1, operateType = 1)
    public String outlineDetail(@PathVariable int ID, Model model) {
        Outline outline = informationService.getOutlineByID(ID);
        if (outline != null) {
            model.addAttribute("outline", outline);
        }
        return "information/NETM_information_out_detail";
    }

    /**
     * 历年真题的二级页面
     *
     * @param model
     * @return
     */
    @GetMapping("/real_examDetails")
    @ApiOperation("历年真题的二级页面")
    @AutoLog(value = "进入历年真题目录模块", logType = 1, operateType = 1)
    public String real_exam_details(Model model) {
        List<RealExam> realExam = informationService.getAllRealExam();
        if (realExam != null) {
            model.addAttribute("realExam", realExam);
        }
        return "information/NETM_information_real";
    }

    /**
     * 单个历年真题的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/real_examDetail/{ID}")
    @ApiOperation("单个历年真题的详情页面")
    @AutoLog(value = "进入历年真题单个详细模块", logType = 1, operateType = 1)
    public String real_examDetail(@PathVariable int ID, Model model) {
        RealExam realExam = informationService.getRealExamByID(ID);
        if (realExam != null) {
            model.addAttribute("realExam", realExam);
        }
        return "information/NETM_information_real_detail";
    }

    /**
     * 优秀老师的二级页面
     *
     * @param model
     * @return
     */
    @GetMapping("/teacherDetails")
    @ApiOperation("优秀老师的二级页面")
    @AutoLog(value = "进入考研老师目录模块", logType = 1, operateType = 1)
    public String teacher_details(Model model) {
        List<Teacher> teacher = informationService.getAllTeacher();
        if (teacher != null) {
            model.addAttribute("teacher", teacher);
        }
        return "information/NETM_information_teacher";
    }
    /**
     * 单个优秀老师的详情页面
     *
     * @param ID
     * @param model
     * @return
     */
    @GetMapping("/teacherDetail/{ID}")
    @ApiOperation("单个优秀老师的详情页面")
    @AutoLog(value = "进入考研老师单个详细模块", logType = 1, operateType = 1)
    public String teacherDetail(@PathVariable int ID, Model model) {
        Teacher teacher = informationService.getTeacherByID(ID);
        if (teacher != null) {
            model.addAttribute("teacher", teacher);
        }
        return "information/NETM_information_te_detail";
    }
    /**
     * 主页搜索所有的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchInformationAll/{search}")
    @ApiOperation("主页搜索所有的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchInformationAll(@PathVariable String search, Model model) {
        List<Information> Rank = informationService.searchAdmission(search);
        if (Rank != null) {
            model.addAttribute("Rank", Rank);
        }
        List<Information> Mark = informationService.searchMark(search);
        if (Mark != null) {
            model.addAttribute("Mark", Mark);
        }
        List<Information> Admission = informationService.searchAdmission(search);
        if (Admission != null) {
            model.addAttribute("Admission", Admission);
        }
        List<Outline> outlines = informationService.searchOutline(search);
        if (outlines != null) {
            model.addAttribute("outlines", outlines);
        }
        List<RealExam> real_exams = informationService.searchReal_exam(search);
        if (real_exams != null) {
            model.addAttribute("real_exams", real_exams);
        }
        List<Teacher> teachers = informationService.searchTeacher(search);
        if (teachers != null) {
            model.addAttribute("teachers", teachers);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索院校排名中的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchRank/{search}")
    @ApiOperation("搜索院校排名中的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchRank(@PathVariable String search, Model model) {
        List<Information> Rank = informationService.searchAdmission(search);
        if (Rank != null) {
            model.addAttribute("Rank", Rank);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索历年分数中的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchMark/{search}")
    @ApiOperation("搜索历年分数中的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchMark(@PathVariable String search, Model model) {
        List<Information> Mark = informationService.searchMark(search);
        if (Mark != null) {
            model.addAttribute("Mark", Mark);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索报录情况中的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchAdmission/{search}")
    @ApiOperation("搜索报录情况中的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchAdmission(@PathVariable String search, Model model) {
        List<Information> Admission = informationService.searchAdmission(search);
        if (Admission != null) {
            model.addAttribute("Admission", Admission);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索考试大纲中的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchOutline/{search}")
    @ApiOperation("搜索考试大纲中的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchOutline(@PathVariable String search, Model model) {
        List<Outline> outlines = informationService.searchOutline(search);
        if (outlines != null) {
            model.addAttribute("outlines", outlines);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索历年真题中的资源
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchReal_exam/{search}")
    @ApiOperation("搜索历年真题中的资源")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchReal_exam(@PathVariable String search, Model model) {
        List<RealExam> real_exams = informationService.searchReal_exam(search);
        if (real_exams != null) {
            model.addAttribute("real_exams", real_exams);
        }
        return "information/NETM_information";
    }

    /**
     * 搜索优秀老师中的老师
     *
     * @param search
     * @param model
     * @return
     */
    @PostMapping("/searchTeacher/{search}")
    @ApiOperation("搜索优秀老师中的老师")
    @AutoLog(value = "进入主页", logType = 1, operateType = 1)
    public String searchTeacher(@PathVariable String search, Model model) {
        List<Teacher> teachers = informationService.searchTeacher(search);
        if (teachers != null) {
            model.addAttribute("teachers", teachers);
        }
        return "information/NETM_information";
    }

}
