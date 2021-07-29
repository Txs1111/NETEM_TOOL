package com.NETEM.service.back;

import com.NETEM.pojo.User;
import com.NETEM.pojo.User_role;

import java.util.List;

/**
 * 2021年7月18日16:01:04
 *
 * @author Lyon
 */
public interface MemberControllerService {
    /**
     * 获取所有用户
     *
     * @param page
     * @return
     */
    List<User_role> getMembers(int page);

    /**
     * 搜索符合条件的成员
     *
     * @param ID
     * @param name
     * @param roleId
     * @return
     */
    List<User_role> searchMember(String ID, String name, String roleId);

    /**
     * 获取所有角色
     *
     * @return
     */
    List<User_role> getRoles();

    /**
     * 修改成员信息
     *
     * @param ID
     * @param name
     * @param roleId
     * @return
     */
    List<User> updateMember(int ID, String name, int roleId);

}
