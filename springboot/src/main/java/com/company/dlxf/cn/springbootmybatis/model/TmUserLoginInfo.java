package com.company.dlxf.cn.springbootmybatis.model;

import java.util.Date;

public class TmUserLoginInfo {
    private String recordId;

    private String userId;

    private Date loginTime;

    private String loginIp;

    private String loginTarget;

    private Date logoutTime;

    private String logoutType;

    private String loginStatus;

    private String loginIndex;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    public String getLoginTarget() {
        return loginTarget;
    }

    public void setLoginTarget(String loginTarget) {
        this.loginTarget = loginTarget == null ? null : loginTarget.trim();
    }

    public Date getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Date logoutTime) {
        this.logoutTime = logoutTime;
    }

    public String getLogoutType() {
        return logoutType;
    }

    public void setLogoutType(String logoutType) {
        this.logoutType = logoutType == null ? null : logoutType.trim();
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus == null ? null : loginStatus.trim();
    }

    public String getLoginIndex() {
        return loginIndex;
    }

    public void setLoginIndex(String loginIndex) {
        this.loginIndex = loginIndex == null ? null : loginIndex.trim();
    }
}