package com.chen.service;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {
    //登录
    User login(@Param("id") int id, @Param("password") String password);
    //登出

    //注册
    int addUser(User user);
    //注销
    int deleteUser(@Param("id") int id);
    //账号验证
    User idTest(@Param("id") int id);
}
