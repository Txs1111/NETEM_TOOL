package com.NETEM.mapper.back.resource_controller;

import com.NETEM.pojo.lead.Term;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 2021年7月16日11:51:03
 *
 * @author Lyon
 */
public interface TermControllerMapper {
    /**
     * 获取所有术语
     *
     * @param page
     * @return
     */
    @Select("select * from stuma_netem_term limit #{page},10")
    List<Term> getTerms(@Param("page") int page);

    /**
     * 搜索符合条件的术语
     *
     * @param ID
     * @param name
     * @param addTime
     * @return
     */
    @Select("select * from stuma_netem_term where ID like '%${ID}%' && name like '%${name}%' && addTime like '%${addTime}%'")
    List<Term> searchTerm(@Param("ID") String ID, @Param("name") String name, @Param("addTime") String addTime);

    /**
     * 增加术语
     *
     * @param name
     * @param content
     * @param addTime
     * @return
     */
    @Insert("insert into stuma_netem_term(name,content,addTime) values(#{name},#{content},#{addTime})")
    int addTerm(@Param("name") String name,@Param("content") String content,@Param("addTime") String addTime);

    /**
     * 修改术语
     *
     * @param ID
     * @param name
     * @param content
     * @return
     */
    @Update("update stuma_netem_term set name = #{name},content = #{content} where id = #{ID}")
    int updateTerm(@Param("ID") int ID, @Param("name") String name, @Param("content") String content);

    /**
     * 删除术语
     *
     * @param ID
     * @return
     */
    @Delete("delete * from stuma_netem_term where ID = #{ID}")
    int deleteTerm(@Param("ID") int ID);
}
