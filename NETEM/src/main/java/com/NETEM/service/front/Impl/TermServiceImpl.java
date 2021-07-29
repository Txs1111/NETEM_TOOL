package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.lead.TermMapper;
import com.NETEM.pojo.lead.Term;
import com.NETEM.service.front.TermService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 2021年7月12日09:23:11
 *
 * @author Lyon
 */
public class TermServiceImpl implements TermService {
    private TermMapper termMapper;
    static int amount = -1;

    public void setTermMapper(TermMapper termMapper) {
        this.termMapper = termMapper;
    }

    /**
     * 生成所有标签
     *
     * @return
     */
    @Override
    public List<Term> getAllTerm() {
        List<Term> terms = new ArrayList<Term>();
        terms = termMapper.getAllTerm();
        amount = terms.size();
        return terms;
    }

    /**
     * 查询一个标签
     *
     * @param id
     * @return
     */
    @Override
    public Term getOneTerm(int id) {
        return termMapper.getOneTerm(id);
    }

    /**
     * 生成随机九个术语
     *
     * @return
     */
    @Override
    public List<Term> get9Term() {
        if (amount == -1) {
            List<Term> terms = new ArrayList<Term>();
            terms = termMapper.getAllTerm();
            amount = terms.size();
        }
        Random random = new Random();
        int random1 = random.nextInt(amount) + 1;
        int random2, random3, random4, random5, random6, random7, random8, random9;
        do {
            random2 = random.nextInt(amount) + 1;
        } while (random1 == random2);
        do {
            random3 = random.nextInt(amount) + 1;
        } while (random3 == random2 || random1 == random3);
        do {
            random4 = random.nextInt(amount) + 1;
        } while (random4 == random1 || random4 == random2 || random4 == random3);
        do {
            random5 = random.nextInt(amount) + 1;
        } while (random5 == random1 || random5 == random2 || random5 == random3 || random5 == random4);
        do {
            random6 = random.nextInt(amount) + 1;
        } while (random6 == random1 || random6 == random2 || random6 == random3 || random6 == random4 || random6 == random5);
        do {
            random7 = random.nextInt(amount) + 1;
        } while (random7 == random1 || random7 == random2 || random7 == random3 || random7 == random4 || random7 == random5 || random7 == random6);
        do {
            random8 = random.nextInt(amount) + 1;
        } while (random8 == random1 || random8 == random2 || random8 == random3 || random8 == random4 || random8 == random5 || random8 == random6 || random8 == random7);
        do {
            random9 = random.nextInt(amount) + 1;
        } while (random9 == random1 || random9 == random2 || random9 == random3 || random9 == random4 || random9 == random5 || random9 == random6 || random9 == random7 || random9 == random8);

        return termMapper.get3Term(random1, random2, random3, random4, random5, random6, random7, random8, random9);
    }

    @Override
    public List<Term> searchTerms(String content) {
        List<Term> terms = termMapper.searchTerms(content);
        return terms;
    }

}
