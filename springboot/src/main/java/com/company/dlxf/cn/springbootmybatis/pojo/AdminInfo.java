package com.company.dlxf.cn.springbootmybatis.pojo;

import java.io.Serializable;

public class AdminInfo implements Serializable {
    private String userName;
    private String dateMin;
    private String dateMax;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
