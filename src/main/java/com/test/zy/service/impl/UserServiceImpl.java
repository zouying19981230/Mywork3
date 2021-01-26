package com.test.zy.service.impl;

import com.test.zy.dao.UserDao;
import com.test.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void save(){
//        userDao.save();
        System.out.println("userService save");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

}
