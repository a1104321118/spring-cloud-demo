package com.hr.service.impl;

import com.hr.entity.User;
import com.hr.mapper.UserMapper;
import com.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User selectById(Integer id){
        return userMapper.selectById(id);
    }

    @Override
    public void batchUpdate(List<User> users) {
        userMapper.batchUpdate(users);
    }
}
