package com.test.zy.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;

@Configuration
//@Import({UserDaoConfig.class, UserServiceConfig.class})
@ComponentScan("com.test.zy")
public class AppConfig {

    @EventListener
    public void refreshListener(ContextRefreshedEvent event){
        System.out.println(event.getTimestamp());
        ApplicationContext context = event.getApplicationContext();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
    }

}