package com.example.userclassprovider.feign;

import com.example.userclassprovider.pojo.ClassN;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value ="classprovider",fallback = ClassfeignFallBack.class)
public interface ClassFeignClient {
    @RequestMapping("class/findAll")
    public List<ClassN> findAll();
}
