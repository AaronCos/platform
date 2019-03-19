package com.sswh.platform.dao;

import com.sswh.platform.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by wangchengcheng on 2019/3/18
 */
@Repository
public interface UserDao {

    void registUser(User user);

}
