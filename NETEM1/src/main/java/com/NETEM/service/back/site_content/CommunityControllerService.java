package com.NETEM.service.back.site_content;

import com.NETEM.pojo.community.Community;

import java.util.List;

/**
 * 2021年7月18日21:52:10
 *
 * @author Lyon
 */
public interface CommunityControllerService {
    /**
     * 获取所有社区交流
     *
     * @param page
     * @return
     */
    List<Community> getCommunitys(int page);

    /**
     * 查询所有符合条件的社区交流
     *
     * @param ID
     * @param userId
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Community> searchCommunity(int ID, String userId, String title, String content, String addTime);

    /**
     * 删除社区交流
     *
     * @param ID
     * @return
     */
    List<Community> deleteCommunity(int ID);

    /**
     * 更新社区交流
     *
     * @param ID
     * @param userId
     * @param title
     * @param content
     * @return
     */
    List<Community> updateCommunity(int ID, String userId, String title, String content);
}
