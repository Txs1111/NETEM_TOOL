package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.Information;

import java.util.List;

/**
 * 2021年7月18日21:24:42
 *
 * @author Lyon
 */
public interface ReportControllerService {
    /**
     * 获取所有学校报录信息
     *
     * @param page
     * @return
     */
    List<Information> getReports(int page);

    /**
     * 搜索符合条件的学校报录数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Information> searchReport(String ID, String title, String content, String addTime);

    /**
     * 添加学校报录
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    int addReport(String title, String content, String addTime, String image);

    /**
     * 修改学校报录
     *
     * @param ID
     * @param title
     * @param content
     * @param image
     * @return
     */
    int updateReport(int ID, String title, String content, String image);

    /**
     * 删除学校报录
     *
     * @param ID
     * @return
     */
    int deleteReport(int ID);
}
