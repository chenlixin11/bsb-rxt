package com.demo.dao;

import com.demo.po.TStudent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Component
public interface TStudentMapper extends BaseMapper<TStudent> {

}