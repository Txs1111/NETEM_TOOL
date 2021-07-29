package com.NETEM.service.front;

import com.NETEM.pojo.lead.Term;

import java.util.List;


/**
 * 2021年7月10日12:41:35
 *
 * @author Lyon
 */
public interface TermService {
    /**
     * 获取所有标签
     *
     * @return
     */
    List<Term> getAllTerm();

    /**
     * 获取一个术语
     *
     * @return
     */
    Term getOneTerm(int id);


    /**
     * 获取九个术语
     *
     * @return
     */
    List<Term> get9Term();
    /**
     * 查找符合添加的术语
     *
     * @param content
     * @return
     */
    public List<Term> searchTerms(String content);
}
