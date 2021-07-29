package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.Information;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日15:30:53
 *
 * @author Lyon
 */
public interface ScoreControllerMapper {
    /**
     * 获取所有历年分数信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_information where type = 2 limit #{page},10")
    List<Information> getScores(@Param("page") int page);

    /**
     * 搜索符合条件的历年分数数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_information where type = 2 &&" +
            " ID like '%${ID}%' " +
            "&& title like '%${title}%' " +
            "&& content like '%${content}%' " +
            "&& addTime like '%${addTime}%'")
    List<Information> searchScore(@Param("ID") String ID,
                                  @Param("title") String title,
                                  @Param("content") String content,
                                  @Param("addTime") String addTime);

    /**
     * 添加历年分数
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    @Insert("insert into stuma_netem_information(type,title,content,addTime,image) " +
            "values(2," +
            "#{title}," +
            "#{content}," +
            "#{addTime}," +
            "#{image})")
    int addScore(@Param("title") String title,
                 @Param("content") String content,
                 @Param("addTime") String addTime,
                 @Param("image") String image);

    /**
     * 修改历年分数
     *
     * @param ID
     * @param title
     * @param content
     * @param image
     * @return
     */
    @Update("update stuma_netem_information set title = #{title},content = #{content},image = #{image} where type = 2 && ID = #{ID}")
    int updateScore(@Param("ID") int ID, @Param("title") String title, @Param("content") String content, @Param("image") String image);

    /**
     * 删除历年分数
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_information where type = 2 && ID = #{ID} ")
    int deleteScore(@Param("ID") int ID);
}
