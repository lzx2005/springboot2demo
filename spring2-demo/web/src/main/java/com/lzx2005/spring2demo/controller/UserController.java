package com.lzx2005.spring2demo.controller;

import com.lzx2005.spring2demo.dao.UserDao;
import com.lzx2005.spring2demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by Lizhengxian on 2018/2/28.
 */
@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/")
    public User create(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if(userDao.create(user)){
            System.out.println("创建成功");
        }
        return user;
    }

}
