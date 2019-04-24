package com.xa.menu.vo;

import java.util.List;

public class ImpowerVo {
    int roleId;
    List<Integer> menus;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public List<Integer> getMenus() {
        return menus;
    }

    public void setMenus(List<Integer> menus) {
        this.menus = menus;
    }

    @Override
    public String toString() {
        return "ImpowerVo{" +
                "roleId=" + roleId +
                ", menus=" + menus +
                '}';
    }
}
