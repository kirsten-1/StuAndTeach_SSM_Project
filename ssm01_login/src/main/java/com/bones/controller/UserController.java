package com.bones.controller;

import com.bones.pojo.User;
import com.bones.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login.do")
    public String loginCheck(User user){
        System.out.println(user);
        User user1 = userService.findUser(user.getUsername(), user.getPassword());
        if (user1==null){
            return "main";
        }
        return "redirect:/index";
    }


}
