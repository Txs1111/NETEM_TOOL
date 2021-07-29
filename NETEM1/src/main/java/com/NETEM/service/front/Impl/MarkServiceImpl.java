package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.mark.MarkMapper;
import com.NETEM.pojo.mark.Mark;
import com.NETEM.service.front.MarkService;

import java.util.List;

/**
 * 2021年7月14日15:39:35
 *
 * @author Lyon
 */
public class MarkServiceImpl implements MarkService {

    private MarkMapper markMapper;

    public void setMarkMapper(MarkMapper markMapper) {
        this.markMapper = markMapper;
    }

    @Override
    public List<String> getAllClass(String major) {
        return markMapper.getAllClass(major);
    }

    @Override
    public List<String> getAllMajor() {
        return markMapper.getAllMajor();
    }

    @Override
    public List<String> getAllCollege() {
        return markMapper.getAllCollege();
    }

    @Override
    public List<Mark> getMassage(String major, int markLine) {
        return markMapper.getMassage(major, markLine);
    }

    @Override
    public List<Mark> count(String college, String love) {
        return markMapper.count(college,love);
    }

    @Override
    public List<String> getCollege(String major, String majorSubject, int markLine) {
        return markMapper.getCollege(major,majorSubject,markLine);
    }

    @Override
    public List<Mark> getColleges(String major , String name) {
        return markMapper.getColleges(major,name);
    }


}
