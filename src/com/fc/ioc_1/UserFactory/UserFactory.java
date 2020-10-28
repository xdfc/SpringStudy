package com.fc.ioc_1.UserFactory;

import com.fc.ioc_1.vo.User;

public class UserFactory {
    public static User newInstance(String name){
        return new User(name);
    }
}
