package com.NETEM.service.back.resource_controller;

import com.NETEM.pojo.lead.Term;

import java.util.List;

/**
 * 2021年7月18日21:39:53
 *
 * @author Lyon
 */
public interface TermControllerService {
    /**
     * 获取所有术语
     *
     * @param page
     * @return
     */
    List<Term> getTerms(int page);

    /**
     * 搜索符合条件的术语
     *
     * @param ID
     * @param name
     * @param addTime
     * @return
     */
    List<Term> searchTerm(String ID, String name, String addTime);

    /**
     * 增加术语
     *
     * @param name
     * @param content
     * @param addTime
     * @return
     */
    int addTerm(String name, String content, String addTime);

    /**
     * 修改术语
     *
     * @param ID
     * @param name
     * @param content
     * @return
     */
    int updateTerm(int ID, String name, String content);

    /**
     * 删除术语
     *
     * @param ID
     * @return
     */
    int deleteTerm(int ID);
}
