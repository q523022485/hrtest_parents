package com.huarui.mapperxml;

import com.huarui.entity.User;
import com.huarui.mapper.UserDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/11/3.
 */
public class UserDaoxml implements UserDao {
    @Override
    public List<User> findAll() {
        List<User> list=new ArrayList<User>();
        for (int i=0;i<10 ;i++){
            User user=new User();
            user.setUid(i);
            user.setUname(i+"name");
            list.add(user);
        }
        return list;
    }
}
