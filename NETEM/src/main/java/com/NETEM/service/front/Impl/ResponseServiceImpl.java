package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.community.Responsemapper;
import com.NETEM.pojo.community.Response;
import com.NETEM.service.front.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResponseServiceImpl implements ResponseService {
    @Autowired
    private Responsemapper responsemapper;

    @Override
    public List<Response> findResponse(int postId) {
        List<Response> responses = responsemapper.findResponse(postId);

        return responses;
    }

    @Override
    public void addResponse(int postId,int responseID,String userId, String content) {
        Response response = new Response();
        response.setFId(postId);
        response.setPostId(responseID);
        response.setUserId(userId);
        response.setContent(content);
        response.setAddTime(new Date());
        System.out.println(response);
        responsemapper.addResponse(response);
    }
}
