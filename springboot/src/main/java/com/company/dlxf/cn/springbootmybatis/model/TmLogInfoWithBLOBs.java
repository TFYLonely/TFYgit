package com.company.dlxf.cn.springbootmybatis.model;

public class TmLogInfoWithBLOBs extends TmLogInfo {
    private String logRequestInfo;

    private String logResponseInfo;

    public String getLogRequestInfo() {
        return logRequestInfo;
    }

    public void setLogRequestInfo(String logRequestInfo) {
        this.logRequestInfo = logRequestInfo == null ? null : logRequestInfo.trim();
    }

    public String getLogResponseInfo() {
        return logResponseInfo;
    }

    public void setLogResponseInfo(String logResponseInfo) {
        this.logResponseInfo = logResponseInfo == null ? null : logResponseInfo.trim();
    }
}