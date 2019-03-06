package com.company.dlxf.cn.springbootmybatis.pojo;

import java.io.Serializable;

public class CustomerInfo implements Serializable {

    private String customerName;

    private String dateMin;

    private String dateMax;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateMin() {
        return dateMin;
    }

    public void setDateMin(String dateMin) {
        this.dateMin = dateMin;
    }

    public String getDateMax() {
        return dateMax;
    }

    public void setDateMax(String dateMax) {
        this.dateMax = dateMax;
    }

    @Override
    public String toString() {
        return "CustomerInfo{" +
                "customerName='" + customerName + '\'' +
                ", dateMin='" + dateMin + '\'' +
                ", dateMax='" + dateMax + '\'' +
                '}';
    }
}
