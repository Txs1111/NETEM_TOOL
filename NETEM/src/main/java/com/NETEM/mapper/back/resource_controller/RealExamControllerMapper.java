package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.RealExam;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日15:30:53
 *
 * @author Lyon
 */
public interface RealExamControllerMapper {
    /**
     * 获取所有历年真题信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_real_exam limit #{page},10")
    List<RealExam> getRealExams(@Param("page") int page);

    /**
     * 搜索符合条件的历年真题数据
     *
     * @param ID
     * @param title
     * @param yearTime
     * @param addTime
     * @return
     */
    @Select("select * from stuma_netem_real_exam where" +
            " ID like '%${ID}%' " +
            "&& title like '%${title}%' " +
            "&& yearTime like '%${yearTime}%' " +
            "&& addTime like '%${addTime}%'")
    List<RealExam> searchRealExams(@Param("ID") String ID,
                                   @Param("title") String title,
                                   @Param("yearTime") String yearTime,
                                   @Param("addTime") String addTime);

    /**
     * 添加历年真题
     *
     * @param title
     * @param yearTime
     * @param addTime
     * @param url
     * @return
     */
    @Insert("insert into stuma_netem_real_exam(title,yearTime,addTime,`url`) values(#{title},#{yearTime},#{addTime},#{url})")
    int addRealExam(@Param("title") String title,
                    @Param("yearTime") String yearTime,
                    @Param("addTime") String addTime,
                    @Param("url") String url);

    /**
     * 修改历年真题
     *
     * @param ID
     * @param title
     * @param yearTime
     * @return
     */
    @Update("update stuma_netem_real_exam set " +
            "title = #{title}," +
            "yearTime = #{yearTime}, " +
            "url = #{url} " +
            "where ID = #{ID}")
    int updateRealExam(@Param("ID") int ID, @Param("title") String title, @Param("yearTime") String yearTime, @Param("url") String url);

    /**
     * 删除历年真题
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_real_exam where ID = #{ID} ")
    int deleteRealExam(@Param("ID") int ID);
}
