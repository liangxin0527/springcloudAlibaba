package com.example.classprovider02.controller;

import com.example.classprovider02.pojo.ClassN;
import com.example.classprovider02.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("class")
public class ClassController {
    @Autowired
    ClassService classService;
    @RequestMapping("findAll")
    @ResponseBody
    public List<ClassN> findClass(){
            System.out.println("class............22222222222222");

        return classService.findAll();
    }
}
