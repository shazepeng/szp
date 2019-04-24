package com.xa.userinfo;

import com.xa.pojo.UserInfo;
import com.xa.userinfo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        UserService userService = context.getBean(UserService.class);
//        List<UserInfo> userInfos = userService.getAllUserInfo();
//        System.out.println(userInfos);
//        UserInfo userInfo = new UserInfo();
//        userInfo.setAccount("张三");
//        userInfo.setUserName("zhangsan");
//        userInfo.setPassword("111111");
//        userInfo.setEmail("zs@qq.com");
//        userService.addUserInfo(userInfo);
//        userService.deleteUserInfoByid(4);
        UserInfo userinfo = userService.getOneUserInfoByid(5);
        System.out.println(userinfo);
//        userinfo.setEmail("wzb@qq.com");
//        userinfo.setUserName("wzb");
//        userinfo.setPassword("111111");
//        userinfo.setAccount("王振博");
//        userService.updateUserInfo(userinfo);
    }
}
