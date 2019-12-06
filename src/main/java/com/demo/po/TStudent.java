package com.demo.po;

import java.util.Date;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-12-06
 */
public class TStudent {
    private Integer id;

    private String name;

    private Integer age;

    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}