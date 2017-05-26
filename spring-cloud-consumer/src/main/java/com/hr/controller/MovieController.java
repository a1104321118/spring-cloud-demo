package com.hr.controller;

import com.hr.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hr on 2017/4/25.
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    @HystrixCommand(fallbackMethod = "fallback")
    public User findById(@PathVariable String id){
        //return restTemplate.getForObject("http://localhost:7777/simple/" + id, User.class);
        //使用 serviceId（VIP virture IP） 也可以调用 也就是  spring.application.name
        return restTemplate.getForObject("http://localhost:7777/simple/" + id, User.class);
    }

    public User fallback(String id){//入参和返回类型都要一致，实现断路器
        User user = new User();
        user.setId(1);
        return user;
    }
}
