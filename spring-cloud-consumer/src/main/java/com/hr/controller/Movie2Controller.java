package com.hr.controller;

import com.hr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by hr on 2017/5/19.
 */
@RestController
@RequestMapping("movie2")
public class Movie2Controller {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{id}")
    public User findById(@PathVariable String id){
        return restTemplate.getForObject("http://localhost:7777/simple/" + id, User.class);
    }
}
