package com.ddmzx.controller;

import com.ddmzx.dto.PojoPageForLayui;
import com.ddmzx.mapper.StudentMapper;
import com.ddmzx.pojo.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Rock
 * @createDate 2019/09/24 2:01
 * @see com.ddmzx.controller
 */
@Controller
public class TestController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/selAll")
    public PojoPageForLayui<?> selAll(@RequestParam(name = "page",defaultValue = "1")Integer page,
                                @RequestParam(name = "size",defaultValue = "5")Integer size){
        PageHelper.startPage(page, size);
        List<Student> students = studentMapper.selAll();
        PageInfo<Student> studentPageInfo = new PageInfo<>(students);
        PojoPageForLayui<Student> dtopage = new PojoPageForLayui();
        dtopage.setCode("0");
        dtopage.setCount(studentPageInfo.getTotal());
        System.out.println(studentPageInfo.getList().size());
        dtopage.setData(studentPageInfo.getList());
        dtopage.setMsg("");
        return dtopage;
    }
}
