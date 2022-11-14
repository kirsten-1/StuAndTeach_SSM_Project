package com.bones.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class GetParamController {

    //松耦合
    @RequestMapping("/getParam.do")
    public String testLoose(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("testLoose:" + username+","+password);
        return  username+","+password;

    }

    //紧耦合
    @RequestMapping("getArg.do")
    public String testTight(String username,@RequestParam("pwd") String password){
        System.out.println("testTight:" + username + "," + password);
        return username+","+password;
    }
}
