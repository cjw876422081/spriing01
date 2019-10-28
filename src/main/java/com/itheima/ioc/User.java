package com.itheima.ioc;

import java.util.List;

public class User {
    private String username ;
    private Integer password ;
    private List<String> list ;

    @Override
    public String toString() {
        return "user" + username + "password"+password +"list"+list;
    }
    public User(){

    }
    public User(String username, Integer password, List<String> list) {
        this.username = username;
        this.password = password;
        this.list = list;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
