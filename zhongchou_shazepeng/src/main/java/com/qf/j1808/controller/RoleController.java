package com.qf.j1808.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.j1808.pojo.Parameter;
import com.qf.j1808.pojo.RoleInfo;
import com.qf.j1808.pojo.UserInfo;
import com.qf.j1808.pojo.UserRole;
import com.qf.j1808.service.ParameterService;
import com.qf.j1808.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class RoleController {
    @Autowired
    RoleService roleService;
    @Autowired
    ParameterService parameterService;

    //查询所有角色
    @RequestMapping("getRoleInfo")
    public Object getRoleInfo(){
        List<RoleInfo> roleInfos = roleService.selectAllRole();
        return roleInfos;
    }

    @RequestMapping(value = "updateRoleInfo", method = RequestMethod.POST)
    public Object updateUserInfo(@RequestBody RoleInfo roleInfo) {
        roleService.undateRoleInfo(roleInfo);
        return true;
    }

    @RequestMapping("selectUid")
    public Object selectUid(@RequestParam int uid){
        return roleService.selectUid(uid);
    }
    @RequestMapping("selectNoUid")
    public Object selectNoUid(@RequestParam int uid){
        return roleService.selectNoUid(uid);
    }
    @RequestMapping("selectRoleByName")
    public Object selectRoleByName(@RequestParam String param){
        return roleService.selectRoleByName(param);
    }

    @RequestMapping(value = "insertUR",method = RequestMethod.POST)
    public void insertUR(@RequestBody UserRole userRole){
        roleService.insertUR(userRole);
    }
    @RequestMapping(value = "deleteUR",method = RequestMethod.POST)
    public void deleteUR(@RequestBody UserRole userRole){
        roleService.deleteUR(userRole);
    }

    @RequestMapping("selectMore")
    public Object selectMore(@RequestParam Integer page){
        Parameter parameter = parameterService.selectOneParameter();
        int pageSize = parameter.getParameterValue();
        PageHelper.startPage(page,pageSize);
        List<RoleInfo> roleInfos = roleService.selectAllRole();
        PageInfo<RoleInfo> pageInfo = new PageInfo(roleInfos);
        return pageInfo;
    }

}
