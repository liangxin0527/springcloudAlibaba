package com.example.userclassprovider.feign;

import com.example.userclassprovider.pojo.ClassN;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassfeignFallBack implements ClassFeignClient{
    @Override
    public List<ClassN> findAll() {
        return null;
    }
}
