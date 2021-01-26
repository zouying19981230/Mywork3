//package com.test.zy.application;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//import org.springframework.util.CollectionUtils;
//
//@Component
//public class ApplicationStatedListener implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        ApplicationContext context = contextRefreshedEvent.getApplicationContext();
//        System.out.println(contextRefreshedEvent.getTimestamp());
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
//    }
//}