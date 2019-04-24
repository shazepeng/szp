package com.xa.menu.mapper;

import com.xa.menu.dto.MenuDto;
import com.xa.menu.vo.ImpowerVo;

import java.util.List;

public interface MenuMapper {
    public List<MenuDto> getAllMenu(int id);

    public void romoveTempTableByRoleId(int rid);

    public void batchSave(ImpowerVo impowerVo);

}
