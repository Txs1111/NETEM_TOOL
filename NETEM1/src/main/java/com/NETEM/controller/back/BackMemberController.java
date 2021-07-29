package com.NETEM.controller.back;

import com.NETEM.common.AutoLog;
import com.NETEM.pojo.User_role;
import com.NETEM.service.back.MemberControllerService;
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

/**
 * 2021年7月16日10:14:52
 *
 * @author Lyon
 */
@Controller
@RequestMapping("/BackNETEM")
@Api(tags = "后台—成员管理")
public class BackMemberController {

    @Autowired
    private MemberControllerService memberControllerService;

    @GetMapping("/MemberController")
    @ApiOperation("成员管理第一页")
    @AutoLog(value = "成员管理第一页", logType = 1, operateType = 1)
    public String memberController(Model model) {
        List<User_role> allMember = memberControllerService.getMembers(1);
        List<User_role> roles = memberControllerService.getRoles();
        if (allMember != null) {
            model.addAttribute("allMember", allMember);
            System.out.println(allMember);
        }
        if (roles != null) {
            model.addAttribute("roles", roles);
        }
        return "../webback/member_control";
    }
    @PostMapping("/UpdateMember")
    @ResponseBody
    @ApiOperation("成员管理第一页")
    @AutoLog(value = "成员管理第一页", logType = 1, operateType = 1)
    public String UpdateMember( int id,String name, int role) {
        memberControllerService.updateMember(id,name,role);
        return "";
    }

    @PostMapping("/SearchMembers")
    @ResponseBody
    @ApiOperation("成员管理搜索")
    @AutoLog(value = "成员管理搜索", logType = 1, operateType = 1)
    public List<User_role> SearchMembers(String id, String name, String role, Model model) {
        List<User_role> user_roles = memberControllerService.searchMember(id, name, role);
        return user_roles;
    }


}
