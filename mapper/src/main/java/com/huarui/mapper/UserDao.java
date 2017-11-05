package com.huarui.mapper;

import com.huarui.entity.User;

import java.util.List;

/**
 * Created by admin on 2017/11/3.
 */
public interface UserDao {
    List<User> findAll();
}
