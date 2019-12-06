package com.demo.po;

import javax.persistence.Table;

/**
 * 
 * 
 * @author wcyong
 * 
 * @date 2019-12-06
 */
@Table(name = "t_school")
public class School {
    /**
     * 主键
     */
    private Integer id;

    private String schoolName;

    private Integer classId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}