package com.adsionli.oracle01.mapper;


import com.adsionli.oracle01.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserInfo> getAll();

    public void addUser(UserInfo user);

}
