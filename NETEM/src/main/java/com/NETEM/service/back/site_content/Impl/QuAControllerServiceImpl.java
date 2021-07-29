package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.QuAControllerMapper;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.QuAControllerService;

import java.util.List;

/**
 * 2021年7月18日22:06:30
 *
 * @author Lyon
 */
public class QuAControllerServiceImpl implements QuAControllerService {

    private QuAControllerMapper quAControllerMapper;

    public void setQuAControllerMapper(QuAControllerMapper quAControllerMapper) {
        this.quAControllerMapper = quAControllerMapper;
    }

    @Override
    public List<Community> getQAs(int page) {
        System.out.println("++++++++++++++++++"+(page-1)*6);
        return quAControllerMapper.getQAs((page-1)*6);
    }

    @Override
    public List<Community> searchQA(int ID, String userId, String title, String content, String addTime) {
        return quAControllerMapper.searchQA(ID, userId, title, content, addTime);
    }

    @Override
    public List<Community> deleteQA(int ID) {
        return quAControllerMapper.deleteQA(ID);
    }

    @Override
    public List<Community> updateQA(int ID, String userId, String title, String content) {
        return quAControllerMapper.updateQA(ID, userId, title, content);
    }
}
