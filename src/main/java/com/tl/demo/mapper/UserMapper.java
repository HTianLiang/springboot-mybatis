package com.tl.demo.mapper;

import com.tl.demo.pojo.User;
import java.util.List;

public interface UserMapper {
    List<User> selectUserAll();
    void insert(User user);
}
