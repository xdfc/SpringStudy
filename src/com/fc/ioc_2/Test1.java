package com.fc.ioc_2;

import com.fc.ioc_2.Dogs;
import com.fc.ioc_2.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student)context.getBean("student");
        System.out.println(stu);

        Dogs dogs = (Dogs)context.getBean("dogs");
        System.out.println(dogs.info());
    }
}
