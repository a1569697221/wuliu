package com.xr.springboot.service;

import com.xr.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserService {
    List<User> all();
}
