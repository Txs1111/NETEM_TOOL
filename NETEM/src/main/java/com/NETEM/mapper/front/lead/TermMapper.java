package com.NETEM.mapper.front.lead;

import com.NETEM.pojo.lead.Term;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月12日09:28:47
 *
 * @author Lyon
 */
public interface TermMapper {
    /**
     * 获取所有术语
     *
     * @return
     */
    @Select("select * from stuma_netem_term")
    public List<Term> getAllTerm();

    /**
     * 获取一个术语
     *
     * @return
     */
    @Select("select * from stuma_netem_term where id = #{id}")
    public Term getOneTerm(@Param("id") int id);

    /**
     * 获取九个术语
     *
     * @param random1
     * @param random2
     * @param random3
     * @param random4
     * @param random5
     * @param random6
     * @param random7
     * @param random8
     * @param random9
     * @return
     */
    @Select("select * from stuma_netem_term where id in (#{random1},#{random2},#{random3},#{random4},#{random5},#{random6},#{random7},#{random8},#{random9})")
    public List<Term> get3Term(@Param("random1") int random1,
                               @Param("random2") int random2,
                               @Param("random3") int random3,
                               @Param("random4") int random4,
                               @Param("random5") int random5,
                               @Param("random6") int random6,
                               @Param("random7") int random7,
                               @Param("random8") int random8,
                               @Param("random9") int random9);

    /**
     * 查找符合添加的术语
     *
     * @param content
     * @return
     */
    @Select("select * from stuma_netem_term where name like '%${content}%' || content like '%${content}%' ")
    public List<Term> searchTerms(@Param("content") String content);
}
