package com.qf.j1808.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

public class ApplyVo implements Serializable {

    private int applyId;
    private String applyType;
    @Pattern(regexp = "^\\S{1,}$",message = "输入不能为空")
    private String applyName;
    @Pattern(regexp = "^\\d{17}[\\d|x]|\\d{15}$",message = "请输入正确的身份证号码")
    private String applyIdCard;
    @Pattern(regexp = "^1[34578]\\d{9}$",message = "请输入正确的手机号码")
    private String applyPhone;
    @NotNull(message = "输入不能为空")
    private String applyPic;
    @Pattern(regexp = "^\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}$",message = "请输入正确的邮箱格式")
    private String applyEmail;
    private int userId;

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

    @Override
    public String toString() {
        return "ApplyVo{" +
                "applyId=" + applyId +
                ", applyType='" + applyType + '\'' +
                ", applyName='" + applyName + '\'' +
                ", applyIdCard='" + applyIdCard + '\'' +
                ", applyPhone='" + applyPhone + '\'' +
                ", applyPic='" + applyPic + '\'' +
                ", applyEmail='" + applyEmail + '\'' +
                ", userId=" + userId +
                '}';
    }
}
