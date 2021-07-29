package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.Information;

import java.util.List;

/**
 * 2021年7月18日21:31:03
 *
 * @author Lyon
 */
public interface ScoreControllerService {
    /**
     * 获取所有历年分数信息
     *
     * @param page
     * @return
     */
    List<Information> getScores(int page);

    /**
     * 搜索符合条件的历年分数数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Information> searchScore(String ID, String title, String content, String addTime);

    /**
     * 添加历年分数
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    int addScore(String title, String content, String addTime, String image);

    /**
     * 修改历年分数
     *
     * @param ID
     * @param title
     * @param content
     * @param image
     * @return
     */
    int updateScore(int ID, String title, String content, String image);

    /**
     * 删除历年分数
     *
     * @param ID
     * @return
     */
    int deleteScore(int ID);
}
