package com.company.dlxf.cn.springbootmybatis.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TmCustomerInfo {
    private String customerId;

    private String customerName;

    private String description;

    private String mobileNo;

    private String email;

    private String address;

    private String visitType;

    private String recommendPerson;

    private String status;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    private Date dateMin;

    private Date dateMax;

    private String updateBy;

    public Date getDateMin() {
        return dateMin;
    }

    public void setDateMin(Date dateMin) {
        this.dateMin = dateMin;
    }

    public Date getDateMax() {
        return dateMax;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo == null ? null : mobileNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    public String getRecommendPerson() {
        return recommendPerson;
    }

    public void setRecommendPerson(String recommendPerson) {
        this.recommendPerson = recommendPerson == null ? null : recommendPerson.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        return "TmCustomerInfo{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", description='" + description + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", visitType='" + visitType + '\'' +
                ", recommendPerson='" + recommendPerson + '\'' +
                ", status='" + status + '\'' +
                ", updateTime=" + updateTime +
                ", dateMin=" + dateMin +
                ", dateMax=" + dateMax +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}