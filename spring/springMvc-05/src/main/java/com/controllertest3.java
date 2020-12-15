package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class controllertest3 {
//    @RequestMapping(value = "/t3",method = {RequestMethod.GET})
    @GetMapping("/t3/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model)
    {
        int request=a+b;
        model.addAttribute("msg","get");
        return "hello";
    }
}
