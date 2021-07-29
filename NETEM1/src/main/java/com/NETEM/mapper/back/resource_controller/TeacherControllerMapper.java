package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.information.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日16:45:50
 *
 * @author Lyon
 */
public interface TeacherControllerMapper {
    /**
     * 获取所有考研老师信息
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_teacher limit #{page},10")
    List<Teacher> getTeachers(@Param("page") int page);

    /**
     * 搜索符合条件的考研老师数据
     *
     * @param ID
     * @param name
     * @param shortIntroduce
     * @param introduce
     * @param courseIntroduce
     * @param addTime
     * @return
     */
    @Select("select * from stuma_netem_teacher where" +
            " ID like '%${ID}%' " +
            "&& name like '%${name}%' " +
            "&& shortIntroduce like '%${shortIntroduce}%' " +
            "&& introduce like '%${introduce}%' " +
            "&& courseIntroduce like '%${courseIntroduce}%' " +
            "&& addTime like '%${addTime}%'")
    List<Teacher> searchTeachers(@Param("ID") String ID,
                                @Param("name") String name,
                                @Param("shortIntroduce") String shortIntroduce,
                                @Param("introduce") String introduce,
                                @Param("courseIntroduce") String courseIntroduce,
                                @Param("addTime") String addTime);

    /**
     * 添加考研老师
     *
     * @param name
     * @param shortIntroduce
     * @param introduce
     * @param addTime
     * @param image
     * @param courseIntroduce
     * @return
     */
    @Insert("insert into stuma_netem_teacher(name,shortIntroduce,introduce,addTime,image,courseIntroduce) " +
            "values(#{name}," +
            "#{shortIntroduce}," +
            "#{introduce}," +
            "#{addTime}," +
            "#{image}," +
            "#{courseIntroduce})")
    int addTeacher(@Param("name") String name,
                   @Param("shortIntroduce") String shortIntroduce,
                   @Param("introduce") String introduce,
                   @Param("addTime") String addTime,
                   @Param("image") String image,
                   @Param("courseIntroduce") String courseIntroduce);

    /**
     * 修改考研老师
     *
     * @param ID
     * @param name
     * @param shortIntroduce
     * @param introduce
     * @param image
     * @param courseIntroduce
     * @return
     */
    @Update("update stuma_netem_teacher set " +
            "name = #{name}," +
            "shortIntroduce = #{shortIntroduce}," +
            "introduce=#{introduce}," +
            "image=#{image}," +
            "courseIntroduce=#{courseIntroduce} " +
            "where ID = #{ID}")
    int updateTeacher(@Param("ID") int ID,
                      @Param("name") String name,
                      @Param("shortIntroduce") String shortIntroduce,
                      @Param("introduce") String introduce,
                      @Param("image") String image,
                      @Param("courseIntroduce") String courseIntroduce);

    /**
     * 删除考研老师
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_teacher where ID = #{ID} ")
    int deleteTeacher(@Param("ID") int ID);
}
