package com.bones.service;

import com.bones.pojo.User;

import java.util.List;

public interface UserService {
    User findUser(String uname, String password);

}
