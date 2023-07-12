package com.farsunset.cim.dao;

import com.farsunset.cim.entity.MessageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageMapper {


    /**
     * 查询列表
     *
     * @param sendId
     * @param forId
     * @param startRow
     * @param pageSize
     * @return
     */
    List<MessageDTO> findPage(@Param("sendId") Integer sendId, @Param("forId") Integer forId, @Param("startRow") Integer startRow, @Param("pageSize") Integer pageSize);


    /**
     * 新增消息
     *
     * @author JJJun
     * @date 2023/7/12
     **/
    void insert(MessageDTO messageDTO);

}
