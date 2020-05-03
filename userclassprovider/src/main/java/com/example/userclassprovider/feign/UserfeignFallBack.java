package com.example.userclassprovider.feign;

import com.example.userclassprovider.pojo.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserfeignFallBack implements UserFeignClient{
    @Override
    public List<User> findALl() {
        return null;
    }
}
