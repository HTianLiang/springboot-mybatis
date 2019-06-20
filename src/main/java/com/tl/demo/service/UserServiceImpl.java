package com.tl.demo.service;

import com.tl.demo.mapper.UserMapper;
import com.tl.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserAll() {
        return userMapper.selectUserAll();
    }

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }
}
