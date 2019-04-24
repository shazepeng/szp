package com.xa.menu.service;


import com.xa.menu.dto.MenuDto;
import com.xa.menu.vo.ImpowerVo;
import java.util.List;

public interface MenuService {
   public List<MenuDto> getAllMenu(int id);

   public boolean impower(ImpowerVo impowerVo);

   public boolean insertTempTable(ImpowerVo impowerVo);

}
