package com.demo.po;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName(value = "t_school")
public class School implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    private String schoolName;

    private Integer classId;
}