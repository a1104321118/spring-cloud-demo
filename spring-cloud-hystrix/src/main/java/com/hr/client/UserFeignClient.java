package com.hr.client;

import com.conf.FeignConfigration;
import com.hr.client.fallback.UserFeignFallback;
import com.hr.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hr on 2017/5/15.
 */
@FeignClient(name = "user-provider", configuration = FeignConfigration.class, fallback = UserFeignFallback.class)
//@FeignClient(name = "user-provider", fallback = UserFeignFallback.class)
public interface UserFeignClient {

    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Integer id);
}
