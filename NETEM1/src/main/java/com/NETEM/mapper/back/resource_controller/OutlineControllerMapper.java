package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.Outline;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日16:40:04
 *
 * @author Lyon
 */
public interface OutlineControllerMapper {
    /**
     * 获取所有考试大纲信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_outline limit #{page},10")
    List<Outline> getOutlines(@Param("page") int page);

    /**
     * 搜索符合条件的考试大纲数据
     *
     * @param ID
     * @param title
     * @param content
     * @param yearTime
     * @param resource
     * @param addTime
     * @return
     */
    @Select("select * from stuma_netem_outline where" +
            " ID like '%${ID}%' " +
            "&& title like '%${title}%' " +
            "&& content like '%${content}%' " +
            "&& yearTime like '%${yearTime}%' " +
            "&& resource like '%${resource}%' " +
            "&& addTime like '%${addTime}%'")
    List<Outline> searchOutlines(@Param("ID") String ID,
                                @Param("title") String title,
                                @Param("content") String content,
                                @Param("yearTime") String yearTime,
                                @Param("resource") String resource,
                                @Param("addTime") String addTime);

    /**
     * 添加考试大纲
     *
     * @param title
     * @param content
     * @param yearTime
     * @param addTime
     * @param resource
     * @param image
     * @return
     */
    @Insert("insert into stuma_netem_outline(title,content,yearTime,addTime,resource,image) " +
            "values(#{title}," +
            "#{content}," +
            "#{yearTime}," +
            "#{addTime}," +
            "#{resource}," +
            "#{image})")
    int addOutline(@Param("title") String title,
                   @Param("content") String content,
                   @Param("yearTime") String yearTime,
                   @Param("addTime") String addTime,
                   @Param("resource") String resource,
                   @Param("image") String image);

    /**
     * 修改考试大纲
     *
     * @param ID
     * @param title
     * @param content
     * @param yearTime
     * @param resource
     * @param image
     * @return
     */
    @Update("update stuma_netem_outline set " +
            "title = #{title}," +
            "content = #{content}," +
            "yearTime=#{yearTime}," +
            "resource=#{resource}, " +
            "image=#{image} " +
            "where ID = #{ID}")
    int updateOutline(@Param("ID") int ID,
                      @Param("title") String title,
                      @Param("content") String content,
                      @Param("yearTime") String yearTime,
                      @Param("resource") String resource,
                      @Param("image") String image);

    /**
     * 删除考试大纲
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_outline where ID = #{ID} ")
    int deleteOutline(@Param("ID") int ID);
}
