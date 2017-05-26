package com.hr.client.fallback;

import com.hr.client.UserFeignClient;
import com.hr.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by hr on 2017/5/19.
 */
@Component
public class UserFeignFallback implements UserFeignClient{

    @Override
    public User findById(@PathVariable("id") Integer id) {
        return new User();
    }
}
