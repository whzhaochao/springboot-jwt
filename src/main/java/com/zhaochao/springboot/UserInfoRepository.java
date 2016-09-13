package com.zhaochao.springboot;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 2016/9/13.
 */


public class UserInfoRepository {
    UserInfo findUserInfoByName(String name){
        UserInfo userInfo=new UserInfo();
        userInfo.setName("test");
        userInfo.setPassword("test");
        userInfo.setRole("test");
        userInfo.setSalt("test");

        return  userInfo;
    }
}
