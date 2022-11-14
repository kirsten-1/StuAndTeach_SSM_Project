package com.bones.controller;

import com.bones.pojo.Person;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class GetParamByPojo {
    @RequestMapping("/testByPojo")
    public String testByPOJO(Person p){
        System.out.println(p);
        return "success";
    }
//    @RequestMapping("/testByPojo")
//    public String testByPOJO(@DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate){
//        System.out.println("birthDate = " + birthDate);
//        return "success";
//    }

}
