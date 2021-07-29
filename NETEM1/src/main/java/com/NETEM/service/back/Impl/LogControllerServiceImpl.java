package com.NETEM.service.back.Impl;

import com.NETEM.mapper.back.LogControllerMapper;
import com.NETEM.pojo.Log;
import com.NETEM.service.back.LogControllerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 2021年7月18日20:43:54
 *
 * @author Lyon
 */
public class LogControllerServiceImpl implements LogControllerService {
    @Autowired
    private LogControllerMapper logControllerMapper;

    public void setLogControllerMapper(LogControllerMapper logControllerMapper) {
        this.logControllerMapper = logControllerMapper;
    }

    @Override
    public List<Log> getLogs(int page) {
        return logControllerMapper.getLogs((page-1)*6);
    }

    @Override
    public List<Log> searchLogs(String ID, String userName, String studentCode1, String where, String describe, String addTime, String consumeTime) {
        return logControllerMapper.searchLogs(ID, userName, studentCode1, where, describe, addTime, consumeTime);
    }

    @Override
    public int insertLog(String addTime, String consumeTime, String where) {
        return logControllerMapper.insertLog(addTime,consumeTime,where);
    }
}
