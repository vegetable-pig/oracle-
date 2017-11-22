package com.adsionli.oracle01.controller;

import com.adsionli.oracle01.bean.UserInfo;
import com.adsionli.oracle01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String index(){
        System.out.println("hello world");
        return "hello world!";
    }

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(String name,String password){
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        userInfo.setPassword(password);
        System.out.println(userInfo.getName());
        if (userService.addUser(userInfo)){
            return "success";
        }else {
            return "error";
        }
    }

    @RequestMapping("/getAll")
    public List<UserInfo> getAll(){
        System.out.println(userService.getAll().size());
        return userService.getAll();
    }
}
