package com.ddmzx.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Rock
 * @createDate 2019/09/24 2:33
 * @see com.ddmzx.dto
 */

/*

{"code":0,
"msg":"",
"count":1000,
"data":[
        {"id":10000,
        "username":"user-0",
        "sex":"女",
        "city":"城市-0",
        "sign":"签名-0",
        "experience":255,
        "logins":24,
        "wealth":82830700,
        "classify":"作家",
        "score":57}
       ]
 }
 */

//这个类用来传输分页的数据，根据layui 中json的规范
@Data
public class PojoPageForLayui<T> {
    private String code;
    private String msg;
    private Long count;
    private List<T> data;
}
