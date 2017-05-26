package com.hr.controller;

import com.hr.entity.User;
import com.hr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/simple/{id}")
  public User findById(@PathVariable Integer id) {
    return userService.selectById(id);
  }

  @GetMapping("/batchUpdate")
  public User batchUpdate(){

    List<User> users = new ArrayList<User>();
    for (int i = 1; i < 5; i++) {
      User u = new User();
      u.setUsername(i+"");
      users.add(u);
    }

    userService.batchUpdate(users);

    return new User();
  }
}
