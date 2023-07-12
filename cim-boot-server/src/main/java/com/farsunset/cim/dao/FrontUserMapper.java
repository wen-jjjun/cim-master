package com.farsunset.cim.dao;

import com.farsunset.cim.entity.FrontUserDTO;
import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

@Mapper
public interface FrontUserMapper {


    /**
     * 通过id查询
     *
     * @param userId
     * @return
     */
    FrontUserDTO findById(@Param("userId") Long userId);

}
