package com.bones.service.impl;

import com.bones.mapper.PlayerMapper;
import com.bones.pojo.Player;
import com.bones.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;
    @Override
    public int addPlayer(Player player) {
        return playerMapper.addPlayer(player);
    }
}
