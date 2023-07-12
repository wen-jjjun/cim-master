package com.farsunset.cim.service.impl;

import com.farsunset.cim.dao.MessageMapper;
import com.farsunset.cim.entity.MessageDTO;
import com.farsunset.cim.service.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    @Override
    public List<MessageDTO> findPage(Integer sendId, Integer forId, Integer startRow, Integer pageSize) {
        return messageMapper.findPage(sendId, forId, startRow, pageSize);
    }


    @Override
    public void insert(MessageDTO messageDTO) {
        messageMapper.insert(messageDTO);
    }

}
