package com.qf.j1808.pojo;

public class UserRole {

    int urid;
    int uid;
    int rid;

    @Override
    public String toString() {
        return "UserRole{" +
                "urid=" + urid +
                ", uid=" + uid +
                ", rid=" + rid +
                '}';
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
