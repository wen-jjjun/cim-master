package com.farsunset.cim.service;

import com.farsunset.cim.entity.UserDTO;
import org.apache.ibatis.annotations.Param;


public interface UserService {


    /**
     * 通过id查询
     *
     * @param userId
     * @return
     */
    UserDTO findById(@Param("userId") Long userId);

}
