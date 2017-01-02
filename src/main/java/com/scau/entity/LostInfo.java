package com.scau.entity;

import java.io.Serializable;
import java.util.Date;

public class LostInfo implements Serializable {
    private Long lostId;

    private String lostOwner;

    private String lostPhone;

    private Long lostCardNum;

    private Date lostDate;

    private static final long serialVersionUID = 1L;

    public Long getLostId() {
        return lostId;
    }

    public void setLostId(Long lostId) {
        this.lostId = lostId;
    }

    public String getLostOwner() {
        return lostOwner;
    }

    public void setLostOwner(String lostOwner) {
        this.lostOwner = lostOwner == null ? null : lostOwner.trim();
    }

    public String getLostPhone() {
        return lostPhone;
    }

    public void setLostPhone(String lostPhone) {
        this.lostPhone = lostPhone == null ? null : lostPhone.trim();
    }

    public Long getLostCardNum() {
        return lostCardNum;
    }

    public void setLostCardNum(Long lostCardNum) {
        this.lostCardNum = lostCardNum;
    }

    public Date getLostDate() {
        return lostDate;
    }

    public void setLostDate(Date lostDate) {
        this.lostDate = lostDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lostId=").append(lostId);
        sb.append(", lostOwner=").append(lostOwner);
        sb.append(", lostPhone=").append(lostPhone);
        sb.append(", lostCardNum=").append(lostCardNum);
        sb.append(", lostDate=").append(lostDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}