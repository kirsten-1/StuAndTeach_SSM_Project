package com.bones.controller;

import com.bones.pojo.Player;
import com.bones.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @RequestMapping("addPlayer")
    public String addPlay(Player player){
        //System.out.println(player);
        playerService.addPlayer(player);
        return "redirect:/static/showPlayer.html";
    }
}
