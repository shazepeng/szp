package com.xa.roleinfo.mapper;

import com.xa.menu.dto.MenuDto;

import java.util.List;

public interface UserRoleMapper {
    public List<MenuDto> selectRole(List<Integer> list);
}
