package com.qf.j1808.dto;

public class UserRoleDto {
    private int roleId;
    private String roleName;
    private int urid;
    private int uid;
    private int rid;

    @Override
    public String toString() {
        return "UserRoleDto{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", urid=" + urid +
                ", uid=" + uid +
                ", rid=" + rid +
                '}';
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getUrid() {
        return urid;
    }

    public void setUrid(int urid) {
        this.urid = urid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
