package com.qf.j1808.mapper;

import com.qf.j1808.dto.MenuDto;

import java.util.List;

public interface UserRoleMapper {
    public List<MenuDto> selectRole(List<Integer> list);


}
