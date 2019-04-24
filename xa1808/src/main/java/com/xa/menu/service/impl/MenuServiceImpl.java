package com.xa.menu.service.impl;

import com.xa.menu.dto.MenuDto;
import com.xa.menu.mapper.MenuMapper;
import com.xa.menu.service.MenuService;
import com.xa.menu.vo.ImpowerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired(required = false)
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
