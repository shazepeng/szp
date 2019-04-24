package com.qf.j1808.service.impl;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.mapper.MenuMapper;
import com.qf.j1808.service.MenuService;
import com.qf.j1808.vo.ImpowerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;

    public List<MenuDto> getAllMenu(int id) {
        return menuMapper.getAllMenu(id);
    }

    @Transactional
    public boolean impower(ImpowerVo impowerVo) {
        //根据roleId删除中间表数据
        menuMapper.romoveTempTableByRoleId(impowerVo.getRoleId());
        if(impowerVo.getMenus().size()>0){
            //根据roleId和menus循环插入中间表
            menuMapper.batchSave(impowerVo);
        }
        return true;
    }

    public boolean insertTempTable(ImpowerVo impowerVo) {
        menuMapper.batchSave(impowerVo);
        return true;
    }

}
