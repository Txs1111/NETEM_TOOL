package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.Information;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日15:30:53
 *
 * @author Lyon
 */
public interface RankControllerMapper {
    /**
     * 获取所有院校排名信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_information where type = 1 limit #{page},10")
    List<Information> getRanks(@Param("page") int page);

    /**
     * 搜索符合条件的院校排名数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_information where type = 1 &&" +
            " ID like '%${ID}%' " +
            "&& title like '%${title}%' " +
            "&& content like '%${content}%' " +
            "&& addTime like '%${addTime}%'")
    List<Information> searchRanks(@Param("ID") String ID,
                                  @Param("title") String title,
                                  @Param("content") String content,
                                  @Param("addTime") String addTime);

    /**
     * 添加院校排名
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    @Insert("insert into stuma_netem_information(type,title,content,addTime,image) " +
            "values(1," +
            "#{title}," +
            "#{content}," +
            "#{addTime}," +
            "#{image})")
    int addRank(@Param("title") String title,
                @Param("content") String content,
                @Param("addTime") String addTime,
                @Param("image") String image);

    /**
     * 修改院校排名
     *
     * @param ID
     * @param title
     * @param content
     * @param image
     * @return
     */
    @Update("update stuma_netem_information set title = #{title},content = #{content},image = #{image} where type = 1 && ID = #{ID}")
    int updateRank(@Param("ID") int ID, @Param("title") String title, @Param("content") String content, @Param("image") String image);

    /**
     * 删除院校排名
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_information where type = 1 && ID = #{ID} ")
    int deleteRank(@Param("ID") int ID);
}
