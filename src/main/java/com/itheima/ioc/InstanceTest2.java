package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//        System.out.println(applicationContext.getBean("bean2"));
        System.out.println(applicationContext.getBean("bean3"));
    }
}
