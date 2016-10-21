package com.scau.entity;

import java.io.Serializable;
import java.sql.Date;

public class NoticeInfo implements Serializable {
    private Long noticeId;

    private String noticeTitle;

    private Date noticeDate;

    private String noticeEditor;

    private String noticeIden;

    private String noticeDesc;

    private static final long serialVersionUID = 1L;

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle == null ? null : noticeTitle.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public String getNoticeEditor() {
        return noticeEditor;
    }

    public void setNoticeEditor(String noticeEditor) {
        this.noticeEditor = noticeEditor == null ? null : noticeEditor.trim();
    }

    public String getNoticeIden() {
        return noticeIden;
    }

    public void setNoticeIden(String noticeIden) {
        this.noticeIden = noticeIden == null ? null : noticeIden.trim();
    }

    public String getNoticeDesc() {
        return noticeDesc;
    }

    public void setNoticeDesc(String noticeDesc) {
        this.noticeDesc = noticeDesc == null ? null : noticeDesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noticeId=").append(noticeId);
        sb.append(", noticeTitle=").append(noticeTitle);
        sb.append(", noticeDate=").append(noticeDate);
        sb.append(", noticeEditor=").append(noticeEditor);
        sb.append(", noticeIden=").append(noticeIden);
        sb.append(", noticeDesc=").append(noticeDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}