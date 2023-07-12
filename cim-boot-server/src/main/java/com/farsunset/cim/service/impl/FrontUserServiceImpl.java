package com.farsunset.cim.service.impl;

import com.farsunset.cim.dao.FrontUserMapper;
import com.farsunset.cim.entity.FrontUserDTO;
import com.farsunset.cim.service.FrontUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FrontUserServiceImpl implements FrontUserService {

    @Resource
    private FrontUserMapper frontUserMapper;

    @Override
    public FrontUserDTO findById(Long userId) {
        return frontUserMapper.findById(userId);
    }
}
