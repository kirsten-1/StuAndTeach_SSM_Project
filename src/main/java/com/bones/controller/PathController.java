package com.bones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PathController {
    @RequestMapping("/testPath/{id}/{username}")
    public String testPathVariable(@PathVariable("id")String id,@PathVariable("username") String username){
        System.out.println("id = " + id);
        System.out.println("username = " + username);
        System.out.println("testPathVariable");
        return "success";
    }
}
