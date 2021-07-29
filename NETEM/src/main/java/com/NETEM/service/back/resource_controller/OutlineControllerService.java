package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.Outline;

import java.util.List;

/**
 * 2021年7月18日20:48:46
 *
 * @author Lyon
 */
public interface OutlineControllerService {
    /**
     * 获取所有考试大纲信息
     *
     * @param page
     * @return
     */
    List<Outline> getOutlines(int page);

    /**
     * 搜索符合条件的考试大纲数据
     *
     * @param ID
     * @param title
     * @param content
     * @param yearTime
     * @param resource
     * @param addTime
     * @return
     */
    List<Outline> searchOutlines(String ID, String title, String content, String yearTime, String resource, String addTime);

    /**
     * 添加考试大纲
     *
     * @param title
     * @param content
     * @param yearTime
     * @param addTime
     * @param resource
     * @param image
     * @return
     */
    int addOutline(String title, String content, String yearTime, String addTime, String resource, String image);

    /**
     * 修改考试大纲
     *
     * @param ID
     * @param title
     * @param content
     * @param yearTime
     * @param resource
     * @param image
     * @return
     */
    int updateOutline(int ID, String title, String content, String yearTime, String resource, String image);

    /**
     * 删除考试大纲
     *
     * @param ID
     * @return
     */
    int deleteOutline(int ID);
}
