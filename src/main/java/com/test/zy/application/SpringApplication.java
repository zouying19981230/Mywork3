package com.test.zy.application;

import com.test.zy.service.UserService;
import com.test.zy.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {

//        System.out.println(SingleTonUser.getInstance());
//        System.out.println(SingleTonUser.getInstance());

//        ApplicationContext context = new AnnotationConfigApplicationContext("com.test.zy");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.addApplicationListener(new ApplicationStatedListener());
        context.refresh();
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
        UserService userService = context.getBean(UserServiceImpl.class);
//        UserService userService1 = context.getBean(UserService.class);
        System.out.println(userService);
//        System.out.println(userService1);
        userService.save();
    }
}
