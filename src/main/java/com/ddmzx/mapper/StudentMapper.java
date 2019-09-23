package com.ddmzx.mapper;

import com.ddmzx.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Rock
 * @createDate 2019/09/24 2:05
 * @see com.ddmzx.mapper
 */
@Mapper
public interface StudentMapper {

    @Select("select * from student")
    List<Student> selAll();
}
