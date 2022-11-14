package com.bones.controller;


import com.bones.pojo.Person;
import com.bones.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class JsonController {
    @ResponseBody
    @RequestMapping("/testJson.do")
    public Pet testJson(Person person){
        System.out.println(person);
        return new Pet("Tom","cat");
    }
}
