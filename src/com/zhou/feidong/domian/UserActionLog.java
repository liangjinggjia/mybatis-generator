package com.zhou.feidong.domian;

import java.util.Date;

public class UserActionLog {
    private Integer id;

    private String loginId;

    private String sessionId;

    private Date time;

    private String ipAddrV4;

    private String ipAddrV6;

    private String osName;

    private String osVersion;

    private String broName;

    private String broVersion;

    private String requestBody;

    private String description;

    private String other;

    private String method;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getIpAddrV4() {
        return ipAddrV4;
    }

    public void setIpAddrV4(String ipAddrV4) {
        this.ipAddrV4 = ipAddrV4 == null ? null : ipAddrV4.trim();
    }

    public String getIpAddrV6() {
        return ipAddrV6;
    }

    public void setIpAddrV6(String ipAddrV6) {
        this.ipAddrV6 = ipAddrV6 == null ? null : ipAddrV6.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion == null ? null : osVersion.trim();
    }

    public String getBroName() {
        return broName;
    }

    public void setBroName(String broName) {
        this.broName = broName == null ? null : broName.trim();
    }

    public String getBroVersion() {
        return broVersion;
    }

    public void setBroVersion(String broVersion) {
        this.broVersion = broVersion == null ? null : broVersion.trim();
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody == null ? null : requestBody.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}