package com.qf.j1808.pojo;

import java.util.List;

public class MenuInfo {
    private int menuId;
    private String menuName;
    private String url;
    private int upid;
    private String icon;
    List<MenuInfo> children;

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", upid=" + upid +
                ", icon='" + icon + '\'' +
                ", children=" + children +
                '}';
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getUpid() {
        return upid;
    }

    public void setUpid(int upid) {
        this.upid = upid;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<MenuInfo> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInfo> children) {
        this.children = children;
    }
}

