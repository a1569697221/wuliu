package com.xr.springboot.dao;

import com.xr.springboot.model.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Repository
public interface UserMapper {
    @Select("select * from user")
    List<User> all();
}
