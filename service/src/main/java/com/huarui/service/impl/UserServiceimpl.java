package com.huarui.service.impl;

import com.huarui.entity.User;

import com.huarui.mapper.UserDao;
import com.huarui.mapperxml.UserDaoxml;
import com.huarui.service.UserService;

import java.util.List;

/**
 * Created by admin on 2017/11/3.
 */
public class UserServiceimpl implements UserService {
    @Override
    public List<User> findAll() {
        UserDao dao=new UserDaoxml();
        return dao.findAll();
    }
}
