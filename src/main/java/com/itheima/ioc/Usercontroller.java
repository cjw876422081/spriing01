package com.itheima.ioc;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("userContoller")
public class Usercontroller {
    @Resource(name ="userService2")
    private UserService userService ;
    public void save(){
        this.userService.save();
        System.out.println("controller save");
    }


}
