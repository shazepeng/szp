package com.qf.j1808.vo;

import javax.validation.constraints.Pattern;

public class RaiseVo {

    private String raiseType;
    private String raiseName;
    private String raiseInfo;
    private String raiseMoney;
    private String raiseDay;
    private String mySelf;
    private String dateiled;
    private String contactNumber;
    private String serviceTel;
    private String reportType;
    private String reportMoney;
    private String reportContent;
    private String reportNumber;
    private String singlePurchase;
    private String freight;
    private String invoice;
    private String reportTime;
    private int userId;
    private String raisePic;


    @Override
    public String toString() {
        return "RaiseVo{" +
                "raiseType='" + raiseType + '\'' +
                ", raiseName='" + raiseName + '\'' +
                ", raiseInfo='" + raiseInfo + '\'' +
                ", raiseMoney='" + raiseMoney + '\'' +
                ", raiseDay='" + raiseDay + '\'' +
                ", mySelf='" + mySelf + '\'' +
                ", dateiled='" + dateiled + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", serviceTel='" + serviceTel + '\'' +
                ", reportType='" + reportType + '\'' +
                ", reportMoney='" + reportMoney + '\'' +
                ", reportContent='" + reportContent + '\'' +
                ", reportNumber='" + reportNumber + '\'' +
                ", singlePurchase='" + singlePurchase + '\'' +
                ", freight='" + freight + '\'' +
                ", invoice='" + invoice + '\'' +
                ", reportTime='" + reportTime + '\'' +
                ", userId=" + userId +
                ", raisePic='" + raisePic + '\'' +
                '}';
    }

    public String getRaisePic() {
        return raisePic;
    }

    public void setRaisePic(String raisePic) {
        this.raisePic = raisePic;
    }

    public String getRaiseType() {
        return raiseType;
    }

    public void setRaiseType(String raiseType) {
        this.raiseType = raiseType;
    }

    public String getRaiseName() {
        return raiseName;
    }

    public void setRaiseName(String raiseName) {
        this.raiseName = raiseName;
    }

    public String getRaiseInfo() {
        return raiseInfo;
    }

    public void setRaiseInfo(String raiseInfo) {
        this.raiseInfo = raiseInfo;
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

    public String getMySelf() {
        return mySelf;
    }

    public void setMySelf(String mySelf) {
        this.mySelf = mySelf;
    }

    public String getDateiled() {
        return dateiled;
    }

    public void setDateiled(String dateiled) {
        this.dateiled = dateiled;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportMoney() {
        return reportMoney;
    }

    public void setReportMoney(String reportMoney) {
        this.reportMoney = reportMoney;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(String reportNumber) {
        this.reportNumber = reportNumber;
    }

    public String getSinglePurchase() {
        return singlePurchase;
    }

    public void setSinglePurchase(String singlePurchase) {
        this.singlePurchase = singlePurchase;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
