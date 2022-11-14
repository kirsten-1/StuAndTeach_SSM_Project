package com.bones.service.impl;

import com.bones.mapper.UserMapper;
import com.bones.pojo.User;
import com.bones.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String uname, String password) {
        return userMapper.findUser(uname,password);
    }

}
