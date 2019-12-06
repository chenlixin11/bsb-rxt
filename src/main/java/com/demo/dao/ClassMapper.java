package com.demo.dao;

import com.demo.po.Class;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Component
public interface ClassMapper extends BaseMapper<Class> {

}