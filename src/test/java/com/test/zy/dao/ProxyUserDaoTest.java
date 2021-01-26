package com.test.zy.dao;

import com.test.zy.dao.impl.UserDaoImpl;
import org.junit.Test;

public class ProxyUserDaoTest {

    @Test
    public void ProxyUserDaoTest(){
        ProxyUserDao proxyUserDao = new ProxyUserDao(new UserDaoImpl());
        proxyUserDao.save();
    }
}