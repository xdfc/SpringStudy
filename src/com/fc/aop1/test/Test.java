package com.fc.aop1.test;
/**
 * 缺少aop相关的依赖包，运行会出错
 */

import com.fc.aop1.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_aop1.xml");
        UserService us = (UserService)context.getBean("userService");
        us.deleate();
    }
}
