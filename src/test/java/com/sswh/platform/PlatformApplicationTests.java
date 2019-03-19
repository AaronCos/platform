package com.sswh.platform;

import com.sswh.platform.entity.User;
import com.sswh.platform.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformApplicationTests {
	@Autowired
	UserServiceImpl usi;

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void log(){
        //日志的级别由低到高
        //可以调整输出的日志级别；日志就只会在这个级别以后的高级别生效
        logger.trace("trace日志。。");
        logger.debug("debug日志。。");

        //SpringBoot默认给的是info级别，如果没指定就是springboot默认的root级别
        logger.info("info日志。。。");
        logger.warn("warn日志。。。");
        logger.error("error日志。。");

    }
	@Test
	public void contextLoads() {
        User user = new User();
        user.setName("zqq");
        user.setPassword("qwer1234");
        usi.registUser(user);
	}

}
