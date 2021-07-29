package com.NETEM.mapper.front.lead;

import com.NETEM.pojo.lead.Lead_User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月12日15:03:05
 *
 * @author Lyon
 */
public interface LeadMapper {


    /**
     * 获取考研目的部分内容
     *
     * @param prefix
     * @param suffix
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u " +
            "where type=1 and l.userId=u.studentCode1 limit #{prefix},#{suffix}")
    List<Lead_User> getAim(@Param("prefix") int prefix, @Param("suffix") int suffix);

    /**
     * 获取所有考研目的部分内容
     *
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u " +
            "where type=1 and l.userId=u.studentCode1")
    List<Lead_User> getAllAim();

    /**
     * 获取考研雷区部分内容
     *
     * @param prefix
     * @param suffix
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u " +
            "where type=2 and l.userId=u.studentCode1 limit #{prefix},#{suffix}")
    List<Lead_User> getBomb(@Param("prefix") int prefix, @Param("suffix") int suffix);

    /**
     * 获取所有考研雷区部分内容
     *
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u " +
            "where type=2 and l.userId=u.studentCode1")
    List<Lead_User> getAllBomb();

    /**
     * 获取考研经验部分内容
     *
     * @param prefix
     * @param suffix
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u" +
            " where type=3 and l.userId=u.studentCode1 limit #{prefix},#{suffix}")
    List<Lead_User> getEXP(@Param("prefix") int prefix, @Param("suffix") int suffix);

    /**
     * 获取所有考研经验部分内容
     *
     * @return
     */
    @Select("select distinct l.ID,l.type,l.userId,l.content,l.time,l.likes,u.name from stuma_netem_lead l, stuma_netem_user u" +
            " where type=3 and l.userId=u.studentCode1")
    List<Lead_User> getAllEXP();

    /**
     * 用户发布内容
     *
     * @param type
     * @param userId
     * @param content
     * @param time
     * @return
     */
    @Insert("insert into stuma_netem_lead(type,userId,content,time) values(#{type},#{userId},#{content},#{time})")
    int addLead(@Param("type") int type,
                @Param("userId") String userId,
                @Param("content") String content,
                @Param("time") String time);
}
