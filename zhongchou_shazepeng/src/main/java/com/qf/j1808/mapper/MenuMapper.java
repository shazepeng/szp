package com.qf.j1808.mapper;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.vo.ImpowerVo;

import java.util.List;

public interface MenuMapper {
    public List<MenuDto> getAllMenu(int id);

    public void romoveTempTableByRoleId(int rid);

    public void batchSave(ImpowerVo impowerVo);
}
