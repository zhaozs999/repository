package com.zhaozs.dao;

import com.zhaozs.entity.User;
import jdk.nashorn.internal.ir.IdentNode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ 创建人 zhaozs
 * @ 创建时间 2019/3/25
 * @ 描述
 */
@Mapper
public interface UserDao {

    // 用户注册
    void registerUser(User user);

    // 删除
    void deleteById(BigDecimal id);

    // 修改
    void updateUser(User user);

    // 用户登录
    User login(@Param("userName") String userName,
               @Param("pwd") String pwd,
               @Param("category") Integer category);

    // 根据id查询
    User selectById(BigDecimal id);

    // 查询所有列表（高级搜索）
    List<User> selectAll(@Param("userName")String userName,
                         @Param("status")String status,
                         @Param("gender")String gender,
                         @Param("isDelete")Integer isDelete);


}
