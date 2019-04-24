package com.qf.j1808.controller;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.service.MenuService;
import com.qf.j1808.vo.ImpowerVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    MenuService menuService;

    @RequestMapping("getAllMenu")
    public Object getAllMenu(@RequestParam int id) {
        List<MenuDto> menuList = menuService.getAllMenu(id);
        for (int i = 0; i < menuList.size(); i++) {
            MenuDto menuDto = menuList.get(i);
            int total = menuDto.getChildren() != null ? menuDto.getChildren().size() : 0;
            int count = 0;
            if (total > 0) {
                for (int j = 0; j < menuDto.getChildren().size(); j++) {
                    MenuDto menuDto1 = menuDto.getChildren().get(j);
                    if (menuDto1.isChecked()) {
                        count++;
                    }
                }
            }
            if (count > 0) {
                menuDto.setChecked("true");
            }
        }
        return menuList;
    }

    @RequestMapping(value = "impower", method = RequestMethod.POST)
    public Object impower(@RequestBody ImpowerVo impowerVo) {
        menuService.impower(impowerVo);
        return true;
    }
}
