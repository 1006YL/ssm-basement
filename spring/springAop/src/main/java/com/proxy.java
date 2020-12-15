package com;
import com.UserDao;
public class proxy {
    private UserDao user;
    public void setUser(UserDao user){
        this.user=user;
    }
    public void log(String log)
    {
        System.out.println(log);
    }
    public void add(){
        user.add();
        this.log("add");
    }

}
