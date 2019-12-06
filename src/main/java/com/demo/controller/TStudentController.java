package com.demo.controller;

import com.demo.po.Class;
import com.demo.po.School;
import com.demo.po.TStudent;
import com.demo.service.TStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 项目名称：demo
 * 类 名 称：TStudentController
 * 类 描 述：
 * 创建时间：2019/12/6 09:56
 * 创 建 人：chenlixin
 */
@RestController
public class TStudentController {

    @Autowired
    private TStudentService studentService;

    @PostMapping("test")
    public Class test(){
        Class aClass = studentService.selectByKey(1);
        return aClass;
    }

    @PostMapping("student")
    public TStudent selectByStudent(){
        TStudent student = studentService.selectByStudent(1);
        return student;
    }

    @PostMapping("school")
    public School school(){
        School school = studentService.school(1);
        return school;
    }
}
