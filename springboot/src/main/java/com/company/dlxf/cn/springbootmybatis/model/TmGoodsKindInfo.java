package com.company.dlxf.cn.springbootmybatis.model;

import java.util.Date;

public class TmGoodsKindInfo {
    private String recordId;

    private String kindNo;

    private String kindName;

    private String status;

    private String kindDesc;

    private Date updateTime;

    private String updateBy;

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId == null ? null : recordId.trim();
    }

    public String getKindNo() {
        return kindNo;
    }

    public void setKindNo(String kindNo) {
        this.kindNo = kindNo == null ? null : kindNo.trim();
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName == null ? null : kindName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getKindDesc() {
        return kindDesc;
    }

    public void setKindDesc(String kindDesc) {
        this.kindDesc = kindDesc == null ? null : kindDesc.trim();
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
}