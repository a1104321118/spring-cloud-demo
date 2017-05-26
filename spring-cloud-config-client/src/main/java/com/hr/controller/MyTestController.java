package com.hr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
@RestController
public class MyTestController {

    @Value("${profile}")
    private String profile;

    @RequestMapping("profile")
    public String getProfile(){
        return this.profile;
    }
}
