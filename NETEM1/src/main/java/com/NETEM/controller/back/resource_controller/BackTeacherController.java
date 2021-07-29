package com.NETEM.controller.back.resource_controller;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.information.Teacher;
import com.NETEM.service.back.resource_controller.TeacherControllerService;
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
 * 2021年7月27日17:09:10
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—考研老师")
public class BackTeacherController {
    @Autowired
    private TeacherControllerService teacherControllerService;

    @GetMapping("/TeacherController")
    @ApiOperation("考研老师第一页")
    @AutoLog(value = "考研老师第一页", logType = 1, operateType = 1)
    public String teacherController(Model model) {
        List<Teacher> teachers = teacherControllerService.getTeachers(1);
        if (teachers != null) {
            model.addAttribute("teachers", teachers);
        }
        return "../webback/resource_controller/teacher_control";
    }
    @PostMapping("/SearchTeachers")
    @ResponseBody
    @ApiOperation("查找符合条件的考研老师")
    @AutoLog(value = "查找符合条件的考研老师", logType = 1, operateType = 1)
    public List<Teacher> SearchTeachers(String id, String name, String shortIntroduce, String introduce, String courseIntroduce, String addTime){
        List<Teacher> outlines = teacherControllerService.searchTeachers(id, name, shortIntroduce, introduce, courseIntroduce, addTime);
        return outlines;
    }

    @PostMapping("/AddTeacher")
    @ResponseBody
    @ApiOperation("管理员添加考研老师")
    @AutoLog(value = "管理员添加考研老师", logType = 1, operateType = 1)
    public int AddTeacher(String name, String shortIntroduce, String introduce, String addTime, String image, String courseIntroduce) {
        int i = teacherControllerService.addTeacher(name, shortIntroduce, introduce, getString(), image, courseIntroduce);
        return i;
    }

    @PostMapping("/UpdateTeacher")
    @ResponseBody
    @ApiOperation("管理员修改考研老师")
    @AutoLog(value = "管理员修改考研老师", logType = 1, operateType = 1)
    public int UpdateTeacher(int id, String name, String shortIntroduce, String introduce,String image, String courseIntroduce) {
        int i = teacherControllerService.updateTeacher(id, name, shortIntroduce, introduce, image, courseIntroduce);
        return i;
    }
}
