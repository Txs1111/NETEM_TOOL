package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.RealExam;

import java.util.List;

/**
 * 2021年7月18日21:19:56
 *
 * @author Lyon
 */
public interface RealExamControllerService {
    /**
     * 获取所有历年真题信息
     *
     * @param page
     * @return
     */
    List<RealExam> getRealExams(int page);

    /**
     * 搜索符合条件的历年真题数据
     *
     * @param ID
     * @param title
     * @param content
     * @param yearTime
     * @param addTime
     * @return
     */
    List<RealExam> searchRealExams(String ID, String title, String yearTime, String addTime);

    /**
     * 添加历年真题
     *
     * @param title
     * @param yearTime
     * @param addTime
     * @param url
     * @return
     */
    int addRealExam(String title, String yearTime, String addTime, String url);

    /**
     * 修改历年真题
     *
     * @param ID
     * @param title
     * @param yearTime
     * @param url
     * @return
     */
    int updateRealExam(int ID, String title, String yearTime, String url);

    /**
     * 删除历年真题
     *
     * @param ID
     * @return
     */
    int deleteRealExam(int ID);
}
