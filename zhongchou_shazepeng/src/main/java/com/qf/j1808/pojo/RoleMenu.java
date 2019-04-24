package com.qf.j1808.pojo;

public class RoleMenu {

    int rmid;
    int rid;
    int mid;

    @Override
    public String toString() {
        return "RoleMenu{" +
                "rmid=" + rmid +
                ", rid=" + rid +
                ", mid=" + mid +
                '}';
    }

    public int getRmid() {
        return rmid;
    }

    public void setRmid(int rmid) {
        this.rmid = rmid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
}
