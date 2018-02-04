package com.medicine.menu.domain;

import java.util.Date;

public class MeetingListDO {
    private String meetingId;

    private String meetingName;

    private Date cteateTime;

    private Date lastModifyTime;

    private Date mettingStartTime;

    private String mettingSit;

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId == null ? null : meetingId.trim();
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName == null ? null : meetingName.trim();
    }

    public Date getCteateTime() {
        return cteateTime;
    }

    public void setCteateTime(Date cteateTime) {
        this.cteateTime = cteateTime;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Date getMettingStartTime() {
        return mettingStartTime;
    }

    public void setMettingStartTime(Date mettingStartTime) {
        this.mettingStartTime = mettingStartTime;
    }

    public String getMettingSit() {
        return mettingSit;
    }

    public void setMettingSit(String mettingSit) {
        this.mettingSit = mettingSit == null ? null : mettingSit.trim();
    }

    @Override
    public String toString() {
        return "MeetingListDO{" +
                "meetingId='" + meetingId + '\'' +
                ", meetingName='" + meetingName + '\'' +
                ", cteateTime=" + cteateTime +
                ", lastModifyTime=" + lastModifyTime +
                ", mettingStartTime=" + mettingStartTime +
                ", mettingSit='" + mettingSit + '\'' +
                '}';
    }
}
