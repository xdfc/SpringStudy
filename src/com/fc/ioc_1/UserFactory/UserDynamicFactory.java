package com.fc.ioc_1.UserFactory;

import com.fc.ioc_1.vo.User;

public class UserDynamicFactory {
    public User newInstance(String name){
        return new User(name);
    }
}
