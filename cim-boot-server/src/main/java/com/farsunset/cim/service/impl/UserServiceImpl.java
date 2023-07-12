package com.farsunset.cim.service.impl;

import com.farsunset.cim.dao.UserMapper;
import com.farsunset.cim.entity.UserDTO;
import com.farsunset.cim.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public UserDTO findById(Long userId) {
        return userMapper.findById(userId);
    }
}
