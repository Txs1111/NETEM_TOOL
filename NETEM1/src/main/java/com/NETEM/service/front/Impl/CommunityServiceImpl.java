package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.community.Communitymapper;
import com.NETEM.pojo.community.Community;
import com.NETEM.service.front.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private Communitymapper communitymapper;

    public void setCommunitymapper(Communitymapper communitymapper) {
        this.communitymapper = communitymapper;
    }

    @Override
    public List<Community> findCommunication() {
        return communitymapper.findCommunication();
    }

    @Override
    public Community findone(int ID) {
        return communitymapper.findoneById(ID);
    }

    @Override
    public List<Community> findCommunityresource() {
        return communitymapper.findCommunityresource();
    }

    @Override
    public List<Community> findCommunityQA() {
        return communitymapper.findCommunityQA();
    }


}

