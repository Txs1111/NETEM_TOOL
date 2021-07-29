package com.NETEM.service.back.site_content;

import com.NETEM.pojo.lead.Lead_User;

import java.util.List;

/**
 * 2021年7月18日21:47:30
 *
 * @author Lyon
 */
public interface BombControllerService {
    /**
     * 获取所有考研雷区信息
     *
     * @param page
     * @return
     */
    List<Lead_User> getBombs(int page);

    /**
     * 搜索符合条件的考研雷区数据
     *
     * @param ID
     * @param userId
     * @param addTime
     * @param content
     * @return
     */
    List<Lead_User> searchBomb(int ID, String userId, String content, String addTime);

    /**
     * 删除考研雷区
     *
     * @param ID
     * @return
     */
    List<Lead_User> deleteBomb(int ID);

    /**
     * 修改考研雷区
     *
     * @param ID
     * @param userId
     * @param content
     * @return
     */
    List<Lead_User> updateBomb(int ID, String userId, String content);
}
