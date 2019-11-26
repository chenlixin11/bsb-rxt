package com.redis.demo.po;

/**
 * 项目名称：demo
 * 类 名 称：Student
 * 类 描 述：
 * 创建时间：2019/11/22 09:41
 * 创 建 人：chenlixin
 */
public class Student implements Comparable<Student>,Cloneable{
    private Integer age;
    private String name;

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return (Student)super.clone();
    }


    @Override
    public int compareTo(Student o) {
        return this.age-o.getAge();
    }
}
