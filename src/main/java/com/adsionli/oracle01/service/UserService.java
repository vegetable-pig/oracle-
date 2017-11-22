package com.adsionli.oracle01.service;


import com.adsionli.oracle01.bean.UserInfo;

import java.util.List;

public interface UserService {
    public List<UserInfo> getAll();
    public boolean addUser(UserInfo user);
}
