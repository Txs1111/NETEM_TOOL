package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.ScoreControllerMapper;
import com.NETEM.pojo.information.Information;
import com.NETEM.service.back.resource_controller.ScoreControllerService;

import java.util.List;

/**
 * 2021年7月18日21:32:46
 *
 * @author Lyon
 */
public class ScoreControllerServiceImpl implements ScoreControllerService {
    private ScoreControllerMapper scoreControllerMapper;

    public void setScoreControllerMapper(ScoreControllerMapper scoreControllerMapper) {
        this.scoreControllerMapper = scoreControllerMapper;
    }

    @Override
    public List<Information> getScores(int page) {
        return scoreControllerMapper.getScores((page-1)*6);
    }

    @Override
    public List<Information> searchScore(String ID, String title, String content, String addTime) {
        return scoreControllerMapper.searchScore(ID, title, content, addTime);
    }

    @Override
    public int addScore(String title, String content, String addTime, String image) {
        return scoreControllerMapper.addScore(title,content,addTime,image);
    }

    @Override
    public int updateScore(int ID, String title, String content,String image) {
        return scoreControllerMapper.updateScore(ID, title, content,image);
    }

    @Override
    public int deleteScore(int ID) {
        return scoreControllerMapper.deleteScore(ID);
    }
}
