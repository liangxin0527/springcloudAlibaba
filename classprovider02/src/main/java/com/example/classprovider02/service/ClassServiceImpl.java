package com.example.classprovider02.service;


import com.example.classprovider02.mapper.ClassNMapper;
import com.example.classprovider02.pojo.ClassN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassNMapper classMapper;


    @Override
    public List<ClassN> findAll() {
        return classMapper.findAll();
    }
}
