package com.user;

import lombok.Data;

@Data
public class User {
    private int id;  //id
    private String name;   //姓名
    private String password;   //密码

    public User(int id, String name, String password){
        this.id=id;
        this.name=name;
        this.password= password;
    }

    public User(){};
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", pwd='" + password + '\'' +
//                '}';
//    }
}

