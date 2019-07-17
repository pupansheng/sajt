package com.pps.suanjiaotyong.pojo;

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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andGoodssizeIsNull() {
            addCriterion("goodssize is null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIsNotNull() {
            addCriterion("goodssize is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssizeEqualTo(String value) {
            addCriterion("goodssize =", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotEqualTo(String value) {
            addCriterion("goodssize <>", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThan(String value) {
            addCriterion("goodssize >", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeGreaterThanOrEqualTo(String value) {
            addCriterion("goodssize >=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThan(String value) {
            addCriterion("goodssize <", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLessThanOrEqualTo(String value) {
            addCriterion("goodssize <=", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeLike(String value) {
            addCriterion("goodssize like", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotLike(String value) {
            addCriterion("goodssize not like", value, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeIn(List<String> values) {
            addCriterion("goodssize in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotIn(List<String> values) {
            addCriterion("goodssize not in", values, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeBetween(String value1, String value2) {
            addCriterion("goodssize between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodssizeNotBetween(String value1, String value2) {
            addCriterion("goodssize not between", value1, value2, "goodssize");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNull() {
            addCriterion("goodsweight is null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIsNotNull() {
            addCriterion("goodsweight is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsweightEqualTo(Double value) {
            addCriterion("goodsweight =", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotEqualTo(Double value) {
            addCriterion("goodsweight <>", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThan(Double value) {
            addCriterion("goodsweight >", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsweight >=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThan(Double value) {
            addCriterion("goodsweight <", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightLessThanOrEqualTo(Double value) {
            addCriterion("goodsweight <=", value, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightIn(List<Double> values) {
            addCriterion("goodsweight in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotIn(List<Double> values) {
            addCriterion("goodsweight not in", values, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightBetween(Double value1, Double value2) {
            addCriterion("goodsweight between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andGoodsweightNotBetween(Double value1, Double value2) {
            addCriterion("goodsweight not between", value1, value2, "goodsweight");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andCompanyphoneIsNull() {
            addCriterion("companyphone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNotNull() {
            addCriterion("companyphone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneEqualTo(String value) {
            addCriterion("companyphone =", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotEqualTo(String value) {
            addCriterion("companyphone <>", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThan(String value) {
            addCriterion("companyphone >", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("companyphone >=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThan(String value) {
            addCriterion("companyphone <", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("companyphone <=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLike(String value) {
            addCriterion("companyphone like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotLike(String value) {
            addCriterion("companyphone not like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIn(List<String> values) {
            addCriterion("companyphone in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotIn(List<String> values) {
            addCriterion("companyphone not in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneBetween(String value1, String value2) {
            addCriterion("companyphone between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("companyphone not between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Double value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Double value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Double value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Double value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Double value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Double value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Double> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Double> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Double value1, Double value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Double value1, Double value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNull() {
            addCriterion("goodsprice is null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIsNotNull() {
            addCriterion("goodsprice is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspriceEqualTo(Double value) {
            addCriterion("goodsprice =", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotEqualTo(Double value) {
            addCriterion("goodsprice <>", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThan(Double value) {
            addCriterion("goodsprice >", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goodsprice >=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThan(Double value) {
            addCriterion("goodsprice <", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceLessThanOrEqualTo(Double value) {
            addCriterion("goodsprice <=", value, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceIn(List<Double> values) {
            addCriterion("goodsprice in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotIn(List<Double> values) {
            addCriterion("goodsprice not in", values, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceBetween(Double value1, Double value2) {
            addCriterion("goodsprice between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andGoodspriceNotBetween(Double value1, Double value2) {
            addCriterion("goodsprice not between", value1, value2, "goodsprice");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNull() {
            addCriterion("receivername is null");
            return (Criteria) this;
        }

        public Criteria andReceivernameIsNotNull() {
            addCriterion("receivername is not null");
            return (Criteria) this;
        }

        public Criteria andReceivernameEqualTo(String value) {
            addCriterion("receivername =", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotEqualTo(String value) {
            addCriterion("receivername <>", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThan(String value) {
            addCriterion("receivername >", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameGreaterThanOrEqualTo(String value) {
            addCriterion("receivername >=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThan(String value) {
            addCriterion("receivername <", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLessThanOrEqualTo(String value) {
            addCriterion("receivername <=", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameLike(String value) {
            addCriterion("receivername like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotLike(String value) {
            addCriterion("receivername not like", value, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameIn(List<String> values) {
            addCriterion("receivername in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotIn(List<String> values) {
            addCriterion("receivername not in", values, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameBetween(String value1, String value2) {
            addCriterion("receivername between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceivernameNotBetween(String value1, String value2) {
            addCriterion("receivername not between", value1, value2, "receivername");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneIsNull() {
            addCriterion("receiverphone is null");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneIsNotNull() {
            addCriterion("receiverphone is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneEqualTo(String value) {
            addCriterion("receiverphone =", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotEqualTo(String value) {
            addCriterion("receiverphone <>", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneGreaterThan(String value) {
            addCriterion("receiverphone >", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneGreaterThanOrEqualTo(String value) {
            addCriterion("receiverphone >=", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLessThan(String value) {
            addCriterion("receiverphone <", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLessThanOrEqualTo(String value) {
            addCriterion("receiverphone <=", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneLike(String value) {
            addCriterion("receiverphone like", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotLike(String value) {
            addCriterion("receiverphone not like", value, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneIn(List<String> values) {
            addCriterion("receiverphone in", values, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotIn(List<String> values) {
            addCriterion("receiverphone not in", values, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneBetween(String value1, String value2) {
            addCriterion("receiverphone between", value1, value2, "receiverphone");
            return (Criteria) this;
        }

        public Criteria andReceiverphoneNotBetween(String value1, String value2) {
            addCriterion("receiverphone not between", value1, value2, "receiverphone");
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