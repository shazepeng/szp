package com.xa.roleinfo.service.impl;

import com.xa.menu.dto.MenuDto;
import com.xa.roleinfo.mapper.UserRoleMapper;
import com.xa.roleinfo.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired(required = false)
    UserRoleMapper userRoleMapper;


    public List<MenuDto> selectRole(List<Integer> list) {
        return userRoleMapper.selectRole(list);
    }
}
