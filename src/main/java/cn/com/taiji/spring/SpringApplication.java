package cn.com.taiji.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

public class SpringApplication {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext("cn.com.taiji.spring");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item -> System.out.println(item));
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}