package com.humanresources.bean;

import java.util.Date;

public class Attendance {
    private Integer id;

    private Date worktime;

    private Date afterworktime;

    private Integer userid;

    private Integer workstateid;

    private Integer afterstateid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public Date getAfterworktime() {
        return afterworktime;
    }

    public void setAfterworktime(Date afterworktime) {
        this.afterworktime = afterworktime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getWorkstateid() {
        return workstateid;
    }

    public void setWorkstateid(Integer workstateid) {
        this.workstateid = workstateid;
    }

    public Integer getAfterstateid() {
        return afterstateid;
    }

    public void setAfterstateid(Integer afterstateid) {
        this.afterstateid = afterstateid;
    }
}