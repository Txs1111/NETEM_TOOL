package com.NETEM.service.back.site_content;


import com.NETEM.pojo.community.Community;

import java.util.List;

/**
 * 2021年7月18日21:56:49
 *
 * @author Lyon
 */
public interface CommunityResourceService {
    /**
     * 获取所有社区资源
     *
     * @param page
     * @return
     */
    List<Community> getResources(int page);

    /**
     * 查询所有符合条件的社区资源
     *
     * @param ID
     * @param userId
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Community> searchResource(int ID, String userId, String title, String content, String addTime);

    /**
     * 删除社区资源
     *
     * @param ID
     * @return
     */
    List<Community> deleteResource(int ID);

    /**
     * 更新社区资源
     *
     * @param ID
     * @param userId
     * @param title
     * @param content
     * @return
     */
    List<Community> updateResource(int ID, String userId, String title, String content);
}
