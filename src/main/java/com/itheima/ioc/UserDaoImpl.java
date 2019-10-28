package com.itheima.ioc;

import org.springframework.stereotype.Repository;

@Repository("userDao2")
public class UserDaoImpl implements UserDao{

    @Override
    public void say() {
        System.out.println("hello world");
    }

    @Override
    public void save() {
        System.out.println("userdao save");
    }

}
