package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.RankControllerMapper;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.RankControllerService;

import java.util.List;

/**
 * 2021年7月18日21:15:44
 *
 * @author Lyon
 */
public class RankControllerServiceImpl implements RankControllerService {
    private RankControllerMapper rankControllerMapper;

    public void setRankControllerMapper(RankControllerMapper rankControllerMapper) {
        this.rankControllerMapper = rankControllerMapper;
    }

    @Override
    public List<Information> getRanks(int page) {
        return rankControllerMapper.getRanks((page-1)*6);
    }

    @Override
    public List<Information> searchRanks(String ID, String title, String content, String addTime) {
        return rankControllerMapper.searchRanks(ID, title, content, addTime);
    }

    @Override
    public int addRank(String title, String content, String addTime, String image) {
        return rankControllerMapper.addRank(title,content,addTime,image);
    }

    @Override
    public int updateRank(int ID, String title, String content,String image) {
        return rankControllerMapper.updateRank(ID, title, content,image);
    }

    @Override
    public int deleteRank(int ID) {
        return rankControllerMapper.deleteRank(ID);
    }
}
