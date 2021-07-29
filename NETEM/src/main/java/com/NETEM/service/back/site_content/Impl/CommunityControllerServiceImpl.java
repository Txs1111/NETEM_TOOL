package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.CommunityControllerMapper;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.CommunityControllerService;

import java.util.List;

/**
 * 2021年7月18日21:54:45
 *
 * @author Lyon
 */
public class CommunityControllerServiceImpl implements CommunityControllerService {
    private CommunityControllerMapper communityControllerMapper;

    public void setCommunityControllerMapper(CommunityControllerMapper communityControllerMapper) {
        this.communityControllerMapper = communityControllerMapper;
    }

    @Override
    public List<Community> getCommunitys(int page) {
        return communityControllerMapper.getCommunitys((page-1)*6);
    }

    @Override
    public List<Community> searchCommunity(int ID, String userId, String title, String content, String addTime) {
        return communityControllerMapper.searchCommunity(ID, userId, title, content, addTime);
    }

    @Override
    public List<Community> deleteCommunity(int ID) {
        return communityControllerMapper.deleteCommunity(ID);
    }

    @Override
    public List<Community> updateCommunity(int ID, String userId, String title, String content) {
        return communityControllerMapper.updateCommunity(ID, userId, title, content);
    }
}
