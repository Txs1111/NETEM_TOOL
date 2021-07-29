package com.NETEM.mapper.front.community;

import com.NETEM.pojo.community.Response;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Responsemapper {
    @Select("select * from stuma_netem_response where postId=#{postId} ORDER by addtime desc")
    public List<Response> findResponse(int postId);

    @Insert("insert into stuma_netem_response values(#{ID},#{postId},#{fId},#{userId},#{content},#{addTime})")
    public void addResponse(Response response);
}
