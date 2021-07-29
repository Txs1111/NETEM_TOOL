package com.NETEM.mapper.front.information;

import com.NETEM.pojo.information.Information;
import com.NETEM.pojo.information.Outline;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.pojo.information.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 2021年7月13日10:54:52
 *
 * @author Lyon
 */
public interface InformationMapper {
    /**
     * 查询两条<p></p>
     * 院校排名<p></p>
     * 资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=1 limit 0,2")
    List<Information> getRank();

    /**
     * 通过ID查询两条<p></p>
     * 院校排名<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_information where type=1 and ID=#{ID}")
    Information getRankByID(@Param("ID") int ID);

    /**
     * 查询两条<p></p>
     * 历年分数<p></p>
     * 资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=2 limit 0,2")
    List<Information> getMark();

    /**
     * 查询两条<p></p>
     * 历年分数<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_information where type=2 and ID=#{ID}")
    Information getMarkByID(@Param("ID") int ID);

    /**
     * 查询两条<p></p>
     * 报录情况<p></p>
     * 资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=3 limit 0,2")
    List<Information> getAdmission();

    /**
     * 查询两条<p></p>
     * 报录情况<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_information where type=3 and ID=#{ID}")
    Information getAdmissionByID(@Param("ID") int ID);

    /**
     * 查询两条<p></p>
     * 考试大纲<p></p>
     * 资源
     *
     * @return
     */
    @Select("select * from stuma_netem_outline limit 0,2")
    List<Outline> getOutline();

    /**
     * 查询两条<p></p>
     * 考试大纲<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_outline where ID=#{ID}")
    Outline getOutlineByID(@Param("ID") int ID);

    /**
     * 查询两条<p></p>
     * 历年真题<p></p>
     * 资源
     *
     * @return
     */
    @Select("select * from stuma_netem_real_exam limit 0,2")
    List<RealExam> getRealExam();

    /**
     * 查询两条<p></p>
     * 历年真题<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_real_exam where ID=#{ID}")
    RealExam getRealExamByID(@Param("ID") int ID);

    /**
     * 查询两条<p></p>优秀老师<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_teacher limit 0,2")
    List<Teacher> getTeacher();

    /**
     * 查询两条<p></p>
     * 优秀老师<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_teacher where ID=#{ID}")
    Teacher getTeacherByID(@Param("ID") int ID);

    /**
     * 查询所有<p></p>院校排名<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=1")
    List<Information> getAllRank();

    /**
     * 查询所有<p></p>历年分数<p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=2")
    List<Information> getAllMark();

    /**
     * 查询所有<p></p>报录情况<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type=3")
    List<Information> getAllAdmission();

    /**
     * 查询所有<p></p>考试大纲<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_outline")
    List<Outline> getAllOutline();

    /**
     * 查询所有<p></p>历年真题<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_real_exam")
    List<RealExam> getAllRealExam();

    /**
     * 查询所有<p></p>优秀老师<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_teacher")
    List<Teacher> getAllTeacher();

    /**
     * 模糊查询所有<p></p>院校排名<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type = 1 && content like '%${search}%' || title like '%${search}%'")
    List<Information> searchRank(@Param("search") String search);

    /**
     * 模糊查询所有<p></p>历年分数<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type = 2 && content like '%${search}%' || title like '%${search}%'")
    List<Information> searchMark(@Param("search") String search);

    /**
     * 模糊查询所有<p></p>报录情况<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_information where type = 3 && content like '%${search}%' || title like '%${search}%'")
    List<Information> searchAdmission(@Param("search") String search);

    /**
     * 模糊查询所有<p></p>考试大纲<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_outline where content like '%${search}%' || title like '%${search}%'")
    List<Outline> searchOutline(@Param("search") String search);

    /**
     * 模糊查询所有<p></p>历年真题<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_real_exam where yearTime like '%${search}%' || title like '%${search}%'")
    List<RealExam> searchReal_exam(@Param("search") String search);

    /**
     * 模糊查询所有<p></p>考研老师推荐<p></p>资源
     *
     * @return
     */
    @Select("select * from stuma_netem_teacher where name like '%${search}%'" +
            " || shortIntroduce like '%${search}%'" +
            " || introduce like '%${search}%'" +
            " || courseIntroduce like '%${search}%'")
    List<Teacher> searchTeacher(@Param("search") String search);

    /**
     * 查询指定<p></p>院校排名<p></p>历年分数<p></p>报录情况<p></p>资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_information where ID = #{ID}")
    List<Information> getInformationID(@Param("ID") int ID);


    /**
     * 查询指定<p></p>考试大纲<p></p>资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_outline where ID = #{ID} ")
    List<Outline> getOutlineID(@Param("ID") int ID);

    /**
     * 查询指定<p></p>历年真题<p></p>资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_real_exam where ID = #{ID} ")
    List<RealExam> getRealExamID(@Param("ID") int ID);

    /**
     * 查询指定<p></p>优秀老师<p></p>资源
     *
     * @param ID
     * @return
     */
    @Select("select * from stuma_netem_teacher where ID = #{ID} ")
    List<Teacher> getTeacherID(@Param("ID") int ID);
}
