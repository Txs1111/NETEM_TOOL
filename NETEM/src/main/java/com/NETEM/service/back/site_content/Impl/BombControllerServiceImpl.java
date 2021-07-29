package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.BombControllerMapper;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.BombControllerService;

import java.util.List;

/**
 * 2021年7月18日21:50:04
 *
 * @author Lyon
 */
public class BombControllerServiceImpl implements BombControllerService {
    private BombControllerMapper bombControllerMapper;

    public void setBombControllerMapper(BombControllerMapper bombControllerMapper) {
        this.bombControllerMapper = bombControllerMapper;
    }

    @Override
    public List<Lead_User> getBombs(int page) {
        return bombControllerMapper.getBombs((page-1)*6);
    }

    @Override
    public List<Lead_User> searchBomb(int ID, String userId, String content, String addTime) {
        return bombControllerMapper.searchBomb(ID, userId, content, addTime);
    }

    @Override
    public List<Lead_User> deleteBomb(int ID) {
        return bombControllerMapper.deleteBomb(ID);
    }

    @Override
    public List<Lead_User> updateBomb(int ID, String userId, String content) {
        return bombControllerMapper.updateBomb(ID, userId, content);
    }
}
