package org.dubbo.hello.provider.impl;

import org.dubbo.hello.api.model.User;
import org.dubbo.hello.api.service.UserService;

public class UserServiceImpl implements UserService {
	 
    public User getUser(Long id) {
        return new User(id, "username" + id);
    }
}
