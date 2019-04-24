package com.qf.j1808.service;

import com.qf.j1808.dto.MenuDto;

import java.util.List;

public interface UserRoleService {
    public List<MenuDto> selectRole(List<Integer> list);
}
