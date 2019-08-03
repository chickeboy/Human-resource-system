package com.humanresources.bean;

import java.util.Date;

public class Interview {
    private Integer id;

    private Integer resumeid;

    private Integer recruitmentid;

    private Date interviewtime;

    private Integer interview;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getResumeid() {
        return resumeid;
    }

    public void setResumeid(Integer resumeid) {
        this.resumeid = resumeid;
    }

    public Integer getRecruitmentid() {
        return recruitmentid;
    }

    public void setRecruitmentid(Integer recruitmentid) {
        this.recruitmentid = recruitmentid;
    }

    public Date getInterviewtime() {
        return interviewtime;
    }

    public void setInterviewtime(Date interviewtime) {
        this.interviewtime = interviewtime;
    }

    public Integer getInterview() {
        return interview;
    }

    public void setInterview(Integer interview) {
        this.interview = interview;
    }
}