package com.test.zy.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class ProxyJDK implements InvocationHandler {

    public Object target;

    public ProxyJDK(Object target){
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行前");
        Date start = new Date();
        Object result = method.invoke(target, args);
        Date end = new Date();
        System.out.println("执行后");
        System.out.println("执行时间为：" + (end.getTime() - start.getTime()));
        return result;
    }
}