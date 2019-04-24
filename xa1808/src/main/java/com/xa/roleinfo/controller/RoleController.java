package com.xa.roleinfo.controller;

import com.xa.roleinfo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping("getAllRoleInfo")
    public Object getAllRoleInfo(){
        return roleService.getAllRoleInfo();
    }
}
