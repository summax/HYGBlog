package com.hyg.test.java;

import com.alibaba.fastjson.JSON;
import com.hyg.entity.User;
import com.hyg.service.IUserService;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.util.logging.Logger;

@ContextConfiguration(locations = {"classpath:xml/spring-mybatis.xml"})

public class TestMybatis {
    private static Logger logger = Logger.getLogger(String.valueOf(TestMybatis.class));

    @Resource
    private IUserService userService = null;

    @org.junit.jupiter.api.Test
    public void test1() {
        User user = userService.GetUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info(JSON.toJSONString(user));
    }
}
