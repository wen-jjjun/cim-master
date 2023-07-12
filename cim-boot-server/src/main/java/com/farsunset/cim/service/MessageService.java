package com.farsunset.cim.service;

import com.farsunset.cim.entity.MessageDTO;
import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface MessageService {


    /**
     * 分页查询消息列表
     * @param sendId
     * @param forId
     * @return
     */
    List<MessageDTO> findPage(@Param("sendId") Integer sendId,@Param("forId") Integer forId,@Param("startRow") Integer startRow, @Param("pageSize") Integer pageSize);


    /**
     * 新增消息
     * @author JJJun
     * @date 2023/7/12
     **/
    void insert(MessageDTO messageDTO);

}
