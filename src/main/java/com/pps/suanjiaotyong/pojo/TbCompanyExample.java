package com.pps.suanjiaotyong.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCompanyExample() {
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

        public Criteria andCompanynameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyName =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyName <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyName like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyName not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyName in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyAddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyAddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyAddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyAddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyAddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyAddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyAddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyAddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyAddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyAddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyAddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceIsNull() {
            addCriterion("companyLicence is null");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceIsNotNull() {
            addCriterion("companyLicence is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceEqualTo(String value) {
            addCriterion("companyLicence =", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceNotEqualTo(String value) {
            addCriterion("companyLicence <>", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceGreaterThan(String value) {
            addCriterion("companyLicence >", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceGreaterThanOrEqualTo(String value) {
            addCriterion("companyLicence >=", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceLessThan(String value) {
            addCriterion("companyLicence <", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceLessThanOrEqualTo(String value) {
            addCriterion("companyLicence <=", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceLike(String value) {
            addCriterion("companyLicence like", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceNotLike(String value) {
            addCriterion("companyLicence not like", value, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceIn(List<String> values) {
            addCriterion("companyLicence in", values, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceNotIn(List<String> values) {
            addCriterion("companyLicence not in", values, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceBetween(String value1, String value2) {
            addCriterion("companyLicence between", value1, value2, "companylicence");
            return (Criteria) this;
        }

        public Criteria andCompanylicenceNotBetween(String value1, String value2) {
            addCriterion("companyLicence not between", value1, value2, "companylicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceIsNull() {
            addCriterion("accountLicence is null");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceIsNotNull() {
            addCriterion("accountLicence is not null");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceEqualTo(String value) {
            addCriterion("accountLicence =", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceNotEqualTo(String value) {
            addCriterion("accountLicence <>", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceGreaterThan(String value) {
            addCriterion("accountLicence >", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceGreaterThanOrEqualTo(String value) {
            addCriterion("accountLicence >=", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceLessThan(String value) {
            addCriterion("accountLicence <", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceLessThanOrEqualTo(String value) {
            addCriterion("accountLicence <=", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceLike(String value) {
            addCriterion("accountLicence like", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceNotLike(String value) {
            addCriterion("accountLicence not like", value, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceIn(List<String> values) {
            addCriterion("accountLicence in", values, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceNotIn(List<String> values) {
            addCriterion("accountLicence not in", values, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceBetween(String value1, String value2) {
            addCriterion("accountLicence between", value1, value2, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andAccountlicenceNotBetween(String value1, String value2) {
            addCriterion("accountLicence not between", value1, value2, "accountlicence");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardIsNull() {
            addCriterion("CorporateIdentityCard is null");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardIsNotNull() {
            addCriterion("CorporateIdentityCard is not null");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardEqualTo(String value) {
            addCriterion("CorporateIdentityCard =", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardNotEqualTo(String value) {
            addCriterion("CorporateIdentityCard <>", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardGreaterThan(String value) {
            addCriterion("CorporateIdentityCard >", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardGreaterThanOrEqualTo(String value) {
            addCriterion("CorporateIdentityCard >=", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardLessThan(String value) {
            addCriterion("CorporateIdentityCard <", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardLessThanOrEqualTo(String value) {
            addCriterion("CorporateIdentityCard <=", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardLike(String value) {
            addCriterion("CorporateIdentityCard like", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardNotLike(String value) {
            addCriterion("CorporateIdentityCard not like", value, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardIn(List<String> values) {
            addCriterion("CorporateIdentityCard in", values, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardNotIn(List<String> values) {
            addCriterion("CorporateIdentityCard not in", values, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardBetween(String value1, String value2) {
            addCriterion("CorporateIdentityCard between", value1, value2, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCorporateidentitycardNotBetween(String value1, String value2) {
            addCriterion("CorporateIdentityCard not between", value1, value2, "corporateidentitycard");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameIsNull() {
            addCriterion("companyLinkName is null");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameIsNotNull() {
            addCriterion("companyLinkName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameEqualTo(String value) {
            addCriterion("companyLinkName =", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameNotEqualTo(String value) {
            addCriterion("companyLinkName <>", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameGreaterThan(String value) {
            addCriterion("companyLinkName >", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameGreaterThanOrEqualTo(String value) {
            addCriterion("companyLinkName >=", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameLessThan(String value) {
            addCriterion("companyLinkName <", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameLessThanOrEqualTo(String value) {
            addCriterion("companyLinkName <=", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameLike(String value) {
            addCriterion("companyLinkName like", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameNotLike(String value) {
            addCriterion("companyLinkName not like", value, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameIn(List<String> values) {
            addCriterion("companyLinkName in", values, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameNotIn(List<String> values) {
            addCriterion("companyLinkName not in", values, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameBetween(String value1, String value2) {
            addCriterion("companyLinkName between", value1, value2, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanylinknameNotBetween(String value1, String value2) {
            addCriterion("companyLinkName not between", value1, value2, "companylinkname");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNull() {
            addCriterion("companyPhone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIsNotNull() {
            addCriterion("companyPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneEqualTo(String value) {
            addCriterion("companyPhone =", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotEqualTo(String value) {
            addCriterion("companyPhone <>", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThan(String value) {
            addCriterion("companyPhone >", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("companyPhone >=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThan(String value) {
            addCriterion("companyPhone <", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLessThanOrEqualTo(String value) {
            addCriterion("companyPhone <=", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneLike(String value) {
            addCriterion("companyPhone like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotLike(String value) {
            addCriterion("companyPhone not like", value, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneIn(List<String> values) {
            addCriterion("companyPhone in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotIn(List<String> values) {
            addCriterion("companyPhone not in", values, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneBetween(String value1, String value2) {
            addCriterion("companyPhone between", value1, value2, "companyphone");
            return (Criteria) this;
        }

        public Criteria andCompanyphoneNotBetween(String value1, String value2) {
            addCriterion("companyPhone not between", value1, value2, "companyphone");
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