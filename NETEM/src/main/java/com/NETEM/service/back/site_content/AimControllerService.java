package com.NETEM.service.back.site_content;

import com.NETEM.pojo.lead.Lead_User;

import java.util.List;

/**
 * 2021年7月18日21:43:50
 *
 * @author Lyon
 */
public interface AimControllerService {
    /**
     * 获取所有考研目的信息
     *
     * @param page
     * @return
     */
    List<Lead_User> getAims(int page);

    /**
     * 搜索符合条件的考研目的数据
     *
     * @param ID
     * @param userId
     * @param addTime
     * @param content
     * @return
     */
    List<Lead_User> searchAim(int ID, String userId, String content, String addTime);

    /**
     * 删除考研目的
     *
     * @param ID
     * @return
     */
    List<Lead_User> deleteAim(int ID);

    /**
     * 修改考研目的
     *
     * @param ID
     * @param userId
     * @param content
     * @return
     */
    List<Lead_User> updateAim(int ID, String userId, String content);
}
