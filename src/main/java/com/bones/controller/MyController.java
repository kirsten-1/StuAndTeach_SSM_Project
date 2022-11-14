package com.bones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
    @RequestMapping(value = "/myCon.do",method = RequestMethod.GET,params = "username")
    public String testRequest(){
        System.out.println("testRequest");
        return "success";
    }

}
