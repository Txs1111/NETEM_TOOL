package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.TeacherControllerMapper;
import com.NETEM.pojo.information.Teacher;
import com.NETEM.service.back.resource_controller.TeacherControllerService;

import java.util.List;

/**
 * 2021年7月18日21:37:27
 *
 * @author Lyon
 */
public class TeacherControllerServiceImpl implements TeacherControllerService {

    private TeacherControllerMapper teacherControllerMapper;

    public void setTeacherControllerMapper(TeacherControllerMapper teacherControllerMapper) {
        this.teacherControllerMapper = teacherControllerMapper;
    }

    @Override
    public List<Teacher> getTeachers(int page) {
        return teacherControllerMapper.getTeachers((page - 1) * 6);
    }

    @Override
    public List<Teacher> searchTeachers(String ID, String name, String shortIntroduce, String introduce, String courseIntroduce, String addTime) {
        return teacherControllerMapper.searchTeachers(ID, name, shortIntroduce, introduce, courseIntroduce, addTime);
    }

    @Override
    public int addTeacher(String name, String shortIntroduce, String introduce, String addTime, String image, String courseIntroduce) {
        return teacherControllerMapper.addTeacher(name, shortIntroduce, introduce, addTime, image, courseIntroduce);
    }

    @Override
    public int updateTeacher(int ID, String name, String shortIntroduce, String introduce,String image, String courseIntroduce) {
        return teacherControllerMapper.updateTeacher(ID, name, shortIntroduce, introduce, image, courseIntroduce);
    }

    @Override
    public int deleteTeacher(int ID) {
        return teacherControllerMapper.deleteTeacher(ID);
    }
}
