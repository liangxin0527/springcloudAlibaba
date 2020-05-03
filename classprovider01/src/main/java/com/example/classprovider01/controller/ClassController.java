package com.example.classprovider01.controller;

import com.example.classprovider01.pojo.ClassN;
import com.example.classprovider01.service.ClassService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    public List<ClassN> findClass() {


            System.out.println("class.........1111");


        return classService.findAll();
    }
}
