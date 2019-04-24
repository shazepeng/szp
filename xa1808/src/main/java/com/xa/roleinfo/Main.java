package com.xa.roleinfo;

import com.xa.pojo.RoleInfo;
import com.xa.roleinfo.service.RoleService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml", "spring-service.xml");
        RoleService roleService = context.getBean(RoleService.class);
//        RoleInfo roleInfo = new RoleInfo();
//        roleInfo.setRoleName("法师");
//        roleService.addRoleInfo(roleInfo);
//        roleService.deleteRoleInfo(4);
//        List<RoleInfo> allRoleInfo = roleService.getAllRoleInfo();
//        System.out.println(allRoleInfo);
//        RoleInfo oneRoleInfo = roleService.getOneRoleInfo(5);
//        System.out.println(oneRoleInfo);
//        oneRoleInfo.setRoleName("后勤");
//        roleService.updateRoleInfo(oneRoleInfo);
    }
}
