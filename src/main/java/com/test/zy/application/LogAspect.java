package com.test.zy.application;

import com.test.zy.annotation.Transaction;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    //    @Pointcut("execution(* com.test.zy.dao.*.*(..))")
    @Pointcut("@annotation(com.test.zy.annotation.Transaction)")
    public void pointCut(){
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();

        Transaction transaction = methodSignature.getMethod().getAnnotation(Transaction.class);
        if(transaction != null){
            System.out.println(transaction.propagate());
        }

        System.out.println("begin transaction");
        joinPoint.proceed(joinPoint.getArgs());
        System.out.println("end transaction");
    }

}