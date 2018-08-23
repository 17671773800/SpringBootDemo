package com.yk.service.impl;

import com.yk.dao.DAO;
import com.yk.service.GarageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("garageService")
public class GarageServiceImpl implements GarageService {

    @Resource(name = "daoSupport")
    private DAO dao;

    @Override
    public List<Map> getGarageList() throws Exception {
        return (List<Map>) dao.findForList("garageMapper.getGarageList",null);
    }
}
