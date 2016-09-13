package com.zhaochao.springboot;

/**
 * Created by Administrator on 2016/9/13.
 */
public class UserInfo {
    private  String password;
    private String name;

    public void setRole(String role) {
        this.role = role;
    }

    private String role;
    private String salt;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRole() {
        return role;
    }
}
