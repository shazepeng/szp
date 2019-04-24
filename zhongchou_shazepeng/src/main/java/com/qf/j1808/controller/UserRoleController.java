package com.qf.j1808.controller;

import com.qf.j1808.dto.MenuDto;
import com.qf.j1808.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;

    @RequestMapping("selectRole")
    public Object selectRole(@RequestParam String id){
        String[] st=id.split(",");
        List<Integer> param=new ArrayList<Integer>();
        for (int i=0;i<st.length;i++){
            if(st[i]!=null&&st[i]!=""){
                param.add(Integer.valueOf(st[i]));
            }
        }
        List<MenuDto> list = userRoleService.selectRole(param);
        for(int i=0;i<list.size();i++){
            MenuDto menuDto = list.get(i);
            List<MenuDto> children = menuDto.getChildren();
            int p=0;
            for (int j=0;j<children.size();j++){
                MenuDto dto = children.get(j);
                if(dto.isChecked()){
                    p++;
                }
                if(p>0){
                    menuDto.setChecked("true");
                }
            }
        }
        return list;
    }
}
