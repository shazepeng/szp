package com.qf.j1808.dto;

public class RaiseDto {
    int raiseId;
    String raiseName;
    String applyName;
    String raiseMoney;
    String raiseDay;

    @Override
    public String toString() {
        return "RaiseDto{" +
                "raiseId=" + raiseId +
                ", raiseName='" + raiseName + '\'' +
                ", applyName='" + applyName + '\'' +
                ", raiseMoney='" + raiseMoney + '\'' +
                ", raiseDay='" + raiseDay + '\'' +
                '}';
    }

    public int getRaiseId() {
        return raiseId;
    }

    public void setRaiseId(int raiseId) {
        this.raiseId = raiseId;
    }

    public String getRaiseName() {
        return raiseName;
    }

    public void setRaiseName(String raiseName) {
        this.raiseName = raiseName;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getRaiseMoney() {
        return raiseMoney;
    }

    public void setRaiseMoney(String raiseMoney) {
        this.raiseMoney = raiseMoney;
    }

    public String getRaiseDay() {
        return raiseDay;
    }

    public void setRaiseDay(String raiseDay) {
        this.raiseDay = raiseDay;
    }
}
