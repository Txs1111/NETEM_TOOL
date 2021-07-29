package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.information.Information;

import java.util.List;

/**
 * 2021年7月18日21:11:26
 *
 * @author Lyon
 */
public interface RankControllerService {
    /**
     * 获取所有院校排名信息
     *
     * @param page
     * @return
     */
    List<Information> getRanks(int page);

    /**
     * 搜索符合条件的院校排名数据
     *
     * @param ID
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Information> searchRanks(String ID, String title, String content, String addTime);

    /**
     * 添加院校排名
     *
     * @param title
     * @param content
     * @param addTime
     * @param image
     * @return
     */
    int addRank( String title, String content, String addTime, String image);

    /**
     * 修改院校排名
     *
     * @param ID
     * @param title
     * @param content
     * @param image
     * @return
     */
    int updateRank(int ID, String title, String content,String image);

    /**
     * 删除院校排名
     *
     * @param ID
     * @return
     */
    int deleteRank(int ID);
}
