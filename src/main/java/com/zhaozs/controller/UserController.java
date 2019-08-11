package com.zhaozs.controller;

import com.zhaozs.entity.User;
import com.zhaozs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/25
 * @ 描述
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("register")
    public void register(@RequestBody User user) {

        userService.register(user);
        System.out.println("注册成功===========================");
    }

    @RequestMapping("dropById")
    public void dropById(@RequestBody User u) {

        userService.dropById(u.getId());
        System.out.println("删除成功===========================");
    }

    @RequestMapping("modifyUser")
    public void modifyUser(@RequestBody User user) {

        userService.modifyUser(user);
        System.out.println("修改成功===========================");
    }

    @RequestMapping("/login")
    public User login(@RequestBody User user) {

        User login = userService.login(user.getUserName(), user.getPassword(), user.getCategory());
        System.out.println("登陆成功===========================");

        return login;
    }

    @RequestMapping("queryOne")
    public User queryOne(@RequestBody User u) {

        User user = userService.queryById(u.getId());
        return user;
    }

    @RequestMapping("queryAll")
    public List<User> queryAll(@RequestBody User user) {

        List<User> users = userService.queryAll(user.getUserName(),
                user.getStatus(),
                user.getGender(),
                user.getIsDelete());
        return users;
    }
}
