package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.RealExamControllerMapper;
import com.NETEM.pojo.information.RealExam;
import com.NETEM.service.back.resource_controller.RealExamControllerService;

import java.util.List;

/**
 * 2021年7月18日21:22:44
 *
 * @author Lyon
 */
public class RealExamControllerServiceImpl implements RealExamControllerService {

    private RealExamControllerMapper realExamControllerMapper;

    public void setRealExamControllerMapper(RealExamControllerMapper realExamControllerMapper) {
        this.realExamControllerMapper = realExamControllerMapper;
    }

    @Override
    public List<RealExam> getRealExams(int page) {
        return realExamControllerMapper.getRealExams((page - 1) * 6);
    }

    @Override
    public List<RealExam> searchRealExams(String ID, String title, String yearTime, String addTime) {
        return realExamControllerMapper.searchRealExams(ID, title, yearTime, addTime);
    }

    @Override
    public int addRealExam(String title, String yearTime, String addTime, String url) {
        return realExamControllerMapper.addRealExam(title, yearTime, addTime, url);
    }

    @Override
    public int updateRealExam(int ID, String title, String yearTime, String url) {
        return realExamControllerMapper.updateRealExam(ID, title, yearTime, url);
    }

    @Override
    public int deleteRealExam(int ID) {
        return realExamControllerMapper.deleteRealExam(ID);
    }
}
