package com.test.zy.dao.impl;

import com.test.zy.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("userDao save");
    }
}
