package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.TermControllerMapper;
import com.NETEM.pojo.lead.Term;
import com.NETEM.service.back.resource_controller.TermControllerService;

import java.util.List;

/**
 * 2021年7月18日21:41:24
 *
 * @author Lyon
 */
public class TermControllerServiceImpl implements TermControllerService {

    private TermControllerMapper termControllerMapper;

    public void setTermControllerMapper(TermControllerMapper termControllerMapper) {
        this.termControllerMapper = termControllerMapper;
    }

    @Override
    public List<Term> getTerms(int page) {
        return termControllerMapper.getTerms((page-1)*6);
    }

    @Override
    public List<Term> searchTerm(String ID, String name, String addTime) {
        return termControllerMapper.searchTerm(ID, name, addTime);
    }

    @Override
    public int addTerm(String name, String content, String addTime) {
        return termControllerMapper.addTerm(name,content,addTime);
    }

    @Override
    public int updateTerm(int ID, String name, String content) {
        return termControllerMapper.updateTerm(ID, name, content);
    }

    @Override
    public int deleteTerm(int ID) {
        return termControllerMapper.deleteTerm(ID);
    }
}
