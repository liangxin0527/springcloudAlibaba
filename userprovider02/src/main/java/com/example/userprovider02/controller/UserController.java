package com.example.userprovider02.controller;


import com.example.userprovider02.pojo.User;
import com.example.userprovider02.service.UserService;
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
        System.out.println("user.............111111");
        List<User> all = userService.findAll();
        return all;
    }
}
