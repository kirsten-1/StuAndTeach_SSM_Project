package com.bones.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestResponseVoidController {
    @RequestMapping("testVoid.do")
    public void testVoid(){
        System.out.println("testVoid 执行");
    }
}
