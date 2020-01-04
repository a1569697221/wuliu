package com.xr.springboot.service.impl;

import com.xr.springboot.dao.UserMapper;
import com.xr.springboot.model.User;
import com.xr.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> all() {
        return userMapper.all();
    }
}
