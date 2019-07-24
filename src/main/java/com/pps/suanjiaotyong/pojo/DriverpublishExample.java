package com.pps.suanjiaotyong.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DriverpublishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverpublishExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNull() {
            addCriterion("linkName is null");
            return (Criteria) this;
        }

        public Criteria andLinknameIsNotNull() {
            addCriterion("linkName is not null");
            return (Criteria) this;
        }

        public Criteria andLinknameEqualTo(String value) {
            addCriterion("linkName =", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotEqualTo(String value) {
            addCriterion("linkName <>", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThan(String value) {
            addCriterion("linkName >", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameGreaterThanOrEqualTo(String value) {
            addCriterion("linkName >=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThan(String value) {
            addCriterion("linkName <", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLessThanOrEqualTo(String value) {
            addCriterion("linkName <=", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameLike(String value) {
            addCriterion("linkName like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotLike(String value) {
            addCriterion("linkName not like", value, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameIn(List<String> values) {
            addCriterion("linkName in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotIn(List<String> values) {
            addCriterion("linkName not in", values, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameBetween(String value1, String value2) {
            addCriterion("linkName between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinknameNotBetween(String value1, String value2) {
            addCriterion("linkName not between", value1, value2, "linkname");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNull() {
            addCriterion("linkPhone is null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIsNotNull() {
            addCriterion("linkPhone is not null");
            return (Criteria) this;
        }

        public Criteria andLinkphoneEqualTo(String value) {
            addCriterion("linkPhone =", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotEqualTo(String value) {
            addCriterion("linkPhone <>", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThan(String value) {
            addCriterion("linkPhone >", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneGreaterThanOrEqualTo(String value) {
            addCriterion("linkPhone >=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThan(String value) {
            addCriterion("linkPhone <", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLessThanOrEqualTo(String value) {
            addCriterion("linkPhone <=", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneLike(String value) {
            addCriterion("linkPhone like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotLike(String value) {
            addCriterion("linkPhone not like", value, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneIn(List<String> values) {
            addCriterion("linkPhone in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotIn(List<String> values) {
            addCriterion("linkPhone not in", values, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneBetween(String value1, String value2) {
            addCriterion("linkPhone between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andLinkphoneNotBetween(String value1, String value2) {
            addCriterion("linkPhone not between", value1, value2, "linkphone");
            return (Criteria) this;
        }

        public Criteria andCarlengthIsNull() {
            addCriterion("carLength is null");
            return (Criteria) this;
        }

        public Criteria andCarlengthIsNotNull() {
            addCriterion("carLength is not null");
            return (Criteria) this;
        }

        public Criteria andCarlengthEqualTo(Double value) {
            addCriterion("carLength =", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotEqualTo(Double value) {
            addCriterion("carLength <>", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthGreaterThan(Double value) {
            addCriterion("carLength >", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthGreaterThanOrEqualTo(Double value) {
            addCriterion("carLength >=", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthLessThan(Double value) {
            addCriterion("carLength <", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthLessThanOrEqualTo(Double value) {
            addCriterion("carLength <=", value, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthIn(List<Double> values) {
            addCriterion("carLength in", values, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotIn(List<Double> values) {
            addCriterion("carLength not in", values, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthBetween(Double value1, Double value2) {
            addCriterion("carLength between", value1, value2, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarlengthNotBetween(Double value1, Double value2) {
            addCriterion("carLength not between", value1, value2, "carlength");
            return (Criteria) this;
        }

        public Criteria andCarwidthIsNull() {
            addCriterion("carWidth is null");
            return (Criteria) this;
        }

        public Criteria andCarwidthIsNotNull() {
            addCriterion("carWidth is not null");
            return (Criteria) this;
        }

        public Criteria andCarwidthEqualTo(Double value) {
            addCriterion("carWidth =", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthNotEqualTo(Double value) {
            addCriterion("carWidth <>", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthGreaterThan(Double value) {
            addCriterion("carWidth >", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthGreaterThanOrEqualTo(Double value) {
            addCriterion("carWidth >=", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthLessThan(Double value) {
            addCriterion("carWidth <", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthLessThanOrEqualTo(Double value) {
            addCriterion("carWidth <=", value, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthIn(List<Double> values) {
            addCriterion("carWidth in", values, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthNotIn(List<Double> values) {
            addCriterion("carWidth not in", values, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthBetween(Double value1, Double value2) {
            addCriterion("carWidth between", value1, value2, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarwidthNotBetween(Double value1, Double value2) {
            addCriterion("carWidth not between", value1, value2, "carwidth");
            return (Criteria) this;
        }

        public Criteria andCarheightIsNull() {
            addCriterion("carHeight is null");
            return (Criteria) this;
        }

        public Criteria andCarheightIsNotNull() {
            addCriterion("carHeight is not null");
            return (Criteria) this;
        }

        public Criteria andCarheightEqualTo(Double value) {
            addCriterion("carHeight =", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightNotEqualTo(Double value) {
            addCriterion("carHeight <>", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightGreaterThan(Double value) {
            addCriterion("carHeight >", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightGreaterThanOrEqualTo(Double value) {
            addCriterion("carHeight >=", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightLessThan(Double value) {
            addCriterion("carHeight <", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightLessThanOrEqualTo(Double value) {
            addCriterion("carHeight <=", value, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightIn(List<Double> values) {
            addCriterion("carHeight in", values, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightNotIn(List<Double> values) {
            addCriterion("carHeight not in", values, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightBetween(Double value1, Double value2) {
            addCriterion("carHeight between", value1, value2, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarheightNotBetween(Double value1, Double value2) {
            addCriterion("carHeight not between", value1, value2, "carheight");
            return (Criteria) this;
        }

        public Criteria andCarweightIsNull() {
            addCriterion("carWeight is null");
            return (Criteria) this;
        }

        public Criteria andCarweightIsNotNull() {
            addCriterion("carWeight is not null");
            return (Criteria) this;
        }

        public Criteria andCarweightEqualTo(Double value) {
            addCriterion("carWeight =", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightNotEqualTo(Double value) {
            addCriterion("carWeight <>", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightGreaterThan(Double value) {
            addCriterion("carWeight >", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightGreaterThanOrEqualTo(Double value) {
            addCriterion("carWeight >=", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightLessThan(Double value) {
            addCriterion("carWeight <", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightLessThanOrEqualTo(Double value) {
            addCriterion("carWeight <=", value, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightIn(List<Double> values) {
            addCriterion("carWeight in", values, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightNotIn(List<Double> values) {
            addCriterion("carWeight not in", values, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightBetween(Double value1, Double value2) {
            addCriterion("carWeight between", value1, value2, "carweight");
            return (Criteria) this;
        }

        public Criteria andCarweightNotBetween(Double value1, Double value2) {
            addCriterion("carWeight not between", value1, value2, "carweight");
            return (Criteria) this;
        }

        public Criteria andNeedtypeIsNull() {
            addCriterion("needType is null");
            return (Criteria) this;
        }

        public Criteria andNeedtypeIsNotNull() {
            addCriterion("needType is not null");
            return (Criteria) this;
        }

        public Criteria andNeedtypeEqualTo(String value) {
            addCriterion("needType =", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeNotEqualTo(String value) {
            addCriterion("needType <>", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeGreaterThan(String value) {
            addCriterion("needType >", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeGreaterThanOrEqualTo(String value) {
            addCriterion("needType >=", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeLessThan(String value) {
            addCriterion("needType <", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeLessThanOrEqualTo(String value) {
            addCriterion("needType <=", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeLike(String value) {
            addCriterion("needType like", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeNotLike(String value) {
            addCriterion("needType not like", value, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeIn(List<String> values) {
            addCriterion("needType in", values, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeNotIn(List<String> values) {
            addCriterion("needType not in", values, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeBetween(String value1, String value2) {
            addCriterion("needType between", value1, value2, "needtype");
            return (Criteria) this;
        }

        public Criteria andNeedtypeNotBetween(String value1, String value2) {
            addCriterion("needType not between", value1, value2, "needtype");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNull() {
            addCriterion("carType is null");
            return (Criteria) this;
        }

        public Criteria andCartypeIsNotNull() {
            addCriterion("carType is not null");
            return (Criteria) this;
        }

        public Criteria andCartypeEqualTo(String value) {
            addCriterion("carType =", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotEqualTo(String value) {
            addCriterion("carType <>", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThan(String value) {
            addCriterion("carType >", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeGreaterThanOrEqualTo(String value) {
            addCriterion("carType >=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThan(String value) {
            addCriterion("carType <", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLessThanOrEqualTo(String value) {
            addCriterion("carType <=", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeLike(String value) {
            addCriterion("carType like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotLike(String value) {
            addCriterion("carType not like", value, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeIn(List<String> values) {
            addCriterion("carType in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotIn(List<String> values) {
            addCriterion("carType not in", values, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeBetween(String value1, String value2) {
            addCriterion("carType between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andCartypeNotBetween(String value1, String value2) {
            addCriterion("carType not between", value1, value2, "cartype");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNull() {
            addCriterion("fromAddress is null");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNotNull() {
            addCriterion("fromAddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddressEqualTo(String value) {
            addCriterion("fromAddress =", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotEqualTo(String value) {
            addCriterion("fromAddress <>", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThan(String value) {
            addCriterion("fromAddress >", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fromAddress >=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThan(String value) {
            addCriterion("fromAddress <", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThanOrEqualTo(String value) {
            addCriterion("fromAddress <=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLike(String value) {
            addCriterion("fromAddress like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotLike(String value) {
            addCriterion("fromAddress not like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressIn(List<String> values) {
            addCriterion("fromAddress in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotIn(List<String> values) {
            addCriterion("fromAddress not in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressBetween(String value1, String value2) {
            addCriterion("fromAddress between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotBetween(String value1, String value2) {
            addCriterion("fromAddress not between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("toAddress is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("toAddress is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("toAddress =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("toAddress <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("toAddress >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("toAddress >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("toAddress <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("toAddress <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("toAddress like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("toAddress not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("toAddress in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("toAddress not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("toAddress between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("toAddress not between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andRouteIsNull() {
            addCriterion("route is null");
            return (Criteria) this;
        }

        public Criteria andRouteIsNotNull() {
            addCriterion("route is not null");
            return (Criteria) this;
        }

        public Criteria andRouteEqualTo(String value) {
            addCriterion("route =", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotEqualTo(String value) {
            addCriterion("route <>", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThan(String value) {
            addCriterion("route >", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteGreaterThanOrEqualTo(String value) {
            addCriterion("route >=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThan(String value) {
            addCriterion("route <", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLessThanOrEqualTo(String value) {
            addCriterion("route <=", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteLike(String value) {
            addCriterion("route like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotLike(String value) {
            addCriterion("route not like", value, "route");
            return (Criteria) this;
        }

        public Criteria andRouteIn(List<String> values) {
            addCriterion("route in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotIn(List<String> values) {
            addCriterion("route not in", values, "route");
            return (Criteria) this;
        }

        public Criteria andRouteBetween(String value1, String value2) {
            addCriterion("route between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andRouteNotBetween(String value1, String value2) {
            addCriterion("route not between", value1, value2, "route");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIsNull() {
            addCriterion("loadTime is null");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIsNotNull() {
            addCriterion("loadTime is not null");
            return (Criteria) this;
        }

        public Criteria andLoadtimeEqualTo(Date value) {
            addCriterion("loadTime =", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotEqualTo(Date value) {
            addCriterion("loadTime <>", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeGreaterThan(Date value) {
            addCriterion("loadTime >", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loadTime >=", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeLessThan(Date value) {
            addCriterion("loadTime <", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeLessThanOrEqualTo(Date value) {
            addCriterion("loadTime <=", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIn(List<Date> values) {
            addCriterion("loadTime in", values, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotIn(List<Date> values) {
            addCriterion("loadTime not in", values, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeBetween(Date value1, Date value2) {
            addCriterion("loadTime between", value1, value2, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotBetween(Date value1, Date value2) {
            addCriterion("loadTime not between", value1, value2, "loadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIsNull() {
            addCriterion("unLoadTime is null");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIsNotNull() {
            addCriterion("unLoadTime is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeEqualTo(Date value) {
            addCriterion("unLoadTime =", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotEqualTo(Date value) {
            addCriterion("unLoadTime <>", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeGreaterThan(Date value) {
            addCriterion("unLoadTime >", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unLoadTime >=", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeLessThan(Date value) {
            addCriterion("unLoadTime <", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeLessThanOrEqualTo(Date value) {
            addCriterion("unLoadTime <=", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIn(List<Date> values) {
            addCriterion("unLoadTime in", values, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotIn(List<Date> values) {
            addCriterion("unLoadTime not in", values, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeBetween(Date value1, Date value2) {
            addCriterion("unLoadTime between", value1, value2, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotBetween(Date value1, Date value2) {
            addCriterion("unLoadTime not between", value1, value2, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLeverIsNull() {
            addCriterion("lever is null");
            return (Criteria) this;
        }

        public Criteria andLeverIsNotNull() {
            addCriterion("lever is not null");
            return (Criteria) this;
        }

        public Criteria andLeverEqualTo(Integer value) {
            addCriterion("lever =", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotEqualTo(Integer value) {
            addCriterion("lever <>", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThan(Integer value) {
            addCriterion("lever >", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverGreaterThanOrEqualTo(Integer value) {
            addCriterion("lever >=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThan(Integer value) {
            addCriterion("lever <", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverLessThanOrEqualTo(Integer value) {
            addCriterion("lever <=", value, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverIn(List<Integer> values) {
            addCriterion("lever in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotIn(List<Integer> values) {
            addCriterion("lever not in", values, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverBetween(Integer value1, Integer value2) {
            addCriterion("lever between", value1, value2, "lever");
            return (Criteria) this;
        }

        public Criteria andLeverNotBetween(Integer value1, Integer value2) {
            addCriterion("lever not between", value1, value2, "lever");
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