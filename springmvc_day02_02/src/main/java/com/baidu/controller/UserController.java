package com.baidu.controller;

import com.baidu.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString执行了。。。。");
        User user = new User();
        user.setUsername("hchc");
        user.setMoney(8000);
        model.addAttribute("user",user);
        return "success";
    }


    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //response.sendRedirect(request.getContextPath()+"/index.jsp");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("晨晨");
        return;
    }


    @RequestMapping("/testModelandView")
    public ModelAndView testModelandView(){
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelandView执行了。。。。");
        User user = new User();
        user.setUsername("hc");
        user.setMoney(8500);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }


    @RequestMapping("/testforwardOrRedicet")
    public String testforwardOrRedicet(Model model){
        System.out.println("testforwardOrRedicet执行了。。。。");

        //return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }


    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testString执行了。。。。");
        System.out.println(user);

        return user;
    }


}
