package com.chen.service;

import com.chen.dao.UserMapper;
import com.chen.pojo.User;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User login(int id, String password) {
        return userMapper.login(id,password);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public User idTest(int id) {
        return userMapper.idTest(id);
    }
}
