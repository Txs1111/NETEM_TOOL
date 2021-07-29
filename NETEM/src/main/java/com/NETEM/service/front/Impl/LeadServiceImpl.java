package com.NETEM.service.front.Impl;

import com.NETEM.mapper.front.lead.LeadMapper;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.front.LeadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 2021年7月13日09:21:46
 *
 * @author Lyon
 */
public class LeadServiceImpl implements LeadService {
    @Autowired
    private LeadMapper leadMapper;

    public void setLeadMapper(LeadMapper leadMapper) {
        this.leadMapper = leadMapper;
    }

    @Override
    public List<Lead_User> getAim() {
        return leadMapper.getAim(0, 2);
    }

    @Override
    public List<Lead_User> getAllAim() {
        return leadMapper.getAllAim();
    }

    @Override
    public List<Lead_User> getBomb() {
        return leadMapper.getBomb(0, 2);
    }

    @Override
    public List<Lead_User> getAllBomb() {
        return leadMapper.getAllBomb();
    }

    @Override
    public List<Lead_User> getEXP() {
        return leadMapper.getEXP(0, 2);
    }

    @Override
    public List<Lead_User> getAllEXP() {
        return leadMapper.getAllEXP();
    }

    @Override
    public int addLead(int type, String userId, String content, String time) {
        return leadMapper.addLead(type, userId, content, time);
    }


}
