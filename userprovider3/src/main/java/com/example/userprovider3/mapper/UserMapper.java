package com.example.userprovider3.mapper;


import com.example.userprovider3.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from User")
    public List<User> findALlUser();
}
