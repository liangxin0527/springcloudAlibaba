package com.example.classprovider02.mapper;

import com.example.classprovider02.pojo.ClassN;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ClassNMapper {
    @Select("select * from classn")
    List<ClassN> findAll();
}
