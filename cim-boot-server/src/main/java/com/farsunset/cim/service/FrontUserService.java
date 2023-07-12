package com.farsunset.cim.service;

import com.farsunset.cim.entity.FrontUserDTO;
import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Param;


public interface FrontUserService {


    /**
     * 通过id查询
     *
     * @param userId
     * @return
     */
    FrontUserDTO findById(@Param("userId") Long userId);

}
