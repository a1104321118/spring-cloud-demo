package com.hr.service;


import com.hr.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
public interface UserService {

    User selectById(Integer id);

    void batchUpdate(List<User> users);
}
