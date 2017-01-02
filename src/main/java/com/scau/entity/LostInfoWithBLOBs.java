package com.scau.entity;

import java.io.Serializable;

public class LostInfoWithBLOBs extends LostInfo implements Serializable {
    private String lostImage;

    private String lostDesc;

    private static final long serialVersionUID = 1L;

    public String getLostImage() {
        return lostImage;
    }

    public void setLostImage(String lostImage) {
        this.lostImage = lostImage == null ? null : lostImage.trim();
    }

    public String getLostDesc() {
        return lostDesc;
    }

    public void setLostDesc(String lostDesc) {
        this.lostDesc = lostDesc == null ? null : lostDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", lostImage=").append(lostImage);
        sb.append(", lostDesc=").append(lostDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}