package com.scau.entity;

import java.io.Serializable;

public class ClubInfo implements Serializable {
    private Long clubId;

    private String clubName;

    private String clubLogo;

    private String clubWebsite;

    private String clubWeixinNum;

    private String clubDesc;

    private static final long serialVersionUID = 1L;

    public Long getClubId() {
        return clubId;
    }

    public void setClubId(Long clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName == null ? null : clubName.trim();
    }

    public String getClubLogo() {
        return clubLogo;
    }

    public void setClubLogo(String clubLogo) {
        this.clubLogo = clubLogo == null ? null : clubLogo.trim();
    }

    public String getClubWebsite() {
        return clubWebsite;
    }

    public void setClubWebsite(String clubWebsite) {
        this.clubWebsite = clubWebsite == null ? null : clubWebsite.trim();
    }

    public String getClubWeixinNum() {
        return clubWeixinNum;
    }

    public void setClubWeixinNum(String clubWeixinNum) {
        this.clubWeixinNum = clubWeixinNum == null ? null : clubWeixinNum.trim();
    }

    public String getClubDesc() {
        return clubDesc;
    }

    public void setClubDesc(String clubDesc) {
        this.clubDesc = clubDesc == null ? null : clubDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clubId=").append(clubId);
        sb.append(", clubName=").append(clubName);
        sb.append(", clubLogo=").append(clubLogo);
        sb.append(", clubWebsite=").append(clubWebsite);
        sb.append(", clubWeixinNum=").append(clubWeixinNum);
        sb.append(", clubDesc=").append(clubDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}