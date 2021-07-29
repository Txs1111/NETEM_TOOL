package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.Information;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日15:30:53
 *
 * @author Lyon
 */
public interface ReportControllerMapper {
    /**
     * 获取所有学校报录信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_information where type = 3 limit #{page},10")
    List<Information> getReports(@Param("page") int page);

    /**
     * 搜索符合条件的学校报录数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_information where type = 3 &&" +
            " ID like '%${ID}%' " +
            "&& title like '%${title}%' " +
            "&& content like '%${content}%' " +
            "&& addTime like '%${addTime}%'")
    List<Information> searchReport(@Param("ID") String ID,
                                   @Param("title") String title,
                                   @Param("content") String content,
                                   @Param("addTime") String addTime);
    /**
     * 添加学校报录
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    @Insert("insert into stuma_netem_information(type,title,content,addTime,image) " +
            "values(3," +
            "#{title}," +
            "#{content}," +
            "#{addTime}," +
            "#{image})")
    int addReport(@Param("title") String title,
                  @Param("content") String content,
                  @Param("addTime") String addTime,
                  @Param("image") String image);

    /**
     * 修改学校报录
     *
     * @param ID
     * @param title
     * @param content
     * @return
     */
    @Update("update stuma_netem_information set title = #{title},content = #{content},image = #{image} where type = 3 && ID = #{ID}")
    int updateReport(@Param("ID") int ID, @Param("title") String title, @Param("content") String content, @Param("image") String image);

    /**
     * 删除学校报录
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_information where type = 3 && ID = #{ID}")
    int deleteReport(@Param("ID") int ID);
}
