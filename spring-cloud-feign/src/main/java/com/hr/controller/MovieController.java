package com.hr.controller;

import com.hr.client.UserFeignClient;
import com.hr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hr on 2017/4/25.
 */
@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private UserFeignClient userFeignClient;

    @RequestMapping("/{id}")
    public User findById(@PathVariable String id){
        return userFeignClient.findById(Integer.valueOf(id));
    }
}
