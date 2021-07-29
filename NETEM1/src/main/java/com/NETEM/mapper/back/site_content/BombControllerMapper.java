package com.NETEM.mapper.back.site_content;

import com.NETEM.pojo.lead.Lead_User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月17日15:41:50
 *
 * @author Lyon
 */
public interface BombControllerMapper {
    /**
     * 获取所有考研雷区信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_lead l,stuma_netem_user u where type = 3 and l.userId=u.studentCode1 limit #{page},10")
    List<Lead_User> getBombs(@Param("page") int page);

    /**
     * 搜索符合条件的考研雷区数据
     *
     * @param ID
     * @param userId
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_lead where type = 3 &&" +
            " ID = '%${ID}%' " +
            "&& userId = '%${userId}%' " +
            "&& content = '%${content}%' " +
            "&& addTime = '%${addTime}%'")
    List<Lead_User> searchBomb(@Param("ID") int ID,
                          @Param("userId") String userId,
                          @Param("content") String content,
                          @Param("addTime") String addTime);

    /**
     * 删除考研雷区
     *
     * @param ID
     * @return
     */
    @Select("delete * from stuma_netem_lead where type = 3 && ID = #{ID} ")
    List<Lead_User> deleteBomb(@Param("ID") int ID);

    /**
     * 修改考研雷区
     *
     * @param ID
     * @param userId
     * @param content
     * @return
     */
    @Select("update stuma_netem_lead set " +
            "userId = #{userId}," +
            "content = #{content} " +
            "where type = 3 && ID = #{ID}")
    List<Lead_User> updateBomb(@Param("ID") int ID,
                          @Param("userId") String userId,
                          @Param("content") String content);
}
