package com.qf.j1808.pojo;

public class Apply {
    int applyId;
    String applyType;
    String applyName;
    String applyIdCard;
    String applyPhone;
    String applyPic;
    String applyEmail;
    int userId;
    String applyCheck;

    @Override
    public String toString() {
        return "Apply{" +
                "applyId=" + applyId +
                ", applyType='" + applyType + '\'' +
                ", applyName='" + applyName + '\'' +
                ", applyIdCard='" + applyIdCard + '\'' +
                ", applyPhone='" + applyPhone + '\'' +
                ", applyPic='" + applyPic + '\'' +
                ", applyEmail='" + applyEmail + '\'' +
                ", userId=" + userId +
                ", applyCheck='" + applyCheck + '\'' +
                '}';
    }

    public String getApplyCheck() {
        return applyCheck;
    }

    public void setApplyCheck(String applyCheck) {
        this.applyCheck = applyCheck;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getApplyIdCard() {
        return applyIdCard;
    }

    public void setApplyIdCard(String applyIdCard) {
        this.applyIdCard = applyIdCard;
    }

    public String getApplyPhone() {
        return applyPhone;
    }

    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    public String getApplyPic() {
        return applyPic;
    }

    public void setApplyPic(String applyPic) {
        this.applyPic = applyPic;
    }

    public String getApplyEmail() {
        return applyEmail;
    }

    public void setApplyEmail(String applyEmail) {
        this.applyEmail = applyEmail;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
