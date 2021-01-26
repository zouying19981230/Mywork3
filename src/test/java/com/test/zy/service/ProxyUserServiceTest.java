package com.test.zy.service;

import com.test.zy.service.UserService;
import com.test.zy.service.impl.UserServiceImpl;
import com.test.zy.proxy.ProxyJDK;
import org.junit.Test;

public class ProxyUserServiceTest {

    @Test
    public void test(){
        ProxyUserService proxyUserService = new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServiceJDK(){
        ProxyJDK proxyJDK = new ProxyJDK(new UserServiceImpl());
        UserService userService = (UserService) proxyJDK.getProxy();
        userService.update();
    }
}