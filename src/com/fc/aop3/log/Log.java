package com.fc.aop3.log;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
    @Before("execution(* com.fc.aop3.impl.*.*(..))")
    public void before(){
        System.out.println("------方法执行前执行-------");
    }

    @After("execution(* com.fc.aop3.impl.*.*(..))")
    public void after(){
        System.out.println("------方法执行后执行-------");
    }
    @Around("execution(* com.fc.aop3.impl.*.*(..))")
    public Object around(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        System.out.println("签名"+jp.getSignature());
        Object result = jp.proceed();
        System.out.println("环绕后");
        return result;
    }
}
