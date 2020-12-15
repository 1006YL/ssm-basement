package com.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@RestController
@Controller
public class controller {
    @RequestMapping("/j1")
    @ResponseBody
    public int json() {
        ObjectMapper jsn = new ObjectMapper();
        User user = new User(1, "1234", "男");
//        String str = jsn.writeValue();
//        return str;
        return 0;
    }
}