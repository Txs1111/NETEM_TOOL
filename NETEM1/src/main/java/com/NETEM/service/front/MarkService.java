package com.NETEM.service.front;

import com.NETEM.pojo.mark.Mark;

import java.util.List;

/**
 * 2021年7月14日15:38:39
 *
 * @author Lyon
 */
public interface MarkService {
    /**
     * 查找同一个专业major的所有课程
     *
     * @param major
     * @return
     */
    List<String> getAllClass(String major);

    /**
     * 查找所有专业major
     *
     * @return
     */
    List<String> getAllMajor();

    /**
     * 查找所有学校
     *
     * @return
     */
    List<String> getAllCollege();

    /**
     * 查找所有信息
     *
     * @param major
     * @param markLine
     * @return
     */
    List<Mark> getMassage(String major, int markLine);

    /**
     * 计算符合条件的学校
     *
     * @param college
     * @param love
     * @return
     */
    List<Mark> count(String college,String love);
    /**
     * 计算符合条件的学校
     *
     * @param major
     * @param majorSubject
     * @param markLine
     * @return
     */
    List<String> getCollege(String major,String majorSubject, int markLine);
    /**
     * 查找学校所有信息
     *
     * @param major
     * @param name
     * @return
     */
    List<Mark> getColleges(String major,String name);
}
