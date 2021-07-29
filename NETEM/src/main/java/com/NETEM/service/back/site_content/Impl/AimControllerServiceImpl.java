package com.NETEM.service.back.site_content.Impl;

import com.NETEM.mapper.back.site_content.AimControllerMapper;
import com.NETEM.pojo.lead.Lead_User;
import com.NETEM.service.back.site_content.AimControllerService;

import java.util.List;

/**
 * 2021年7月18日21:45:03
 *
 * @author Lyon
 */
public class AimControllerServiceImpl implements AimControllerService {
    private AimControllerMapper aimControllerMapper;

    public void setAimControllerMapper(AimControllerMapper aimControllerMapper) {
        this.aimControllerMapper = aimControllerMapper;
    }

    @Override
    public List<Lead_User> getAims(int page) {
        return aimControllerMapper.getAims((page-1)*6);
    }

    @Override
    public List<Lead_User> searchAim(int ID, String userId, String content, String addTime) {
        return aimControllerMapper.searchAim(ID, userId, content, addTime);
    }

    @Override
    public List<Lead_User> deleteAim(int ID) {
        return aimControllerMapper.deleteAim(ID);
    }

    @Override
    public List<Lead_User> updateAim(int ID, String userId, String content) {
        return aimControllerMapper.updateAim(ID, userId, content);
    }
}
