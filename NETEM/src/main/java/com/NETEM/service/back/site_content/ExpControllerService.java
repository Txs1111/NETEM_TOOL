package com.NETEM.service.back.site_content;

import com.NETEM.pojo.lead.Lead_User;

import java.util.List;

/**
 * 2021年7月18日22:01:20
 *
 * @author Lyon
 */
public interface ExpControllerService {
    /**
     * 获取所有考研经验信息
     *
     * @param page
     * @return
     */
    List<Lead_User> getExps(int page);

    /**
     * 搜索符合条件的考研经验数据
     *
     * @param ID
     * @param userId
     * @param addTime
     * @param content
     * @return
     */
    List<Lead_User> searchExp(int ID, String userId, String content, String addTime);

    /**
     * 删除考研经验
     *
     * @param ID
     * @return
     */
    List<Lead_User> deleteExp(int ID);

    /**
     * 修改考研经验
     *
     * @param ID
     * @param userId
     * @param content
     * @return
     */
    List<Lead_User> updateExp(int ID, String userId, String content);
}
