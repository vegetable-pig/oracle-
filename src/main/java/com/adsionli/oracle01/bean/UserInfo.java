package com.adsionli.oracle01.bean;

public class UserInfo {
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        return "UserInfo[username="+name+",password="+password+"]";
    }
}
