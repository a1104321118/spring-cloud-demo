package com.hr.client;

import com.hr.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hr on 2017/5/15.
 */
@FeignClient("user-provider")
public interface UserFeignClient {

    // @GetMapping("/simple/{id}") 这个注解 Feign 不支持
    // User findById(@PathVariable Integer id); @PathVariable 必须注明 value

    @RequestMapping(value = "/simple/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Integer id);
}
