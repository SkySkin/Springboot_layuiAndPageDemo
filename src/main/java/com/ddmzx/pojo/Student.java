package com.ddmzx.pojo;

import lombok.Data;

/**
 * @author Rock
 * @createDate 2019/09/24 2:02
 * @see com.ddmzx.pojo
 */
@Data
public class Student {
    private Long id;
    private String name;
    private Integer age;
    private String gender;
    private String telephone;
    private String email;
}
