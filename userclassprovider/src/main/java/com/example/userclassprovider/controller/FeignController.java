package com.example.userclassprovider.controller;

import com.example.userclassprovider.feign.ClassFeignClient;
import com.example.userclassprovider.feign.UserFeignClient;
import com.example.userclassprovider.pojo.ClassN;
import com.example.userclassprovider.pojo.User;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("feign")
@RefreshScope
public class FeignController {

    @Value("${usernametest}")
    private String username;
    @Autowired
    private ClassFeignClient classFeignClient;
    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("findAll")
    public HashMap<Object, Object> findAll() {
            List<ClassN> classNS = classFeignClient.findAll();
            List<User> user = userFeignClient.findALl();
            HashMap<Object, Object> map = new HashMap<>();
            map.put("user", user);
            map.put("class", classNS);
            map.put("usernametest",username);
            return map;


    }
    /*
    * 开启服务熔断机制
    *
    * */
    @HystrixCommand(fallbackMethod = "serviceCirbreakFallBack",commandProperties = {
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "3000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "50")
    })
    @RequestMapping("cirbreak/{id}")
    public String seviceCirbreak(@PathVariable(value = "id") Integer id){
        if (id>0){
            return "success.............";
        }else{
                 id=18/0;

            return "null";
        }
    }
    public String serviceCirbreakFallBack(Integer id){
        return "服务出错了";
    }
}
