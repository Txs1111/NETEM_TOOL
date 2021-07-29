package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.Teacher;

import java.util.List;

/**
 * 2021年7月18日21:35:25
 *
 * @author Lyon
 */
public interface TeacherControllerService {
    /**
     * 获取所有考研老师信息
     *
     * @param page
     * @return
     */
    List<Teacher> getTeachers(int page);

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
    List<Teacher> searchTeachers(String ID, String name, String shortIntroduce, String introduce, String courseIntroduce, String addTime);

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
    int addTeacher(String name, String shortIntroduce, String introduce, String addTime, String image, String courseIntroduce);

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
    int updateTeacher(int ID, String name, String shortIntroduce, String introduce, String image, String courseIntroduce);

    /**
     * 删除考研老师
     *
     * @param ID
     * @return
     */
    int deleteTeacher(int ID);
}
