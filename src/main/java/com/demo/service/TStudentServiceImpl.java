package com.demo.service;

import com.demo.dao.ClassMapper;
import com.demo.dao.SchoolMapper;
import com.demo.dao.TStudentMapper;
import com.demo.po.Class;
import com.demo.po.School;
import com.demo.po.TStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 项目名称：demo
 * 类 名 称：TStudentServiceImpl
 * 类 描 述：
 * 创建时间：2019/12/6 09:55
 * 创 建 人：chenlixin
 */
@Service
public class TStudentServiceImpl implements TStudentService {

    @Autowired
    private TStudentMapper studentMapper;
    @Autowired
    private ClassMapper classMapper;
    @Autowired
    private SchoolMapper schoolMapper;


    @Override
    public Class selectByKey(int i) {
        Class aClass = new Class();
        aClass.setClassName("小新");
        return classMapper.selectOne(aClass);
    }

    @Override
    public TStudent selectByStudent(int i) {
        TStudent student = new TStudent();
        student.setId(i);
        return studentMapper.selectOne(student);
    }

    @Override
    public School school(int i) {
        School school = new School();
        school.setId(i);
        return schoolMapper.selectOne(school);
    }
}
