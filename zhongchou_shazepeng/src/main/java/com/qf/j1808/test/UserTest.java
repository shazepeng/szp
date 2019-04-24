package com.qf.j1808.test;

import com.qf.j1808.pojo.Parameter;
import com.qf.j1808.pojo.UserInfo;
import com.qf.j1808.service.ParameterService;
import com.qf.j1808.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
//        UserService userService = context.getBean(UserService.class);
//        List<UserInfo> userInfos = userService.selectAll();
//        System.out.println(userInfos);
        ParameterService bean = context.getBean(ParameterService.class);
        Parameter parameter = bean.selectOneParameter();
        System.out.println(parameter);
    }
}
