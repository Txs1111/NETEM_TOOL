package com.NETEM.mapper.back;

import com.NETEM.pojo.User;
import com.NETEM.pojo.User_role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 2021年7月16日11:24:43
 *
 * @author Lyon
 */
public interface MemberControllerMapper {

    /**
     * 获取所有用户
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_user u,stuma_netem_role r where u.roleId=r.ID  limit #{page},10")
    List<User_role> getMembers(@Param("page") int page);

    /**
     * 获取所有角色
     *
     * @return
     */
    @Select("select * from stuma_netem_role")
    List<User_role> getRoles();

    /**
     * 搜索符合条件的成员
     *
     * @param ID
     * @param name
     * @param roleId
     * @return
     */
    @Select("select * from stuma_netem_user u,stuma_netem_role r where u.roleId=r.ID && u.studentID like '%${ID}%' && u.name like '%${name}%' && u.roleId like '%${roleId}%'")
    List<User_role> searchMember(@Param("ID") String ID, @Param("name") String name, @Param("roleId") String roleId);



    /**
     * 修改成员信息
     *
     * @param ID
     * @param name
     * @param roleId
     * @return
     */
    @Update("update stuma_netem_user set roleId =#{roleId} where studentID = #{ID} && name = #{name}")
    List<User> updateMember(@Param("ID") int ID, @Param("name") String name, @Param("roleId") int roleId);


}
