package com.hr.controller;

import com.hr.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hr on 2017/5/19.
 */
@RestController
@RequestMapping("/propagation")
public class PropagationController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    @HystrixCommand(fallbackMethod = "fallback", commandProperties = {
            @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
    })
    //这样配置表示 该方法和HystrixCommand 是同一个线程中进行
    //不配置的话表示 是两个线程
    public User findById(@PathVariable String id){
        return restTemplate.getForObject("http://localhost:7777/simple/" + id, User.class);
    }

    public User fallback(String id){//入参和返回类型都要一致，实现断路器
        User user = new User();
        user.setId(1);
        return user;
    }


}
