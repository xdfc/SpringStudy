package com.fc.aop2.log;

public class Log {
    public void before(){
        System.out.println("------方法执行前执行-------");
    }
    public void after(){
        System.out.println("------方法执行后执行-------");
    }
}
