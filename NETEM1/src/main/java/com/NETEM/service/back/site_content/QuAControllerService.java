package com.NETEM.service.back.site_content;

import com.NETEM.pojo.community.Community;

import java.util.List;

/**
 * 2021年7月18日22:04:54
 *
 * @author Lyon
 */
public interface QuAControllerService {
    /**
     * 获取所有社区问答
     *
     * @param page
     * @return
     */
    List<Community> getQAs(int page);

    /**
     * 查询所有符合条件的社区问答
     *
     * @param ID
     * @param userId
     * @param title
     * @param addTime
     * @param content
     * @return
     */
    List<Community> searchQA(int ID, String userId, String title, String content, String addTime);

    /**
     * 删除社区问答
     *
     * @param ID
     * @return
     */
    List<Community> deleteQA(int ID);

    /**
     * 更新社区问答
     *
     * @param ID
     * @param userId
     * @param title
     * @param content
     * @return
     */
    List<Community> updateQA(int ID, String userId, String title, String content);
}
