package com.qf.j1808.pojo;

public class Cret {
    int cretId;
    String cretName;

    @Override
    public String toString() {
        return "Cret{" +
                "cretId=" + cretId +
                ", cretName='" + cretName + '\'' +
                '}';
    }

    public int getCretId() {
        return cretId;
    }

    public void setCretId(int cretId) {
        this.cretId = cretId;
    }

    public String getCretName() {
        return cretName;
    }

    public void setCretName(String cretName) {
        this.cretName = cretName;
    }
}
