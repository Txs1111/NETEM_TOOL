package com.NETEM.mapper.back;

import com.NETEM.pojo.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月17日15:21:15
 *
 * @author Lyon
 */
public interface LogControllerMapper {

    /**
     * 获取所有日志
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_log limit #{page},10")
    List<Log> getLogs(@Param("page") int page);

    /**
     * 搜索符合条件的日志
     *
     * @param ID
     * @param userName
     * @param where
     * @param describe
     * @param addTime
     * @param consumeTime
     * @return
     */
    @Select("select * from stuma_netem_log where " +
            "ID like '%${ID}%' " +
            "&& userName like '%${userName}%' " +
            "&& studentCode1 like '%${studentCode1}%' " +
            "&& `where` like '%${where}%' " +
            "&& `describe` like '%${describe}%' " +
            "&& addTime like '%${addTime}%'" +
            "&& consumeTime like '%${consumeTime}%'")
    List<Log> searchLogs(@Param("ID") String ID,
                        @Param("userName") String userName,
                        @Param("studentCode1") String studentCode1,
                        @Param("where") String where,
                        @Param("describe") String describe,
                        @Param("addTime") String addTime,
                        @Param("consumeTime") String consumeTime);

    /**
     * 插入日志
     *
     * @param addTime
     * @param consumeTime
     * @param where
     * @return
     */
    @Insert("insert into stuma_netem_log(addTime,consumeTime,`where`) values(#{addTime},#{consumeTime},#{where})")
    int insertLog(@Param("addTime") String addTime, @Param("consumeTime") String consumeTime, @Param("where") String where);

}
