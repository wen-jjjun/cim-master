package com.farsunset.cim.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
/**
 * 消息的实体累
 * @author JJJun
 * @date 2023/7/12
 **/
public class MessageDTO {

    private int message_id;
    private String content;
    private int send_id;
    private int for_id;
    private String create_user;
    private String create_date;

}
