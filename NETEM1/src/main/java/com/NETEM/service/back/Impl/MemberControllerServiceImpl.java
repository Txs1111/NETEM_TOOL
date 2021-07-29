package com.NETEM.service.back.Impl;

import com.NETEM.mapper.back.MemberControllerMapper;
import com.NETEM.pojo.User;
import com.NETEM.pojo.User_role;
import com.NETEM.service.back.MemberControllerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 2021-7-18 20:38:27
 *
 * @author Lyon
 */
public class MemberControllerServiceImpl implements MemberControllerService {
    @Autowired
    private MemberControllerMapper memberControllerMapper;

    public void setMemberControllerMapper(MemberControllerMapper memberControllerMapper) {
        this.memberControllerMapper = memberControllerMapper;
    }

    @Override
    public List<User_role> getMembers(int page) {
        return memberControllerMapper.getMembers((page - 1) * 6);
    }

    @Override
    public List<User_role> searchMember(String ID, String name, String roleId) {
        return memberControllerMapper.searchMember(ID, name, roleId);
    }

    @Override
    public List<User_role> getRoles() {
        return memberControllerMapper.getRoles();
    }


    @Override
    public List<User> updateMember(int ID, String name, int roleId) {
        return memberControllerMapper.updateMember(ID, name, roleId);
    }
}
