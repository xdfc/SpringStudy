package com.fc.aop1.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {

    /**
     *
     * @param method 被调用的方法对象
     * @param objects  被调用的方法的参数
     * @param target  被调用的方法的目标对象
     * @throws Throwable
     */
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"方法");
    }
}
