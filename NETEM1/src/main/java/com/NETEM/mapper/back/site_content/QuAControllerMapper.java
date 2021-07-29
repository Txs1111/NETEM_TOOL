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
public interface QuAControllerMapper {

    /**
     * 获取所有社区问答
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_community where type = 2 limit #{page},10")
    List<Community> getQAs(@Param("page") int page);

    /**
     * 查询所有符合条件的社区问答
     *
     * @param ID
     * @param userId
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_community where type = 2 &&" +
            " ID = '%${ID}%' " +
            "&& userId = '%${userId}%' " +
            "&& title = '%${title}%' " +
            "&& content = '%${content}%' " +
            "&& addTime = '%${addTime}%'")
    List<Community> searchQA(@Param("ID") int ID,
                             @Param("userId") String userId,
                             @Param("title") String title,
                             @Param("content") String content,
                             @Param("addTime") String addTime);

    /**
     * 删除社区问答
     *
     * @param ID
     * @return
     */
    @Select("delete * from stuma_netem_community where type = 2 && ID = #{ID} ")
    List<Community> deleteQA(@Param("ID") int ID);

    /**
     * 更新社区问答
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
            "where type = 2 && ID = #{ID}")
    List<Community> updateQA(@Param("ID") int ID,
                             @Param("userId") String userId,
                             @Param("title") String title,
                             @Param("content") String content);
}
