package com.NETEM.service.front;

import com.NETEM.pojo.community.Community;

import java.util.List;

public interface CommunityService {


    public List<Community> findCommunication();

    public Community findone(int ID);

    List<Community> findCommunityresource();

    List<Community> findCommunityQA();

}
