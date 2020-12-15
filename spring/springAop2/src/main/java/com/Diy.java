package com;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


public class Diy {
    public void before(){
        System.out.println("执行前置方法");
    }
    public void after(){
        System.out.println("执行后置方法");
    }
}

