package com.xa.roleinfo.service;

import com.xa.menu.dto.MenuDto;

import java.util.List;

public interface UserRoleService {
    public List<MenuDto> selectRole(List<Integer> list);
}
