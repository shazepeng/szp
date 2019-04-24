package com.qf.j1808.service.impl;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.mapper.UserRoleMapper;
import com.qf.j1808.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleMapper userRoleMapper;

    public List<MenuDto> selectRole(List<Integer> list) {
        return userRoleMapper.selectRole(list);
    }
}
