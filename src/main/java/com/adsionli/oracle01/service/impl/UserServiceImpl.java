package com.adsionli.oracle01.service.impl;

import com.adsionli.oracle01.bean.UserInfo;
import com.adsionli.oracle01.mapper.UserMapper;
import com.adsionli.oracle01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserInfo> getAll() {
        return userMapper.getAll();
    }

    @Override
    public boolean addUser(UserInfo user) {
        System.out.println(user.toString());
        if (user.getPassword().equals("")||user.getName().equals("")){
            return false;
        }
        userMapper.addUser(user);
        return true;
    }
}
