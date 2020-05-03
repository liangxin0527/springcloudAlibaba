package com.example.userprovider02.service.imp;


import com.example.userprovider02.mapper.UserMapper;
import com.example.userprovider02.pojo.User;
import com.example.userprovider02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findALlUser();
    }
}
