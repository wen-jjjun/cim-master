package com.farsunset.cim.dao;

import com.farsunset.cim.entity.MessageDTO;
import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MessageMapper {


    /**
     * 通过id查询
     *
     * @param userId
     * @return
     */
    UserDTO findById(@Param("userId") Long userId);


    /**
     * 新增消息
     * @author JJJun
     * @date 2023/7/12
     **/
    void insert(MessageDTO messageDTO);

}
