package com.example.classprovider01.mapper;

import com.example.classprovider01.pojo.ClassN;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassNMapper {
    @Select("select * from classn")
    List<ClassN> findAll();
}
