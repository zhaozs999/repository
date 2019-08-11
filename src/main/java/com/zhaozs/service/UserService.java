package com.zhaozs.service;

import com.zhaozs.dao.UserDao;
import com.zhaozs.entity.User;
import com.zhaozs.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Console;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/25
 * @ 描述
 */
@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    // 用户注册
    public void register(User user) {
        BigDecimal id = Utils.getId();
        user.setId(id);
        user.setRegist_date(new Date());
        userDao.registerUser(user);
    }

    // 删除
    public void dropById(BigDecimal id) {
        userDao.deleteById(id);
    }

    // 修改
    public void modifyUser(User user) {

            userDao.updateUser(user);

    }

    // 用户登录
    public User login(String name, String pwd, Integer category) {
        User login = userDao.login(name, pwd, category);
        return login;
    }

    // 根据id查询
    public User queryById(BigDecimal id) {
        User user = userDao.selectById(id);
        return user;
    }

    // 查所有
    public List<User> queryAll(String userName, String status, String gender,Integer isDelete) {
        List<User> users = userDao.selectAll(userName, status, gender, isDelete);
        return users;
    }
}
