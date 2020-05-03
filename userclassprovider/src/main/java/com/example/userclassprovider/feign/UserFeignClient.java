package com.example.userclassprovider.feign;

import com.example.userclassprovider.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "userprovider", fallback = UserfeignFallBack.class)
public interface UserFeignClient {
    @RequestMapping("user/findAll")
    public List<User> findALl();

}
