package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.information.InformationMapper;
import com.NETEM.pojo.information.Information;
import com.NETEM.pojo.information.Outline;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.pojo.information.Teacher;
import com.NETEM.service.front.InformationService;

import java.util.List;

/**
 * 2021年7月13日11:12:10
 *
 * @author Lyon
 */
public class InformationServiceImpl implements InformationService {

    private InformationMapper informationMapper;

    public void setInformationMapper(InformationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }

    @Override
    public List<Information> getRank() {
        return informationMapper.getRank();
    }

    @Override
    public Information getRankByID(int ID) {
        return informationMapper.getRankByID(ID);
    }

    @Override
    public List<Information> getMark() {
        return informationMapper.getMark();
    }

    @Override
    public Information getMarkByID(int ID) {
        return informationMapper.getRankByID(ID);
    }

    @Override
    public List<Information> getAdmission() {
        return informationMapper.getAdmission();
    }

    @Override
    public Information getAdmissionByID(int ID) {
        return informationMapper.getAdmissionByID(ID);
    }

    @Override
    public List<Outline> getOutline() {
        return informationMapper.getOutline();
    }

    @Override
    public Outline getOutlineByID(int ID) {
        return informationMapper.getOutlineByID(ID);
    }

    @Override
    public List<RealExam> getRealExam() {
        return informationMapper.getRealExam();
    }

    @Override
    public RealExam getRealExamByID(int ID) {
        return informationMapper.getRealExamByID(ID);
    }

    @Override
    public List<Teacher> getTeacher() {
        return informationMapper.getTeacher();
    }

    @Override
    public Teacher getTeacherByID(int ID) {
        return informationMapper.getTeacherByID(ID);
    }

    @Override
    public List<Information> getAllRank() {
        return informationMapper.getAllRank();
    }

    @Override
    public List<Information> getAllMark() {
        return informationMapper.getAllMark();
    }

    @Override
    public List<Information> getAllAdmission() {
        return informationMapper.getAllAdmission();
    }

    @Override
    public List<Outline> getAllOutline() {
        return informationMapper.getAllOutline();
    }

    @Override
    public List<RealExam> getAllRealExam() {
        return informationMapper.getAllRealExam();
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return informationMapper.getAllTeacher();
    }

    @Override
    public List<Information> searchRank(String search) {
        return informationMapper.searchRank(search);
    }

    @Override
    public List<Information> searchMark(String search) {
        return informationMapper.searchMark(search);
    }

    @Override
    public List<Information> searchAdmission(String search) {
        return informationMapper.searchAdmission(search);
    }

    @Override
    public List<Outline> searchOutline(String search) {
        return informationMapper.searchOutline(search);
    }

    @Override
    public List<RealExam> searchReal_exam(String search) {
        return informationMapper.searchReal_exam(search);
    }

    @Override
    public List<Teacher> searchTeacher(String search) {
        return informationMapper.searchTeacher(search);
    }

}
