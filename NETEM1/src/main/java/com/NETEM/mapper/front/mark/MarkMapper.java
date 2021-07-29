package com.NETEM.mapper.front.mark;

import com.NETEM.pojo.mark.Mark;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月14日15:23:30
 *
 * @author Lyon
 */
public interface MarkMapper {
    /**
     * 查找同一个专业major的所有课程
     *
     * @param major
     * @return
     */
    @Select("select majorSubject from stuma_netem_mark where major = #{major}" +
            " && name = (select name from stuma_netem_mark where major=#{major} limit 0,1) ")
    List<String> getAllClass(@Param("major") String major);

    /**
     * 查找所有专业major
     *
     * @return
     */
    @Select("select distinct m.major from stuma_netem_mark m")
    List<String> getAllMajor();

    /**
     * 查找所有学校
     *
     * @return
     */
    @Select("select distinct m.name from stuma_netem_mark m")
    List<String> getAllCollege();


    /**
     * 查找课程与分数符合要求的学校
     *
     * @param major
     * @param markLine
     * @return
     */
    @Select("select distinct m.name from stuma_netem_mark m where major=#{major} && markLine<=#{markLine}")
    List<Mark> getMassage(@Param("major") String major,@Param("markLine") int markLine);

    /**
     * 计算符合条件的学校
     *
     * @param college
     * @param love
     * @return
     */
    List<Mark> count(@Param("college") String college,@Param("love") String love);
    /**
     * 计算符合条件的学校
     *
     * @param major
     * @param majorSubject
     * @param markLine
     * @return
     */
    @Select("select distinct m.name from stuma_netem_mark m " +
            "where name in " +
            "(select distinct m.name from stuma_netem_mark m where major = #{major} " +
            "and majorSubject = #{majorSubject} " +
            "and markLine <= #{markLine})")
    List<String> getCollege(@Param("major") String major,@Param("majorSubject") String majorSubject,@Param("markLine") int markLine);

    /**
     * 查找学校所有信息
     *
     * @param major
     * @param name
     * @return
     */
    @Select("select * from stuma_netem_mark m where name in (#{name}) and major = #{major}")
    List<Mark> getColleges(@Param("major") String major,@Param("name") String name);
}
