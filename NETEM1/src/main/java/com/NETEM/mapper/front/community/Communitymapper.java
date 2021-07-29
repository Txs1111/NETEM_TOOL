package com.NETEM.mapper.front.community;

import com.NETEM.pojo.community.Community;
import com.NETEM.pojo.community.Response;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Communitymapper {

    @Select("select * from stuma_netem_community where type=1 order by likes desc limit 5")
    public List<Community> findCommunication();

    @Select("select * from stuma_netem_community where type=2 order by likes desc limit 5")
    public List<Community> findCommunityresource();

    @Select("select * from stuma_netem_community where type=3 order by likes desc limit 5")
    public List<Community> findCommunityQA();

    @Select("select * from stuma_netem_community where ID=#{ID}")
    public Community findoneById(int ID);

    @Select("select * from stuma_netem_response ")
    public Response findResponse(int postId);

    @Insert("insert into  values()")
    public void savePost(int ID, int fId, String userId, String content,String time);
}
