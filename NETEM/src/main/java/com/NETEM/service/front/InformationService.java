package com.NETEM.service.front;

import com.NETEM.pojo.information.Information;
import com.NETEM.pojo.information.Outline;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.pojo.information.Teacher;

import java.util.List;

/**
 * 2021年7月13日11:07:48
 *
 * @author Lyon
 */

public interface InformationService {
    /**
     * 查询两条<p></p>
     * 院校排名<p></p>
     * 资源
     *
     * @return
     */
    List<Information> getRank();

    /**
     * 通过ID查询两条<p></p>
     * 院校排名<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    Information getRankByID( int ID);

    /**
     * 查询两条<p></p>
     * 历年分数<p></p>
     * 资源
     *
     * @return
     */
    List<Information> getMark();

    /**
     * 查询两条<p></p>
     * 历年分数<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    Information getMarkByID( int ID);

    /**
     * 查询两条<p></p>
     * 报录情况<p></p>
     * 资源
     *
     * @return
     */
    List<Information> getAdmission();

    /**
     * 查询两条<p></p>
     * 报录情况<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    Information getAdmissionByID( int ID);

    /**
     * 查询两条<p></p>
     * 考试大纲<p></p>
     * 资源
     *
     * @return
     */
    List<Outline> getOutline();

    /**
     * 查询两条<p></p>
     * 考试大纲<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    Outline getOutlineByID( int ID);

    /**
     * 查询两条<p></p>
     * 历年真题<p></p>
     * 资源
     *
     * @return
     */
    List<RealExam> getRealExam();

    /**
     * 查询两条<p></p>
     * 历年真题<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    RealExam getRealExamByID( int ID);

    /**
     * 查询两条<p></p>优秀老师<p></p>资源
     *
     * @return
     */
    List<Teacher> getTeacher();

    /**
     * 查询两条<p></p>
     * 优秀老师<p></p>
     * 资源
     *
     * @param ID
     * @return
     */
    Teacher getTeacherByID( int ID);

    /**
     * 查询所有<p></p>院校排名<p></p>资源
     *
     * @return
     */
    List<Information> getAllRank();

    /**
     * 查询所有<p></p>历年分数<p>资源
     *
     * @return
     */
    List<Information> getAllMark();

    /**
     * 查询所有<p></p>报录情况<p></p>资源
     *
     * @return
     */
    List<Information> getAllAdmission();

    /**
     * 查询所有<p></p>考试大纲<p></p>资源
     *
     * @return
     */
    List<Outline> getAllOutline();

    /**
     * 查询所有<p></p>历年真题<p></p>资源
     *
     * @return
     */
    List<RealExam> getAllRealExam();

    /**
     * 查询所有<p></p>优秀老师<p></p>资源
     *
     * @return
     */
    List<Teacher> getAllTeacher();

    /**
     * 模糊查询所有<p></p>院校排名<p></p>资源
     *
     * @return
     */
    List<Information> searchRank(String search);

    /**
     * 模糊查询所有<p></p>历年分数<p></p>资源
     *
     * @return
     */
    List<Information> searchMark(String search);

    /**
     * 模糊查询所有<p></p>报录情况<p></p>资源
     *
     * @return
     */
    List<Information> searchAdmission(String search);

    /**
     * 模糊查询所有<p></p>考试大纲<p></p>资源
     *
     * @return
     */
    List<Outline> searchOutline(String search);

    /**
     * 模糊查询所有<p></p>历年真题<p></p>资源
     *
     * @return
     */
    List<RealExam> searchReal_exam(String search);

    /**
     * 模糊查询所有<p></p>考研老师推荐<p></p>资源
     *
     * @return
     */
    List<Teacher> searchTeacher(String search);
}
