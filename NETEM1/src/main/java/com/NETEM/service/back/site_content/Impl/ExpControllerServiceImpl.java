package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.ExpControllerMapper;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.ExpControllerService;

import java.util.List;

/**
 * 2021年7月18日22:02:27
 *
 * @author Lyon
 */
public class ExpControllerServiceImpl implements ExpControllerService {

    private ExpControllerMapper expControllerMapper;

    public void setExpControllerMapper(ExpControllerMapper expControllerMapper) {
        this.expControllerMapper = expControllerMapper;
    }

    @Override
    public List<Lead_User> getExps(int page) {
        return expControllerMapper.getExps((page-1)*6);
    }

    @Override
    public List<Lead_User> searchExp(int ID, String userId, String content, String addTime) {
        return expControllerMapper.searchExp(ID, userId, content, addTime);
    }

    @Override
    public List<Lead_User> deleteExp(int ID) {
        return expControllerMapper.deleteExp(ID);
    }

    @Override
    public List<Lead_User> updateExp(int ID, String userId, String content) {
        return expControllerMapper.updateExp(ID, userId, content);
    }
}
