package com.test.zy.application;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class SchedueTask implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("scheduleTask init finish");
    }
}
