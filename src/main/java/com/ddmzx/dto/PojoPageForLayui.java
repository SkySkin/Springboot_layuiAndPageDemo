package com.ddmzx.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Rock
 * @createDate 2019/09/24 2:33
 * @see com.ddmzx.dto
 */
//这个类用来传输分页的数据
    @Data
public class PojoPageForLayui<T> {
    private String code;
    private String msg;
    private Long count;
    private List<T> data;
}
