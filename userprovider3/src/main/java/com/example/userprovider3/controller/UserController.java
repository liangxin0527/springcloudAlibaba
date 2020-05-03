package com.example.userprovider3.controller;


import com.example.userprovider3.pojo.User;
import com.example.userprovider3.service.imp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    @ResponseBody
    public List<User> findUserALl(){
        System.out.println("user................22222222");
        List<User> all = userService.findAll();
        return all;
    }
}
