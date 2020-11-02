package com.fc.aop3.test;
/**
 * aop实现的第三种方式，通过注解实现
 */

import com.fc.aop3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        //绝对路径
        ApplicationContext context = new ClassPathXmlApplicationContext("file:G:\\JavaProject\\SpringTest\\src\\com\\fc\\aop3\\beans_aop1.xml");
        //默认是classpath的路径，就是生产.java文件的路径下，但是可以定义resource文件，直接在如下写也是对的
        // ApplicationContext context = new ClassPathXmlApplicationContext("beans_aop1.xml");
        UserService us = (UserService)context.getBean("userService");
        us.deleate();
    }
}
