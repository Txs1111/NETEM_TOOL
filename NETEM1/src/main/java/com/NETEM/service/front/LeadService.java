package com.NETEM.service.front;

import com.NETEM.pojo.lead.Lead_User;

import java.util.List;

/**
 * 2021年7月12日15:14:23
 *
 * @author Lyon
 */
public interface LeadService {
    /**
     * 获取考研目的部分内容
     *
     * @return
     */
    List<Lead_User> getAim();

    /**
     * 获取所有考研目的部分内容
     *
     * @return
     */
    List<Lead_User> getAllAim();

    /**
     * 获取考研雷区部分内容
     *
     * @return
     */
    List<Lead_User> getBomb();

    /**
     * 获取所有考研雷区部分内容
     *
     * @return
     */
    List<Lead_User> getAllBomb();

    /**
     * 获取考研经验部分内容
     *
     * @return
     */
    List<Lead_User> getEXP();

    /**
     * 获取所有考研经验部分内容
     *
     * @return
     */
    List<Lead_User> getAllEXP();

    /**
     * 用户发布内容
     *
     * @param type
     * @param userId
     * @param content
     * @param time
     * @return
     */
    int addLead(int type, String userId, String content, String time);

}
