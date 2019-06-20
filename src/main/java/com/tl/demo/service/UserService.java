package com.tl.demo.service;

import com.tl.demo.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUserAll();
    void insert(User user);
}
