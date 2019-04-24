package com.qf.j1808.service;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.vo.ImpowerVo;

import java.util.List;

public interface MenuService {
    public List<MenuDto> getAllMenu(int id);

    public boolean impower(ImpowerVo impowerVo);

    public boolean insertTempTable(ImpowerVo impowerVo);
}
