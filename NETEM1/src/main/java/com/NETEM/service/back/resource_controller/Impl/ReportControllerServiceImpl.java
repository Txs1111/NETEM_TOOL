package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.ReportControllerMapper;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.ReportControllerService;

import java.util.List;

/**
 * 2021年7月18日21:26:40
 *
 * @author Lyon
 */
public class ReportControllerServiceImpl implements ReportControllerService {
    private ReportControllerMapper reportControllerMapper;

    public void setReportControllerMapper(ReportControllerMapper reportControllerMapper) {
        this.reportControllerMapper = reportControllerMapper;
    }

    @Override
    public List<Information> getReports(int page) {
        return reportControllerMapper.getReports((page-1)*6);
    }

    @Override
    public List<Information> searchReport(String ID, String title, String content, String addTime) {
        return reportControllerMapper.searchReport(ID, title, content, addTime);
    }

    @Override
    public int addReport(String title, String content, String addTime, String image) {
        return reportControllerMapper.addReport(title,content,addTime,image);
    }
    @Override
    public int updateReport(int ID, String title, String content,String image) {
        return reportControllerMapper.updateReport(ID, title, content,image);
    }

    @Override
    public int deleteReport(int ID) {
        return reportControllerMapper.deleteReport(ID);
    }
}
