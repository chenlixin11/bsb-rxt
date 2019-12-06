package com.demo.service;

import com.demo.po.Class;
import com.demo.po.School;
import com.demo.po.TStudent;

/**
 * 项目名称：demo
 * 类 名 称：TStudentService
 * 类 描 述：
 * 创建时间：2019/12/6 09:55
 * 创 建 人：chenlixin
 */
public interface TStudentService {

    Class selectByKey(int i);

    TStudent selectByStudent(int i);

    School school(int i);
}
