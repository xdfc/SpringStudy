package com.fc.aop1.log;


import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    /**
     * 目标方法执行后的通知
     * @param o    返回值
     * @param method  被调用的方法
     * @param objects  被调用的参数
     * @param target   被调用方法对象的目标对象
     * @throws Throwable
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法"+",返回值是"+o);
    }
}
