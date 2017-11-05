package com.huarui.action;

import com.huarui.entity.User;
import com.huarui.service.UserService;
import com.huarui.service.impl.UserServiceimpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/11/3.
 */
@Controller
public class UserAction {
    @RequestMapping("/testfindall")
    @ResponseBody
    public List<User> findAll(){
        List<User>list=null;
        UserService us=new UserServiceimpl();
        list=us.findAll();
        return list;
    }
}
