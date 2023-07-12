package com.farsunset.cim.service.impl;

import com.farsunset.cim.dao.MessageMapper;
import com.farsunset.cim.entity.MessageDTO;
import com.farsunset.cim.entity.UserDTO;
import com.farsunset.cim.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    @Override
    public UserDTO findById(Long userId) {
        return messageMapper.findById(userId);
    }


    @Override
    public void insert(MessageDTO messageDTO) {
        messageMapper.insert(messageDTO);
    }

}
