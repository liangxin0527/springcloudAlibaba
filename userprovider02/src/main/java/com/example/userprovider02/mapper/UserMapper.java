package com.example.userprovider02.mapper;


import com.example.userprovider02.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from User")
    public List<User> findALlUser();
}
