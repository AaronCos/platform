package com.sswh.platform.service.impl;

import com.sswh.platform.dao.UserDao;
import com.sswh.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangchengcheng on 2019/3/18
 */

@Service
public class UserServiceImpl {


    @Autowired
    private UserDao userDao;

    public void registUser(User user){
        if(user == null){
            user = new User();
            user.setName("wcc");
            user.setPassword("qwer1234");
        }
        userDao.registUser(user);
    }




}
