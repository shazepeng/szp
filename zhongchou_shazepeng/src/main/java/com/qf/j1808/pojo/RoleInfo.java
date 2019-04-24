package com.qf.j1808.pojo;

public class RoleInfo {
    int roleId;
    String roleName;
    String state;

    @Override
    public String toString() {
        return "RoleInfo{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
