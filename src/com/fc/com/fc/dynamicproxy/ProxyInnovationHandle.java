package com.fc.com.fc.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInnovationHandle implements InvocationHandler {
    private Object proxyTarget;  //需要代理的接口或者类

    public void setProxyTarget(Object proxyTarget) {
        this.proxyTarget = proxyTarget;
    }

    /**
     *
     * @return  返回代理类
     */

    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),proxyTarget.getClass().getInterfaces(),this);
    }


    /**
     * proxy是代理类
     * method是代理类的调用处理程序的方法对象
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(proxyTarget,args);
        return result;
    }

    public void log(String methodName){
        System.out.println("执行"+methodName+"方法");
    }
}
