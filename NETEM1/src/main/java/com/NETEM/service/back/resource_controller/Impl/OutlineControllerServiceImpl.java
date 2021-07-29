package com.NETEM.service.back.resource_controller.Impl;

import com.NETEM.mapper.back.resource_controller.OutlineControllerMapper;
import com.NETEM.pojo.information.Outline;
import com.NETEM.service.back.resource_controller.OutlineControllerService;

import java.util.List;

/**
 * 2021年7月18日20:56:12
 *
 * @author Lyon
 */
public class OutlineControllerServiceImpl implements OutlineControllerService {

    private OutlineControllerMapper outlineControllerMapper;

    public void setOutlineControllerMapper(OutlineControllerMapper outlineControllerMapper) {
        this.outlineControllerMapper = outlineControllerMapper;
    }

    @Override
    public List<Outline> getOutlines(int page) {
        return outlineControllerMapper.getOutlines((page-1)*6);
    }

    @Override
    public List<Outline> searchOutlines(String ID, String title, String content, String yearTime, String resource, String addTime) {
        return outlineControllerMapper.searchOutlines(ID, title, content, yearTime, resource, addTime);
    }

    @Override
    public int addOutline(String title, String content, String yearTime,String addTime, String resource, String image) {
        return outlineControllerMapper.addOutline(title, content, yearTime,addTime, resource,image);
    }

    @Override
    public int updateOutline(int ID, String title, String content, String yearTime, String resource,String image) {
        return outlineControllerMapper.updateOutline(ID, title, content, yearTime, resource,image);
    }

    @Override
    public int deleteOutline(int ID) {
        return outlineControllerMapper.deleteOutline(ID);
    }
}
