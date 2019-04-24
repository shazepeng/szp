package com.qf.j1808.pojo;

public class UserRaise {
    int id;
    int userId;
    int raiseId;

    @Override
    public String toString() {
        return "UserRaise{" +
                "id=" + id +
                ", userId=" + userId +
                ", raiseId=" + raiseId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRaiseId() {
        return raiseId;
    }

    public void setRaiseId(int raiseId) {
        this.raiseId = raiseId;
    }
}
