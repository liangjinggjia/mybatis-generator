package com.zhou.springcrud.domian;

import java.util.Date;

public class Projectdetail {
    private Integer projectdetailId;

    private Integer employeeId;

    private Date startdate;

    private Date overdate;

    private String picture;

    private String context;

    public Integer getProjectdetailId() {
        return projectdetailId;
    }

    public void setProjectdetailId(Integer projectdetailId) {
        this.projectdetailId = projectdetailId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getOverdate() {
        return overdate;
    }

    public void setOverdate(Date overdate) {
        this.overdate = overdate;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}