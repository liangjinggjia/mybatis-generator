package com.zhou.feidong.domian;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserActionLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserActionLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNull() {
            addCriterion("login_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginIdIsNotNull() {
            addCriterion("login_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIdEqualTo(String value) {
            addCriterion("login_id =", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotEqualTo(String value) {
            addCriterion("login_id <>", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThan(String value) {
            addCriterion("login_id >", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_id >=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThan(String value) {
            addCriterion("login_id <", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLessThanOrEqualTo(String value) {
            addCriterion("login_id <=", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdIn(List<String> values) {
            addCriterion("login_id in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotIn(List<String> values) {
            addCriterion("login_id not in", values, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdBetween(String value1, String value2) {
            addCriterion("login_id between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andLoginIdNotBetween(String value1, String value2) {
            addCriterion("login_id not between", value1, value2, "loginId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNull() {
            addCriterion("session_id is null");
            return (Criteria) this;
        }

        public Criteria andSessionIdIsNotNull() {
            addCriterion("session_id is not null");
            return (Criteria) this;
        }

        public Criteria andSessionIdEqualTo(String value) {
            addCriterion("session_id =", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotEqualTo(String value) {
            addCriterion("session_id <>", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThan(String value) {
            addCriterion("session_id >", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdGreaterThanOrEqualTo(String value) {
            addCriterion("session_id >=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThan(String value) {
            addCriterion("session_id <", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLessThanOrEqualTo(String value) {
            addCriterion("session_id <=", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdLike(String value) {
            addCriterion("session_id like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotLike(String value) {
            addCriterion("session_id not like", value, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdIn(List<String> values) {
            addCriterion("session_id in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotIn(List<String> values) {
            addCriterion("session_id not in", values, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdBetween(String value1, String value2) {
            addCriterion("session_id between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andSessionIdNotBetween(String value1, String value2) {
            addCriterion("session_id not between", value1, value2, "sessionId");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4IsNull() {
            addCriterion("ip_addr_v4 is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4IsNotNull() {
            addCriterion("ip_addr_v4 is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4EqualTo(String value) {
            addCriterion("ip_addr_v4 =", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4NotEqualTo(String value) {
            addCriterion("ip_addr_v4 <>", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4GreaterThan(String value) {
            addCriterion("ip_addr_v4 >", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4GreaterThanOrEqualTo(String value) {
            addCriterion("ip_addr_v4 >=", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4LessThan(String value) {
            addCriterion("ip_addr_v4 <", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4LessThanOrEqualTo(String value) {
            addCriterion("ip_addr_v4 <=", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4Like(String value) {
            addCriterion("ip_addr_v4 like", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4NotLike(String value) {
            addCriterion("ip_addr_v4 not like", value, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4In(List<String> values) {
            addCriterion("ip_addr_v4 in", values, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4NotIn(List<String> values) {
            addCriterion("ip_addr_v4 not in", values, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4Between(String value1, String value2) {
            addCriterion("ip_addr_v4 between", value1, value2, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV4NotBetween(String value1, String value2) {
            addCriterion("ip_addr_v4 not between", value1, value2, "ipAddrV4");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6IsNull() {
            addCriterion("ip_addr_v6 is null");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6IsNotNull() {
            addCriterion("ip_addr_v6 is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6EqualTo(String value) {
            addCriterion("ip_addr_v6 =", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6NotEqualTo(String value) {
            addCriterion("ip_addr_v6 <>", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6GreaterThan(String value) {
            addCriterion("ip_addr_v6 >", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6GreaterThanOrEqualTo(String value) {
            addCriterion("ip_addr_v6 >=", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6LessThan(String value) {
            addCriterion("ip_addr_v6 <", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6LessThanOrEqualTo(String value) {
            addCriterion("ip_addr_v6 <=", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6Like(String value) {
            addCriterion("ip_addr_v6 like", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6NotLike(String value) {
            addCriterion("ip_addr_v6 not like", value, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6In(List<String> values) {
            addCriterion("ip_addr_v6 in", values, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6NotIn(List<String> values) {
            addCriterion("ip_addr_v6 not in", values, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6Between(String value1, String value2) {
            addCriterion("ip_addr_v6 between", value1, value2, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andIpAddrV6NotBetween(String value1, String value2) {
            addCriterion("ip_addr_v6 not between", value1, value2, "ipAddrV6");
            return (Criteria) this;
        }

        public Criteria andOsNameIsNull() {
            addCriterion("os_name is null");
            return (Criteria) this;
        }

        public Criteria andOsNameIsNotNull() {
            addCriterion("os_name is not null");
            return (Criteria) this;
        }

        public Criteria andOsNameEqualTo(String value) {
            addCriterion("os_name =", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotEqualTo(String value) {
            addCriterion("os_name <>", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThan(String value) {
            addCriterion("os_name >", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameGreaterThanOrEqualTo(String value) {
            addCriterion("os_name >=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThan(String value) {
            addCriterion("os_name <", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLessThanOrEqualTo(String value) {
            addCriterion("os_name <=", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameLike(String value) {
            addCriterion("os_name like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotLike(String value) {
            addCriterion("os_name not like", value, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameIn(List<String> values) {
            addCriterion("os_name in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotIn(List<String> values) {
            addCriterion("os_name not in", values, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameBetween(String value1, String value2) {
            addCriterion("os_name between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andOsNameNotBetween(String value1, String value2) {
            addCriterion("os_name not between", value1, value2, "osName");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNull() {
            addCriterion("os_version is null");
            return (Criteria) this;
        }

        public Criteria andOsVersionIsNotNull() {
            addCriterion("os_version is not null");
            return (Criteria) this;
        }

        public Criteria andOsVersionEqualTo(String value) {
            addCriterion("os_version =", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotEqualTo(String value) {
            addCriterion("os_version <>", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThan(String value) {
            addCriterion("os_version >", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("os_version >=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThan(String value) {
            addCriterion("os_version <", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLessThanOrEqualTo(String value) {
            addCriterion("os_version <=", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionLike(String value) {
            addCriterion("os_version like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotLike(String value) {
            addCriterion("os_version not like", value, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionIn(List<String> values) {
            addCriterion("os_version in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotIn(List<String> values) {
            addCriterion("os_version not in", values, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionBetween(String value1, String value2) {
            addCriterion("os_version between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andOsVersionNotBetween(String value1, String value2) {
            addCriterion("os_version not between", value1, value2, "osVersion");
            return (Criteria) this;
        }

        public Criteria andBroNameIsNull() {
            addCriterion("bro_name is null");
            return (Criteria) this;
        }

        public Criteria andBroNameIsNotNull() {
            addCriterion("bro_name is not null");
            return (Criteria) this;
        }

        public Criteria andBroNameEqualTo(String value) {
            addCriterion("bro_name =", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameNotEqualTo(String value) {
            addCriterion("bro_name <>", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameGreaterThan(String value) {
            addCriterion("bro_name >", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameGreaterThanOrEqualTo(String value) {
            addCriterion("bro_name >=", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameLessThan(String value) {
            addCriterion("bro_name <", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameLessThanOrEqualTo(String value) {
            addCriterion("bro_name <=", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameLike(String value) {
            addCriterion("bro_name like", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameNotLike(String value) {
            addCriterion("bro_name not like", value, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameIn(List<String> values) {
            addCriterion("bro_name in", values, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameNotIn(List<String> values) {
            addCriterion("bro_name not in", values, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameBetween(String value1, String value2) {
            addCriterion("bro_name between", value1, value2, "broName");
            return (Criteria) this;
        }

        public Criteria andBroNameNotBetween(String value1, String value2) {
            addCriterion("bro_name not between", value1, value2, "broName");
            return (Criteria) this;
        }

        public Criteria andBroVersionIsNull() {
            addCriterion("bro_version is null");
            return (Criteria) this;
        }

        public Criteria andBroVersionIsNotNull() {
            addCriterion("bro_version is not null");
            return (Criteria) this;
        }

        public Criteria andBroVersionEqualTo(String value) {
            addCriterion("bro_version =", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionNotEqualTo(String value) {
            addCriterion("bro_version <>", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionGreaterThan(String value) {
            addCriterion("bro_version >", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionGreaterThanOrEqualTo(String value) {
            addCriterion("bro_version >=", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionLessThan(String value) {
            addCriterion("bro_version <", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionLessThanOrEqualTo(String value) {
            addCriterion("bro_version <=", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionLike(String value) {
            addCriterion("bro_version like", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionNotLike(String value) {
            addCriterion("bro_version not like", value, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionIn(List<String> values) {
            addCriterion("bro_version in", values, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionNotIn(List<String> values) {
            addCriterion("bro_version not in", values, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionBetween(String value1, String value2) {
            addCriterion("bro_version between", value1, value2, "broVersion");
            return (Criteria) this;
        }

        public Criteria andBroVersionNotBetween(String value1, String value2) {
            addCriterion("bro_version not between", value1, value2, "broVersion");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNull() {
            addCriterion("request_body is null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIsNotNull() {
            addCriterion("request_body is not null");
            return (Criteria) this;
        }

        public Criteria andRequestBodyEqualTo(String value) {
            addCriterion("request_body =", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotEqualTo(String value) {
            addCriterion("request_body <>", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThan(String value) {
            addCriterion("request_body >", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyGreaterThanOrEqualTo(String value) {
            addCriterion("request_body >=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThan(String value) {
            addCriterion("request_body <", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLessThanOrEqualTo(String value) {
            addCriterion("request_body <=", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyLike(String value) {
            addCriterion("request_body like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotLike(String value) {
            addCriterion("request_body not like", value, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyIn(List<String> values) {
            addCriterion("request_body in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotIn(List<String> values) {
            addCriterion("request_body not in", values, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyBetween(String value1, String value2) {
            addCriterion("request_body between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andRequestBodyNotBetween(String value1, String value2) {
            addCriterion("request_body not between", value1, value2, "requestBody");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andMethodIsNull() {
            addCriterion("method is null");
            return (Criteria) this;
        }

        public Criteria andMethodIsNotNull() {
            addCriterion("method is not null");
            return (Criteria) this;
        }

        public Criteria andMethodEqualTo(String value) {
            addCriterion("method =", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotEqualTo(String value) {
            addCriterion("method <>", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThan(String value) {
            addCriterion("method >", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodGreaterThanOrEqualTo(String value) {
            addCriterion("method >=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThan(String value) {
            addCriterion("method <", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLessThanOrEqualTo(String value) {
            addCriterion("method <=", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodLike(String value) {
            addCriterion("method like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotLike(String value) {
            addCriterion("method not like", value, "method");
            return (Criteria) this;
        }

        public Criteria andMethodIn(List<String> values) {
            addCriterion("method in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotIn(List<String> values) {
            addCriterion("method not in", values, "method");
            return (Criteria) this;
        }

        public Criteria andMethodBetween(String value1, String value2) {
            addCriterion("method between", value1, value2, "method");
            return (Criteria) this;
        }

        public Criteria andMethodNotBetween(String value1, String value2) {
            addCriterion("method not between", value1, value2, "method");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}