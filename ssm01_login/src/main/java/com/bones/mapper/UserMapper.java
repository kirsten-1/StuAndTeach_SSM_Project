package com.bones.mapper;

import com.bones.pojo.User;

import java.util.List;

public interface UserMapper {
    User findUser(String uname, String password);

}
