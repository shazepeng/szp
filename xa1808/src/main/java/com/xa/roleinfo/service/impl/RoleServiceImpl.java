package com.xa.roleinfo.service.impl;

import com.xa.pojo.RoleInfo;
import com.xa.roleinfo.mapper.RoleInfoMapper;
import com.xa.roleinfo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired(required = false)
    RoleInfoMapper roleInfoDao;

    public List<RoleInfo> getAllRoleInfo() {
        return roleInfoDao.getAllRoleInfo();
    }

}
