package com.itheima.ioc;

import com.niitcoder.App;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestXMLBean {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(applicationContext.getBean("User1"));
        System.out.println(applicationContext.getBean("User2"));
    }
}
