package com.itheima.ioc;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService2")
public class UserServiceImpl implements UserService {
    @Resource(name = "userDao2")
    private UserDao userDao ;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("service hello ");
    }

    @Override
    public void save() {
        this.userDao.save();
        System.out.println("service dao");
    }
}
