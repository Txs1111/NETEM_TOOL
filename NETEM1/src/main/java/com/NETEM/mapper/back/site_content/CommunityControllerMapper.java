package com.NETEM.mapper.back.site_content;

import com.NETEM.pojo.community.Community;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月17日16:14:26
 *
 * @author Lyon
 */
public interface CommunityControllerMapper {

    /**
     * 获取所有社区交流
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_community where type = 1 limit #{page},10")
    List<Community> getCommunitys(@Param("page") int page);

    /**
     * 查询所有符合条件的社区交流
     *
     * @param ID
     * @param userId
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_community where type = 1 &&" +
            " ID = '%${ID}%' " +
            "&& userId = '%${userId}%' " +
            "&& title = '%${title}%' " +
            "&& content = '%${content}%' " +
            "&& addTime = '%${addTime}%'")
    List<Community> searchCommunity(@Param("ID") int ID,
                                    @Param("userId") String userId,
                                    @Param("title") String title,
                                    @Param("content") String content,
                                    @Param("addTime") String addTime);

    /**
     * 删除社区交流
     *
     * @param ID
     * @return
     */
    @Select("delete * from stuma_netem_community where type = 1 && ID = #{ID} ")
    List<Community> deleteCommunity(@Param("ID") int ID);

    /**
     * 更新社区交流
     *
     * @param ID
     * @param userId
     * @param title
     * @param content
     * @return
     */
    @Select("update stuma_netem_community set " +
            "userId = #{userId}," +
            "title = #{title}," +
            "content = #{content} " +
            "where type = 1 && ID = #{ID}")
    List<Community> updateCommunity(@Param("ID") int ID,
                                    @Param("userId") String userId,
                                    @Param("title") String title,
                                    @Param("content") String content);
}
