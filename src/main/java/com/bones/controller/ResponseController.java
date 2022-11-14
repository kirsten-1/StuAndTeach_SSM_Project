package com.bones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ResponseController {
    //紧耦合方式
    @RequestMapping("despDemo")
    public void testResponse1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //请求转发
        //request.getRequestDispatcher("/forward.jsp").forward(request,response);
        //响应重定向
        response.sendRedirect(request.getContextPath()+"/redirect.jsp");
    }

    //springmvc关键字实现forward
    @RequestMapping("demo1")
    public String testResponse2(){
        //可以省略关键字forward
        //return "forward:/forwardPage.jsp";
        return "/forwardPage.jsp";
    }

    //springmvc关键字实现redirect
    @RequestMapping("demo2")
    public String testResponse3(){
        //不可以省略关键字redirect
        return "redirect:/redirectPage.jsp";
    }
    @RequestMapping("demo3")
    public View testResponse4(HttpServletRequest request){
        //View是org.springframework.web.servlet下的一个接口
        View view = null;
        //请求转发
        //view = new InternalResourceView("/forwardPage.jsp");
        //重定向
        view = new RedirectView(request.getContextPath()+"/redirectPage.jsp");
        return view;
    }

    @RequestMapping("demo4")
    public ModelAndView testResponse5(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        //请求转发
        //mv.setViewName("forward:/forwardPage.jsp");
        //mv.setView(new InternalResourceView("/forwardPage.jsp"));
        //重定向
        //mv.setViewName("redirect:redirectPage.jsp");
        mv.setView(new RedirectView(request.getContextPath()+"/redirectPage.jsp"));
        return mv;
    }
}
