package com.redis.demo.collection;

import com.redis.demo.po.Student;

import java.util.*;

/**
 * 项目名称：demo
 * 类 名 称：TreeSets
 * 类 描 述：
 * 创建时间：2019/11/22 09:00
 * 创 建 人：chenlixin
 */
public class TreeSets {

    public static void main(String[] args) throws CloneNotSupportedException {
        Set set = new TreeSet();
//        set.add(new Student(19,"sansha"));
//        set.add(new Student(10,"sansha"));
//        set.add(new Student(24,"lirouw"));
//        System.out.println(set);
//
//        List<Student> students = new ArrayList<Student>();
//        students.add(new Student(18, "a"));
//        students.add(new Student(19, "q"));
//        students.add(new Student(20, "w"));
//
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() > o2.getAge() ? -1 : (o1.getAge().equals(o2.getAge()) ? 0 : 1);
//            }
//        });
//        for (Student student : students) {
//            System.out.println(student.toString());
//        }
        Student qwer = new Student(10, "qwer");
        Student clone = qwer.clone();
        System.out.println(clone);
    }
}



