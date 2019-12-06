package com.demo.po;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-12-06
 */
public class Class {
    private Integer id;

    private String className;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}