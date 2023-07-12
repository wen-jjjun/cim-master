package com.farsunset.cim.dao;

import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {


    /**
     * 通过id查询
     *
     * @param userId
     * @return
     */
    UserDTO findById(@Param("userId") Long userId);

}
