package com.fc.aop3.impl;

import com.fc.aop3.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加用户");
    }

    @Override
    public void update() {
        System.out.println("更新用户");
    }

    @Override
    public void deleate() {
        System.out.println("删除用户");
    }

    @Override
    public void search() {
        System.out.println("查找用户");
    }
}
