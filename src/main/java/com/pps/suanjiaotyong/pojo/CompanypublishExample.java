package com.pps.suanjiaotyong.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanypublishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanypublishExample() {
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsName is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsName is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsName =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsName <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsName >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsName >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsName <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsName <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsName like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsName not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsName in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsName not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsName between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsName not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodslengthIsNull() {
            addCriterion("goodsLength is null");
            return (Criteria) this;
        }

        public Criteria andGoodslengthIsNotNull() {
            addCriterion("goodsLength is not null");
            return (Criteria) this;
        }

        public Criteria andGoodslengthEqualTo(Double value) {
            addCriterion("goodsLength =", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthNotEqualTo(Double value) {
            addCriterion("goodsLength <>", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthGreaterThan(Double value) {
            addCriterion("goodsLength >", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsLength >=", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthLessThan(Double value) {
            addCriterion("goodsLength <", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthLessThanOrEqualTo(Double value) {
            addCriterion("goodsLength <=", value, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthIn(List<Double> values) {
            addCriterion("goodsLength in", values, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthNotIn(List<Double> values) {
            addCriterion("goodsLength not in", values, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthBetween(Double value1, Double value2) {
            addCriterion("goodsLength between", value1, value2, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodslengthNotBetween(Double value1, Double value2) {
            addCriterion("goodsLength not between", value1, value2, "goodslength");
            return (Criteria) this;
        }

        public Criteria andGoodsheightIsNull() {
            addCriterion("goodsHeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsheightIsNotNull() {
            addCriterion("goodsHeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsheightEqualTo(Double value) {
            addCriterion("goodsHeight =", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightNotEqualTo(Double value) {
            addCriterion("goodsHeight <>", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightGreaterThan(Double value) {
            addCriterion("goodsHeight >", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsHeight >=", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightLessThan(Double value) {
            addCriterion("goodsHeight <", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightLessThanOrEqualTo(Double value) {
            addCriterion("goodsHeight <=", value, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightIn(List<Double> values) {
            addCriterion("goodsHeight in", values, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightNotIn(List<Double> values) {
            addCriterion("goodsHeight not in", values, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightBetween(Double value1, Double value2) {
            addCriterion("goodsHeight between", value1, value2, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodsheightNotBetween(Double value1, Double value2) {
            addCriterion("goodsHeight not between", value1, value2, "goodsheight");
            return (Criteria) this;
        }

        public Criteria andGoodswidthIsNull() {
            addCriterion("goodsWidth is null");
            return (Criteria) this;
        }

        public Criteria andGoodswidthIsNotNull() {
            addCriterion("goodsWidth is not null");
            return (Criteria) this;
        }

        public Criteria andGoodswidthEqualTo(Double value) {
            addCriterion("goodsWidth =", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthNotEqualTo(Double value) {
            addCriterion("goodsWidth <>", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthGreaterThan(Double value) {
            addCriterion("goodsWidth >", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsWidth >=", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthLessThan(Double value) {
            addCriterion("goodsWidth <", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthLessThanOrEqualTo(Double value) {
            addCriterion("goodsWidth <=", value, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthIn(List<Double> values) {
            addCriterion("goodsWidth in", values, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthNotIn(List<Double> values) {
            addCriterion("goodsWidth not in", values, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthBetween(Double value1, Double value2) {
            addCriterion("goodsWidth between", value1, value2, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodswidthNotBetween(Double value1, Double value2) {
            addCriterion("goodsWidth not between", value1, value2, "goodswidth");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("goodsWeight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("goodsWeight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(Double value) {
            addCriterion("goodsWeight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(Double value) {
            addCriterion("goodsWeight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(Double value) {
            addCriterion("goodsWeight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsWeight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(Double value) {
            addCriterion("goodsWeight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(Double value) {
            addCriterion("goodsWeight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<Double> values) {
            addCriterion("goodsWeight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<Double> values) {
            addCriterion("goodsWeight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(Double value1, Double value2) {
            addCriterion("goodsWeight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(Double value1, Double value2) {
            addCriterion("goodsWeight not between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIsNull() {
            addCriterion("goodsAmount is null");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIsNotNull() {
            addCriterion("goodsAmount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsamountEqualTo(Integer value) {
            addCriterion("goodsAmount =", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotEqualTo(Integer value) {
            addCriterion("goodsAmount <>", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountGreaterThan(Integer value) {
            addCriterion("goodsAmount >", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodsAmount >=", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountLessThan(Integer value) {
            addCriterion("goodsAmount <", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountLessThanOrEqualTo(Integer value) {
            addCriterion("goodsAmount <=", value, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountIn(List<Integer> values) {
            addCriterion("goodsAmount in", values, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotIn(List<Integer> values) {
            addCriterion("goodsAmount not in", values, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountBetween(Integer value1, Integer value2) {
            addCriterion("goodsAmount between", value1, value2, "goodsamount");
            return (Criteria) this;
        }

        public Criteria andGoodsamountNotBetween(Integer value1, Integer value2) {
            addCriterion("goodsAmount not between", value1, value2, "goodsamount");
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

        public Criteria andFromaddressIsNull() {
            addCriterion("fromaddress is null");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNotNull() {
            addCriterion("fromaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddressEqualTo(String value) {
            addCriterion("fromaddress =", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotEqualTo(String value) {
            addCriterion("fromaddress <>", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThan(String value) {
            addCriterion("fromaddress >", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fromaddress >=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThan(String value) {
            addCriterion("fromaddress <", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThanOrEqualTo(String value) {
            addCriterion("fromaddress <=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLike(String value) {
            addCriterion("fromaddress like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotLike(String value) {
            addCriterion("fromaddress not like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressIn(List<String> values) {
            addCriterion("fromaddress in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotIn(List<String> values) {
            addCriterion("fromaddress not in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressBetween(String value1, String value2) {
            addCriterion("fromaddress between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotBetween(String value1, String value2) {
            addCriterion("fromaddress not between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("toaddress is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("toaddress is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("toaddress =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("toaddress <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("toaddress >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("toaddress >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("toaddress <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("toaddress <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("toaddress like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("toaddress not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("toaddress in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("toaddress not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("toaddress between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("toaddress not between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIsNull() {
            addCriterion("loadtime is null");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIsNotNull() {
            addCriterion("loadtime is not null");
            return (Criteria) this;
        }

        public Criteria andLoadtimeEqualTo(Date value) {
            addCriterion("loadtime =", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotEqualTo(Date value) {
            addCriterion("loadtime <>", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeGreaterThan(Date value) {
            addCriterion("loadtime >", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loadtime >=", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeLessThan(Date value) {
            addCriterion("loadtime <", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeLessThanOrEqualTo(Date value) {
            addCriterion("loadtime <=", value, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeIn(List<Date> values) {
            addCriterion("loadtime in", values, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotIn(List<Date> values) {
            addCriterion("loadtime not in", values, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeBetween(Date value1, Date value2) {
            addCriterion("loadtime between", value1, value2, "loadtime");
            return (Criteria) this;
        }

        public Criteria andLoadtimeNotBetween(Date value1, Date value2) {
            addCriterion("loadtime not between", value1, value2, "loadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIsNull() {
            addCriterion("unloadtime is null");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIsNotNull() {
            addCriterion("unloadtime is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeEqualTo(Date value) {
            addCriterion("unloadtime =", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotEqualTo(Date value) {
            addCriterion("unloadtime <>", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeGreaterThan(Date value) {
            addCriterion("unloadtime >", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unloadtime >=", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeLessThan(Date value) {
            addCriterion("unloadtime <", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeLessThanOrEqualTo(Date value) {
            addCriterion("unloadtime <=", value, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeIn(List<Date> values) {
            addCriterion("unloadtime in", values, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotIn(List<Date> values) {
            addCriterion("unloadtime not in", values, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeBetween(Date value1, Date value2) {
            addCriterion("unloadtime between", value1, value2, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andUnloadtimeNotBetween(Date value1, Date value2) {
            addCriterion("unloadtime not between", value1, value2, "unloadtime");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsPrice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsPrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsPrice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsPrice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsPrice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsPrice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsPrice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsPrice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsPrice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsPrice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsPrice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsPrice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceIsNull() {
            addCriterion("accountPrice is null");
            return (Criteria) this;
        }

        public Criteria andAccountpriceIsNotNull() {
            addCriterion("accountPrice is not null");
            return (Criteria) this;
        }

        public Criteria andAccountpriceEqualTo(BigDecimal value) {
            addCriterion("accountPrice =", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceNotEqualTo(BigDecimal value) {
            addCriterion("accountPrice <>", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceGreaterThan(BigDecimal value) {
            addCriterion("accountPrice >", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("accountPrice >=", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceLessThan(BigDecimal value) {
            addCriterion("accountPrice <", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("accountPrice <=", value, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceIn(List<BigDecimal> values) {
            addCriterion("accountPrice in", values, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceNotIn(List<BigDecimal> values) {
            addCriterion("accountPrice not in", values, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountPrice between", value1, value2, "accountprice");
            return (Criteria) this;
        }

        public Criteria andAccountpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("accountPrice not between", value1, value2, "accountprice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Integer value) {
            addCriterion("invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Integer value) {
            addCriterion("invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Integer value) {
            addCriterion("invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Integer value) {
            addCriterion("invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Integer value) {
            addCriterion("invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Integer> values) {
            addCriterion("invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Integer> values) {
            addCriterion("invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Integer value1, Integer value2) {
            addCriterion("invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("payType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("payType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("payType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("payType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("payType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("payType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("payType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("payType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("payType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("payType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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