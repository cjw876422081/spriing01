package com.itheima.ioc;

import org.springframework.context.annotation.Bean;

public class BeanFactory2 {
    public BeanFactory2(){
        System.out.println("实例化");
    }
    public Bean2 createBean(){
        return new Bean2();
    }
}
