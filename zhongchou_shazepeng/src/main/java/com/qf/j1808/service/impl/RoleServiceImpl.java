package com.qf.j1808.service.impl;

import com.qf.j1808.mapper.RoleMapper;
import com.qf.j1808.pojo.RoleInfo;
import com.qf.j1808.pojo.UserRole;
import com.qf.j1808.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    public List<RoleInfo> selectAllRole() {
        return roleMapper.selectAllRole();
    }

    public void undateRoleInfo(RoleInfo roleInfo) {
        roleMapper.undateRoleInfo(roleInfo);
    }

    public List<RoleInfo> selectUid(int uid) {
        return roleMapper.selectUid(uid);
    }

    public List<RoleInfo> selectNoUid(int uid) {
        return roleMapper.selectNoUid(uid);
    }

    public RoleInfo selectRoleByName(String param) {
        return roleMapper.selectRoleByName(param);
    }

    public void insertUR(UserRole userRole) {
        roleMapper.insertUR(userRole);
    }

    public void deleteUR(UserRole userRole) {
        roleMapper.deleteUR(userRole);
    }

}
