package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.CommunityResourceMapper;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.back.site_content.CommunityResourceService;

import java.util.List;

/**
 * 2021年7月18日21:58:46
 *
 * @author Lyon
 */
public class CommunityResourceServiceImpl implements CommunityResourceService {

    private CommunityResourceMapper communityResourceMapper;

    public void setCommunityResourceMapper(CommunityResourceMapper communityResourceMapper) {
        this.communityResourceMapper = communityResourceMapper;
    }

    @Override
    public List<Community> getResources(int page) {
        return communityResourceMapper.getResources((page-1)*6);
    }

    @Override
    public List<Community> searchResource(int ID, String userId, String title, String content, String addTime) {
        return communityResourceMapper.searchResource(ID, userId, title, content, addTime);
    }

    @Override
    public List<Community> deleteResource(int ID) {
        return communityResourceMapper.deleteResource(ID);
    }

    @Override
    public List<Community> updateResource(int ID, String userId, String title, String content) {
        return communityResourceMapper.updateResource(ID, userId, title, content);
    }
}
