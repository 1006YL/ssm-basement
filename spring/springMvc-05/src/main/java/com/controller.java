package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @RequestMapping("/hello")
    //user对象这是对象内的直接映射
    public String sayHello(Model model, @RequestParam("username") String name){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg",name);
        //web-inf/jsp/hello.jsp
        return "hello";

//        return "redirect:/index.jsp";
//        return "forward:/index.jsp";
    }
//    @RequestMapping("/result/t1")
//    public void test1(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
//        rsp.getWriter().println("Hello,Spring BY servlet API");
//    }
//
//    @RequestMapping("/result/t2")
//    public void test2(HttpServletRequest req, HttpServletResponse rsp) throws IOException {
//        rsp.sendRedirect("/index.jsp");
//    }
//
//    @RequestMapping("/result/t3")
//    public void test3(HttpServletRequest req, HttpServletResponse rsp) throws Exception {
//        //转发
//        req.setAttribute("msg","/result/t3");
//        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,rsp);
//    }
}