package com.NETEM.service.front;

import com.NETEM.pojo.community.Response;

import java.util.List;
public interface ResponseService {

    public List<Response> findResponse(int postId);

    public void addResponse(int fid,int postid,String userId,String content);
}
