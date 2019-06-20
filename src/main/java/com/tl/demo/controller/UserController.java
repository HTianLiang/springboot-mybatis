package com.tl.demo.controller;

import com.tl.demo.pojo.User;
import com.tl.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("selectAll")
    public List<User> selectAll(){
        return userService.selectUserAll();
    }

    @RequestMapping("insert")
    public String insert(){
        User user = new User();
        user.setUser_code("root");
        user.setUser_name("abc");
        user.setUser_password("123456");
        user.setUser_state("1");
        userService.insert(user);
        return "成功新增!";
    }

}
