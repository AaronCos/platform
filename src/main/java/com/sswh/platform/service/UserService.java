package com.sswh.platform.service;

import com.sswh.platform.dao.UserDao;
import com.sswh.platform.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangchengcheng on 2019/3/18
 */

@Service
public interface UserService {
     void registUser(User user);
}
